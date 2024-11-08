package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.homework1.ui.theme.Homework1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textNumber = findViewById<EditText>(R.id.textNumber)
        val textMessage = findViewById<EditText>(R.id.textMessage)
        val btnSend = findViewById<Button>(R.id.btnSend)


        btnSend.setOnClickListener() {
            val number = textNumber.text.toString()
            val message = textMessage.text.toString()

            if (!TextUtils.isDigitsOnly(number)) {
                Toast.makeText(this, "Please enter a valid number!", Toast.LENGTH_SHORT).show()
            } else if (message.length > 5) {
                Toast.makeText(this, "Message is too long!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ViewPageActivity::class.java)
                intent.putExtra("number", number)
                intent.putExtra("message", message)
                startActivity(intent)
            }
        }
    }
}
