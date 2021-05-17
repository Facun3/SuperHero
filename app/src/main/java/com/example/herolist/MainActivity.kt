package com.example.herolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize data.
        val mydataset: List<Hero> = Datasource().loadData()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HeroAdapter(mydataset)
        recyclerView.setHasFixedSize(true)
    }

}