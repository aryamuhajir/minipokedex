package com.dicoding.aplikasisederhana

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class aboutprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_profile)
        val actionbar = supportActionBar
        actionbar!!.title = "Tentang Saya"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}