package com.example.changeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var res: TextView
    private lateinit var back: Button
    private var number = 0
    private var square = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        number = intent.getIntExtra("counter", 0)
        square = number * number
        res = findViewById(R.id.text_result)
        res.text = square.toString()
        back = findViewById(R.id.reset)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}