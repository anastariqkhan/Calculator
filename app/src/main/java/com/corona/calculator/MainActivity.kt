package com.corona.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val txtNumber = findViewById<EditText>(R.id.txt_number)
            val age = txtNumber.text.toString().toInt()
            if (age <= 29) {
                Toast.makeText(this, "You are too young", Toast.LENGTH_SHORT).show()
            } else if (age > 90) {
                Toast.makeText(this, "You are too Old", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "You are eligible", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, SecondActivity::class.java))
            }
        }
    }
}