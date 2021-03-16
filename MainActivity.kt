package com.example.toastmessagedisplay

import android.os.Bundle
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getMessage(view: View?) {
        val t: Toast = Toast.makeText(this, "Hello, world!", Toast.LENGTH_LONG)
        t.show()
    }
}