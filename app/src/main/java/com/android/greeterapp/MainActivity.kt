package com.android.greeterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener {
            showName()
        }
    }

    private fun showName() {
        val enteredText : EditText = findViewById(R.id.editText)
        val name : TextView = findViewById(R.id.text)
        val text = enteredText.text.toString()

        if (text.length==0){
            Toast.makeText(this,"Invalid enter",Toast.LENGTH_SHORT).show()
        }
        else name.setText("Hello, "+ text)

    }
}