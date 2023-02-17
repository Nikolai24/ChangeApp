package com.example.changeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var changes: TextView
    private lateinit var button: Button
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ACTIVITY_TAG, "onCreate()")
        if (savedInstanceState != null) {
            with(savedInstanceState) {
                counter = getInt("counter")
            }
        }
        setContentView(R.layout.activity_main)
        changes = findViewById(R.id.text_changes)
        changes.text = counter.toString()
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("counter", counter)
            startActivity(intent)
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putInt("counter", counter+1)
        }
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(ACTIVITY_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ACTIVITY_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ACTIVITY_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ACTIVITY_TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ACTIVITY_TAG, "onDestroy()")
    }

    private companion object{
        private const val ACTIVITY_TAG = "MainActivity"
    }
}