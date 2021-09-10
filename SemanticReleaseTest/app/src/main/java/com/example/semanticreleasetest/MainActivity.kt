package com.example.semanticreleasetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        feat()
        fix()
    }

    fun feat(){
        println("Nice feature")
        println("One more change")
    }
    fun fix(){
        println("And a fix")
    }
}