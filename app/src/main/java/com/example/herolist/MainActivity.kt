package com.example.herolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initialize data.
        val mydataset: List<Hero> = Datasource().loadData()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HeroAdapter(mydataset)
        recyclerView.setHasFixedSize(true)
    }

}