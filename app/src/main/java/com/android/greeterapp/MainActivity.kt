package com.android.greeterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            showName()
        }
    }

    private fun showName() {
        val text = editText.text.toString()
        name = "Hello, $text"
        if (text.isEmpty()){
            Toast.makeText(this,"Invalid enter",Toast.LENGTH_SHORT).show()
        }
        else textView.text = name

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val savedName : String = name
        outState.putString("savedString", name)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val savedVal :String = savedInstanceState.getString("savedString","")
        name = savedVal
        textView.text = name
    }
}