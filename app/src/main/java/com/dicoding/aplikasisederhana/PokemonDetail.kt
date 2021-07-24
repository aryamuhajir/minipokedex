package com.dicoding.aplikasisederhana

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class PokemonDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_ELEMEN = "extra_elemen"
        const val EXTRA_HABITAT = "extra_habitat"
        const val EXTRA_ABILITY = "extra_ability"
        const val EXTRA_MAKANAN = "extra_makanan"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_HABITATPHOTO = "extra_habitatphoto"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_pokemon)
        val actionbar = supportActionBar
        actionbar!!.title = "Informasi Pokemon"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val screenV = findViewById(R.id.detail_pokemon) as ScrollView

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvMakanan: TextView = findViewById(R.id.tv_makanan_set)
        val tvElemen: TextView = findViewById(R.id.tv_elemen_set)
        val tvAbility: TextView = findViewById(R.id.tv_ability_set)
        val tvHabitat: TextView = findViewById(R.id.tv_habitat_set)
        val tvDetail : TextView = findViewById(R.id.tv_detail_pokemon)
        val imgHabitat : CircleImageView = findViewById(R.id.habitat_gambar)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tMakanan = intent.getStringExtra(EXTRA_MAKANAN)
        val tHabitat = intent.getStringExtra(EXTRA_HABITAT)
        val tAbility = intent.getStringExtra(EXTRA_ABILITY)
        val tElemen = intent.getStringExtra(EXTRA_ELEMEN)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tHabitatPhoto = intent.getIntExtra(EXTRA_HABITATPHOTO, 0)


        tvSetName.text = tName
        Glide.with(this)
            .load(tPhoto)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvMakanan.text = tMakanan
        tvElemen.text = tElemen
        tvAbility.text = tAbility
        tvHabitat.text = tHabitat
        tvDetail.text = tDetail
        Glide.with(this)
            .load(tHabitatPhoto)
            .apply(RequestOptions())
            .into(imgHabitat)


        when(tName){
            "Bulbasaur" -> {
                val colorValue = ContextCompat.getColor(this, R.color.tumbuhan)
                screenV.setBackgroundColor(colorValue)
            }
            "Pikachu" -> {
                val colorValue = ContextCompat.getColor(this, R.color.listrik)
                screenV.setBackgroundColor(colorValue)
            }
            "Abra" -> {
                val colorValue = ContextCompat.getColor(this, R.color.listrik)
                screenV.setBackgroundColor(colorValue)
            }
            "Vulpix" -> {
                val colorValue = ContextCompat.getColor(this, R.color.api)
                screenV.setBackgroundColor(colorValue)
            }
            "Charmander" -> {
                val colorValue = ContextCompat.getColor(this, R.color.api)
                screenV.setBackgroundColor(colorValue)
            }
            "Zubat" -> {
                val colorValue = ContextCompat.getColor(this, R.color.racun)
                screenV.setBackgroundColor(colorValue)
            }
            "Poliwag" -> {
                val colorValue = ContextCompat.getColor(this, R.color.air   )
                screenV.setBackgroundColor(colorValue)
            }
            "Squirtle" -> {
                val colorValue = ContextCompat.getColor(this, R.color.air)
                screenV.setBackgroundColor(colorValue)
            }
            "Tentacool" -> {
                val colorValue = ContextCompat.getColor(this, R.color.air)
                screenV.setBackgroundColor(colorValue)
            }
            "Rattata" -> {
                val colorValue = ContextCompat.getColor(this, R.color.normal)
                screenV.setBackgroundColor(colorValue)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}