package com.example.myapplication

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var toolbar = findViewById(R.id.toolbarNext) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        /*
        val picture = getIntent().getParcelableExtra<Bitmap>("picture")
        var profileImage = findViewById(R.id.imageView2) as ImageView
        profileImage.setImageBitmap(picture)

         */

        val picturePath = getIntent().getStringExtra("picture")
        if (picturePath != null) {
            val imageView2 = findViewById<ImageView>(R.id.imageView2)
            imageView2.visibility = View.INVISIBLE
            val cardviewProfileImage = findViewById<CardView>(R.id.cardviewProfileImage)
            cardviewProfileImage.visibility = View.VISIBLE
            val scaledBitmap: Bitmap = BitmapFactory.decodeFile(picturePath)
            val imageviewProfileImage = findViewById(R.id.imageviewProfileImage) as ImageView
            imageviewProfileImage.visibility = View.VISIBLE
            imageviewProfileImage.setImageBitmap(scaledBitmap)
        }

    }
}
