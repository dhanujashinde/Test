package com.codingwithmitch.espressouitestexamples.ui.movie

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codingwithmitch.espressouitestexamples.R

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener()
        {
            Toast.makeText(this@MainActivity,
                R.string.message, Toast.LENGTH_LONG).show()
    }

    }

}







