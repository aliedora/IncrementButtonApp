package com.e.incrementbuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val incrementBtn = findViewById<Button>(R.id.btnIncrement)
        incrementBtn.setOnClickListener{
            incrementNumber()
        }
    }

    private fun incrementNumber(){
        val count= findViewById<TextView>(R.id.count)
        currentCount++
        count.text = currentCount.toString()
    }
}