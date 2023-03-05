package com.example.listview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Complete Project")
        taskList.add("Buy things from Market")
        taskList.add("Watch Lectures")
        taskList.add("Practice DSA")

        val adapterForListView = ArrayAdapter(this,  android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterForListView

        listView.setOnItemClickListener { parent, view, position, id ->
            val text = (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

        dialog = Dialog(this)
        dialog.setContentView(R.layout.add_task)

        val btnAdd = findViewById<Button>(R.id.addTask)
        btnAdd.setOnClickListener {
            dialog.show()
            val addButton = dialog.findViewById<Button>(R.id.add)
            val cancelButton = dialog.findViewById<Button>(R.id.cancel)

            cancelButton.setOnClickListener {
                Toast.makeText(this, "Task Cancelled", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            addButton.setOnClickListener {
                val taskText = dialog.findViewById<TextView>(R.id.task)
                if(taskText.text != ""){
                    taskList.add(taskText.text.toString())
                    Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                    taskText.text = ""
                }
                else{
                    Toast.makeText(this, "Enter valid task", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

//
//<TextView
//android:id="@+id/textView2"
//android:layout_width="match_parent"
//android:layout_height="wrap_content"
//android:layout_margin="10dp"
//android:text="@string/note_click_on_the_task_to_remove_it_from_the_bucket"
//android:textAlignment="center"
//android:textColor="#F35353"
//android:textSize="12sp"
//app:layout_constraintBottom_toBottomOf="parent"
//app:layout_constraintTop_toBottomOf="@+id/addTask"
//tools:ignore="MissingConstraints"
//tools:layout_editor_absoluteX="45dp" />