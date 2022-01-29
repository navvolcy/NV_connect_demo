package com.example.nv_connect_demo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var tapBtn: Button
    lateinit var messageTV: TextView
    lateinit var reSet: Button


    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //finds the id of the widget
        tapBtn = findViewById(R.id.Button)
        reSet = findViewById(R.id.Button_2)
        //action taken when button is clicked
        tapBtn.setOnClickListener{doTapBtn()}
        reSet.setOnClickListener{doReSetBtn()}

        messageTV = findViewById(R.id.text_view_1)

    }

    fun doTapBtn(){
        Log.i("CS3680", "someone tapped the Tap")

        count += 10
        messageTV.text = count.toString()
    }
    // the rest buttons function that calls another function to reset to zero
    fun doReSetBtn(){
        count = doDone(count)
        messageTV.text = count.toString()


    }
   //the function takes in an the number from count
    fun doDone(x:Int):Int{
       //if whatever number x will return 0
        if (x == x ) {
            return  0
        }
        else{
            return x + 1
        }

    }



}


