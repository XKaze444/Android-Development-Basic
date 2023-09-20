package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {

    var buttonpindah:MaterialButton?=null
    var buttonshare:MaterialButton?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonpindah=findViewById(R.id.btnpindah)
        buttonshare=findViewById(R.id.btnshare)

        buttonpindah!!.setOnClickListener {
            val intent=Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }

        buttonshare!!.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Ahmad Naufal Peod")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent,"Share To : "))
        }
    }
}