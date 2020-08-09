package com.skh.discoverassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList = ArrayList<Model>()
        arrayList.add(Model(R.drawable.c2,"Ivonne chair, green", "$29.00"))
        arrayList.add(Model(R.drawable.c3,"Ivonne chair, green", "$29.00"))
        arrayList.add(Model(R.drawable.c4,"Ivonne chair, green", "$29.00"))
        arrayList.add(Model(R.drawable.c5,"Ivonne chair, green", "$29.00"))
        arrayList.add(Model(R.drawable.c6,"Ivonne chair, green", "$29.00"))
            val modelAdapter= ModelAdapter(arrayList,this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = modelAdapter
    }
}