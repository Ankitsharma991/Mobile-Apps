package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
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
    }
}