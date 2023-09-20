package com.example.belajarandroidactivity

import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {

    var ivbackground: ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

       ivbackground=findViewById(R.id.ivimage)
        Glide.with(this)
            .load(R.drawable.eren)
            .transform(BlurTransformation(23,3))
            .into(ivbackground!!)



    }
}