package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.GeolocationPermissions
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibcall:ImageButton?=null
    var ibroute:ImageButton?=null
    var ibsharre:ImageButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibcall=findViewById(R.id.ibcall)
        ibroute=findViewById(R.id.ibroute)
        ibsharre=findViewById(R.id.ibsharre)

        ibcall!!.setOnClickListener {
            val phonenumber="081211302148"
            val phoneintent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phonenumber"))
            startActivity(phoneintent)
        }
        ibroute!!.setOnClickListener {
            val mapintent=Intent(Intent.ACTION_VIEW,Uri.parse("geo:35.36449672924112, 138.72576347183545"))
            mapintent.setPackage("com.google.android.apps.maps")
            startActivity(mapintent)
        }
        ibsharre!!.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"https://www.google.com/maps/place/Gn.+Fuji/@-6.579885,106.8544381,13.25z/data=!4m6!3m5!1s0x6019629a42fdc899:0xa6a1fcc916f3a4df!8m2!3d35.3606255!4d138.7273634!16zL20vMGNrczA?entry=ttu")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent,"Share To : "))
        }
    }
}