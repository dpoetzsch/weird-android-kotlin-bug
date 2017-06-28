package com.example

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout

/**
 * Created on 23.06.17.
 *
 * @author Felix Felten
 */
class CustomView : LinearLayout {
    constructor(context: Context): super(context) {
        initUI(context)
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        initUI(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        initUI(context)
    }

    private fun initUI(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.view_custom, this, true)

        val text = findViewById(R.id.text)
        text.onFocusChangeListener = OnFocusChangeListener { _: View?, hasFocus: Boolean ->
            // not even doing anything
        }
    }
}