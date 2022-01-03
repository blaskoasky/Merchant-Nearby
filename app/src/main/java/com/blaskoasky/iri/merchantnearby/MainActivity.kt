package com.blaskoasky.iri.merchantnearby

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.blaskoasky.iri.merchantnearby.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MainAdapter(this)
        adapter.notifyDataSetChanged()

        binding.rvSimple.layoutManager = LinearLayoutManager(this)
        binding.rvSimple.setHasFixedSize(true)
        binding.rvSimple.adapter = adapter
    }
}