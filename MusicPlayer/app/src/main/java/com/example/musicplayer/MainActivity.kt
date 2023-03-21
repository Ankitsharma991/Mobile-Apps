package com.example.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer : MediaPlayer
    var  totalTime : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val btnPlay = findViewById<ImageView>(R.id.play)
        val btnStop = findViewById<ImageView>(R.id.stop)
        val btnPause = findViewById<ImageView>(R.id.pause)
        val btnSeekBar = findViewById<SeekBar>(R.id.seekBar)

        mediaPlayer = MediaPlayer.create(this, R.raw.music)
        mediaPlayer.setVolume(1f,1f)
        mediaPlayer.isLooping = true
        totalTime = mediaPlayer.duration



        btnPlay.setOnClickListener{
            mediaPlayer.start()
        }

        btnPause.setOnClickListener{
            mediaPlayer.pause()
        }

        btnStop.setOnClickListener{
            mediaPlayer?.stop()
            mediaPlayer.reset()
            mediaPlayer.release()
//            finish()
        }

        // when user changes the time stamp of the music, it should reflect that change
        btnSeekBar.max = totalTime
        btnSeekBar.setOnSeekBarChangeListener(/* l = */ object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if(fromUser){
                    mediaPlayer.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        // change the seekbar player on music play
        val handler = Handler()
        handler.postDelayed( object : Runnable{
            override fun run(){
                try{
                    btnSeekBar.progress = mediaPlayer.currentPosition
                    handler.postDelayed(this, 1000)
                }
                catch (exception : Exception){
                    btnSeekBar.progress = 0
                }
            }

        }, 0)
    }
}
