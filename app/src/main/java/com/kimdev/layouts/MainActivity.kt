package com.kimdev.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imgageList = ArrayList<Int>()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("United Kingdom")
        countryNameList.add("Germany")
        countryNameList.add("United States")

        detailList.add("This is the United Kingdom Flag")
        detailList.add("This is the Germany Flag")
        detailList.add("This is the United States Flag")

        imgageList.add(R.drawable.unitedkingdom)
        imgageList.add(R.drawable.germany)
        imgageList.add(R.drawable.usa)

        adapter = CountriesAdapter(this@MainActivity, countryNameList, detailList, imgageList)

        recyclerView.adapter = adapter
    }
}