package com.example.ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private lateinit var mViewCount: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)

        toast.show()
    }
    fun countUp(view: View) {
        mCount++
        if(mViewCount !== null)
            mViewCount.text = mCount.toString()
    }
}
