package com.example.twoactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity() {

    private val LOG_TAG = MainActivity::class.java.simpleName
    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"

    //   val TEXT_REQUEST = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newIntent = Intent(this, SecondActivity::class.java)


        button_chapter1.setOnClickListener {
            newIntent.putExtra("CHAPTER", 1)
            startActivity(newIntent)
        }

        button_chapter2.setOnClickListener {
            newIntent.putExtra("CHAPTER", 2)
            startActivity(newIntent)
        }

        button_chapter3.setOnClickListener {
            newIntent.putExtra("CHAPTER", 3)
            startActivity(newIntent)
        }
    }


}