package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasaPemrograman:RecyclerView=
            findViewById(R.id.rvbahasapemrograman)
        val data= arrayListOf<Language>(
            Language("Dzikir & Doa Sunnah Setelah Shalat",R.drawable.ngaji),
            Language("Dzikir Harian",R.drawable.ngaji),
            Language("Dzikir & Doa Sunnah Setelah Shalat",R.drawable.ngaji),
            Language("Doa Tahajjud",R.drawable.ngaji),
            Language("Doa Qunut",R.drawable.ngaji),
            Language("Doa Khatmil Qur'an",R.drawable.ngaji),
            Language("Doa Terjauh Dari Bala",R.drawable.ngaji),
        )

        val cvSelengkapnya:Button=
            findViewById(R.id.cvSelengkapnya)

        val adapter=LanguageAdapter(data)
        rvBahasaPemrograman.adapter=adapter
        rvBahasaPemrograman.layoutManager=
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)

        cvSelengkapnya.setOnClickListener {
            val intent= Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }

    }


}