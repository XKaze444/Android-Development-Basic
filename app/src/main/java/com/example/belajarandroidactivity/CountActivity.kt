package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

      val num:TextView = findViewById(R.id.tvangka)
        val up:Button = findViewById(R.id.btncount)
        val min:Button = findViewById(R.id.btnmin)
        val res:Button = findViewById(R.id.btnreset)
        var countUp:Int = 0

        up.setOnClickListener{
            countUp +=1
            num.text=countUp.toString()
        }



   min.setOnClickListener {
       countUp -=1
       num.text=countUp.toString()
   }



        res.setOnClickListener {
            countUp =0
            num.text=countUp.toString()
        }


    }
}