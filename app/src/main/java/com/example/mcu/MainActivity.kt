package com.example.mcu

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.mcu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val avengers = ArrayList<String>()
        avengers.add("Iron Man")
        avengers.add("Captain America")
        avengers.add("Black Widow")
        avengers.add("Thor")
        avengers.add("Hulk")
        avengers.add("Hawkeye")
        avengers.add("Doctor Strange")
        avengers.add("Spiderman")
        avengers.add("Black panther")
        avengers.add("Ant Man")
        avengers.add("Scarlett Witch")

        val ironman = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.iron_man)
        val capt = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.capt_america)
        val widow = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.black_widow)
        val thor = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.thor)
        val hulk = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.hulk)
        val hawkeye = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.hawkeye)
        val doc = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.doc_strange)
        val spidy = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)
        val panther = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.black_panther)
        val antman = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ant_man)
        val scarlet = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.scarlet)

        val avengersImg = ArrayList<Bitmap>()
        avengersImg.add(ironman)
        avengersImg.add(capt)
        avengersImg.add(widow)
        avengersImg.add(thor)
        avengersImg.add(hulk)
        avengersImg.add(hawkeye)
        avengersImg.add(doc)
        avengersImg.add(spidy)
        avengersImg.add(panther)
        avengersImg.add(antman)
        avengersImg.add(scarlet)

        val arrayAdpt = ArrayAdapter(this, android.R.layout.simple_list_item_1, avengers)
        binding.listView.adapter = arrayAdpt

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(applicationContext, Main2::class.java)
            intent.putExtra("avengername", avengers[i])

            val pic = avengersImg[i]
            Global.chosen.chosen_pic = pic

            startActivity(intent)
        }
    }
}