package com.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById(R.id.text)

        // this works
//        text.onFocusChangeListener = View.OnFocusChangeListener { _: View?, hasFocus: Boolean ->
//        }

        // this works as well
//        text.setOnFocusChangeListener { _: View?, hasFocus: Boolean ->
//        }

        // This does not work
        text.onFocusChangeListener = LinearLayout.OnFocusChangeListener { _: View?, hasFocus: Boolean ->
        }

        // This also does not work!
//        text.setOnFocusChangeListener(OnFocusChangeListener { _: View?, hasFocus: Boolean ->
//        })
    }
}
