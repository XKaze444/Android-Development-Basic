package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibility : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvtext:TextView=findViewById(R.id.tvtext)
        val btnklik:Button=findViewById(R.id.btnklik)

        btnklik.setOnClickListener {
            if (tvtext.visibility==View.VISIBLE){
                tvtext.visibility=View.INVISIBLE
            }else{
                tvtext.visibility=View.VISIBLE
            }

        }
    }
}