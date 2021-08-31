package com.example.diaryapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.ViewGroup.LayoutParams;
import androidx.core.view.marginTop


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btn: Button
    lateinit var textView: TextView
    lateinit var gen: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TAG", "onCreate: ")
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)

        btn = findViewById(R.id.button)
        btn.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        val tv_dynamic = TextView(this)

        tv_dynamic.textSize = 20f
        tv_dynamic.text = "This is a dynamic TextView generated programmatically in Kotlin"

    }
}