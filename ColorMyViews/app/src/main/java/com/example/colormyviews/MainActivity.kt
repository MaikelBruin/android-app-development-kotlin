package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.box_one_text).setOnClickListener {
            makeColored(it)
        }

        findViewById<TextView>(R.id.box_two_text).setOnClickListener {
            makeColored(it)
        }

        findViewById<TextView>(R.id.box_three_text).setOnClickListener {
            makeColored(it)
        }

        findViewById<TextView>(R.id.box_four_text).setOnClickListener {
            makeColored(it)
        }

        findViewById<TextView>(R.id.box_five_text).setOnClickListener {
            makeColored(it)
        }

        findViewById<Button>(R.id.red_button).setOnClickListener {
            makeColored(it)
        }

        findViewById<Button>(R.id.yellow_button).setOnClickListener {
            makeColored(it)
        }

        findViewById<Button>(R.id.green_button).setOnClickListener {
            makeColored(it)
        }


    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> {
                findViewById<TextView>(R.id.box_three_text).setBackgroundResource(android.R.color.holo_red_dark)
            }

            R.id.yellow_button -> {
                findViewById<TextView>(R.id.box_four_text).setBackgroundResource(android.R.color.holo_orange_light)
            }

            R.id.green_button -> {
                findViewById<TextView>(R.id.box_five_text).setBackgroundResource(android.R.color.holo_green_dark)
            }

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }





}