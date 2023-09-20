package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
                "Python", "C#", "C++", "HTML", "JavaScript"
                )

        var mListView=findViewById<ListView>(R.id.lvnama)
        arrayAdapter=ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter=arrayAdapter


    }
}