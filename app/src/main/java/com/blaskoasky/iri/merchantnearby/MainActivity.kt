package com.blaskoasky.iri.merchantnearby

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        binding.rvSimple.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                with(binding.btnShowAllMerchant) {
                    if (dy > 0 && visibility == View.VISIBLE) {
                        visibility = View.GONE
                    } else if (dy < 0 && visibility != View.VISIBLE) {
                        visibility = View.VISIBLE
                    }
                }
            }
        })
    }
}