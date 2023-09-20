package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.DoaHarian
import com.example.belajarandroidactivity.model.Language

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val Doa:RecyclerView=
            findViewById(R.id.rvdoaharian)

        val namaDoa = getString(R.string.`doalatinُ`)
        val doaarab = getString(R.string.`doaarabُ`)

        val data= arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur",doaarab,namaDoa)
        )

        val adapter=DoaAdapter(data)
        Doa.adapter=adapter

        Doa.layoutManager=
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)

    }

}