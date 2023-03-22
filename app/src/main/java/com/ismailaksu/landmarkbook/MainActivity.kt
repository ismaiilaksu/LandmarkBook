package com.ismailaksu.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.ismailaksu.landmarkbook.databinding.ActivityDetailsBinding
import com.ismailaksu.landmarkbook.databinding.ActivityMainBinding

//var chosenLandmark : Landmark? = null

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //Data

        val anitkabir = Landmark("Anıtkabir","Türkiye",R.drawable.anitkabir)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.colosseum)
        val londonBridge = Landmark("London Bridge","UK",R.drawable.londonbridge)
        val eiffel = Landmark("Eiffel Tower","France",R.drawable.eiffel)

        //Inefficient
        // val colosseumBitmap = BitmapFactory.decodeResource(resources, R.drawable.colosseum)

        landmarkList.add(anitkabir)
        landmarkList.add(colosseum)
        landmarkList.add(londonBridge)
        landmarkList.add(eiffel)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter



    /*  listView

        //Adapter: Layout & Data

        //Mapping

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark ->landmark.name  })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->  }
        val intent = Intent(MainActivity@this,DetailsActivity::class.java)
        intent.putExtra("landmark",landmarkList.get(i))
        startActivity(intent)
    */
    }
}