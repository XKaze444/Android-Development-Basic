package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val inputangkasatu:EditText = findViewById(R.id.inputangkasatu)
        val inputangkadua:EditText = findViewById(R.id.inputangkadua)
        val plus:Button = findViewById(R.id.btnplus)
        val min:Button = findViewById(R.id.btnmin)
        val hasil:TextView=findViewById(R.id.hasilangka)

        val persen:Button = findViewById(R.id.btnpersen)
        val kali:Button = findViewById(R.id.btnx)
        val per:Button = findViewById(R.id.btnbagi)

        val clear:Button = findViewById(R.id.btnclear)

        val builder:AlertDialog.Builder=AlertDialog.Builder(this@CalculatorActivity)


plus.setOnClickListener {
    var angka1:Int=inputangkasatu.text.toString().toInt()
    var angka2:Int=inputangkadua.text.toString().toInt()
    var hasiltmbh:Int=angka1+angka2

    hasil.setText(hasiltmbh.toString())
}

min.setOnClickListener {
    var angka1:Int=inputangkasatu.text.toString().toInt()
    var angka2:Int=inputangkadua.text.toString().toInt()
    var hasilmin:Int=angka1-angka2
    hasil.setText(hasilmin.toString())
        }

        kali.setOnClickListener {
            var angka1:Int=inputangkasatu.text.toString().toInt()
            var angka2:Int=inputangkadua.text.toString().toInt()
            var hasilkali:Int=angka1*angka2
            hasil.setText(hasilkali.toString())
        }

        persen.setOnClickListener {
            var angka1:Int=inputangkasatu.text.toString().toInt()
            var angka2:Int=inputangkadua.text.toString().toInt()
            var hasilpersen:Int=angka1%angka2
            hasil.setText(hasilpersen.toString())
        }

        per.setOnClickListener {
            var angka1:Float=inputangkasatu.text.toString().toFloat()
            var angka2:Float=inputangkadua.text.toString().toFloat()
            var hasilper:Float=angka1/angka2
            hasil.setText(hasilper.toString())
        }

clear.setOnClickListener {
    var angka1:Int=inputangkasatu.text.toString().toInt()
    var angka2:Int=inputangkadua.text.toString().toInt()

    builder.setTitle("Perhatian!")
    builder.setMessage("Kamu Yakin Ingin Menghapus Datanya?")
    builder.setCancelable(false)
    builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->

        hasil.setText("0")
        inputangkasatu.setText("")
        inputangkadua.setText("")

    })
builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->  })
    builder.setIcon(R.drawable.baseline_info_24)

    val alertDialog:AlertDialog=builder.create()
    alertDialog.show()

}

    }

}