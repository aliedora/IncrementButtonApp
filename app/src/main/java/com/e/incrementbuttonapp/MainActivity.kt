package com.e.incrementbuttonapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var currentCount = 0

    companion object {
        const val OK_URL = "https://m.ok.ru/"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val incrementBtn = findViewById<Button>(R.id.btnIncrement)
        incrementBtn.setOnClickListener {
            incrementNumber()
        }

        val linkBtn = findViewById<TextView>(R.id.link)
        linkBtn.text = OK_URL
        linkBtn.setOnClickListener {
            openLink()
        }

    }

    private fun incrementNumber() {
        val count = findViewById<TextView>(R.id.count)
        currentCount++
        count.text = currentCount.toString()
    }

    private fun openLink() {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(OK_URL))
        startActivity(browserIntent)
    }
}