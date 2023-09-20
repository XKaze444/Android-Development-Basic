package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hellowtex: TextView =findViewById(R.id.labelform)

        val labelnam: TextView =findViewById(R.id.labelnama)
        val inputnam: EditText =findViewById(R.id.inputnama)

        val labelkela: TextView =findViewById(R.id.labelkelas)
        val inputkela: EditText =findViewById(R.id.inputkelas)

        val labelkod: TextView =findViewById(R.id.labelkode)
        val inputkod: EditText =findViewById(R.id.inputkode)

        val but: Button =findViewById(R.id.button)

        val hasiilnam: TextView =findViewById(R.id.hasilnam)
        val hasiilkel: TextView =findViewById(R.id.hasilkel)
        val bukuu: TextView =findViewById(R.id.buku)


        but.setOnClickListener{
            Toast.makeText(this, "BUKU YANG DIPINJAM : ${bukuu.text}" , Toast.LENGTH_SHORT).show()
            hasiilnam.text=inputnam.text
            hasiilkel.text=inputkela.text
            bukuu.text=inputkod.text
            val kodeBuku = inputkod.text.toString()


            when (kodeBuku) {
                "123" -> bukuu.text = "Harry Potter"
                "456" -> bukuu.text = "Hizba Nikah sama Kafka"
                "789" -> bukuu.text = "10 Dosa Besar Soeharto"
                else  -> bukuu.text = "ERROR! BOOK NOT FOUND!"
            }

        }




    }
}