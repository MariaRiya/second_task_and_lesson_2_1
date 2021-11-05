package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val chapter = intent.getIntExtra("CHAPTER", 0)
        when (chapter){
            1 -> {
                second_activity_header.setText(R.string.button_chapter_1)
                text_of_chapter.setText(R.string.chapter_1)
            }
            2 -> {
                second_activity_header.setText(R.string.button_chapter_2)
                text_of_chapter.setText(R.string.chapter_2)
            }
            3 -> {
                second_activity_header.setText(R.string.button_chapter_3)
                text_of_chapter.setText(R.string.chapter_3)
            }
        }

    }

}