package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(buttonView: View) {
        val editTextView = findViewById<EditText>(R.id.nickname_edit)
        val nicknameView = findViewById<TextView>(R.id.nickname_text)
        nicknameView.text = editTextView.text
        editTextView.visibility = View.GONE
        buttonView.visibility = View.GONE
        nicknameView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(buttonView.windowToken, 0)
    }
}