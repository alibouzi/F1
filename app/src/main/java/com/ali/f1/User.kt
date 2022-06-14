package com.ali.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_inf)
        val button = findViewById<Button>(R.id.btnStar)
        button.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            // start your next activity Home
            startActivity(intent)
        }
    }
}