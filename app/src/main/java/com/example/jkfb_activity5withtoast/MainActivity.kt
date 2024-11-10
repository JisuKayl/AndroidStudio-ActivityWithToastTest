package com.example.jkfb_activity5withtoast

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countries = listOf(
            "Philippines", "United States", "Canada", "United Kingdom", "Germany", "France",
            "Japan", "Australia", "India", "Brazil", "South Africa",
            "China", "Russia", "Italy", "Mexico", "Spain",
            "Argentina", "Egypt", "South Korea", "Turkey", "Nigeria"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        val listView: ListView = findViewById(R.id.countriesListView)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "$selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}
