package com.example.homework1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_page)


        val number = intent.getStringExtra("number")
        val message = intent.getStringExtra("message")

        val textViewNumber = findViewById<TextView>(R.id.textViewNumber)
        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)

        textViewNumber.setText(number)
        textViewMessage.setText(message)

        val btn = findViewById<Button>(R.id.btnViewClear)

        btn.setOnClickListener {
            textViewNumber.setText("")
            textViewMessage.setText("")
        }
    }
}