package com.example.tugas_mandiri

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WomensParfumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_parfum)

        findViewById<TextView>(R.id.tvListTitle).text = "Koleksi Parfum Wanita"

        val rvParfum: RecyclerView = findViewById(R.id.rvParfum)
        rvParfum.layoutManager = LinearLayoutManager(this)

        val womensParfumList = listOf(
            Parfum(1, "Chanel No. 5", "Chanel", "Rp 2.800.000", "The world's most iconic fragrance, an abstract bouquet."),
            Parfum(2, "J'adore", "Dior", "Rp 2.400.000", "An ode to women, their audacity and their beauty."),
            Parfum(3, "Black Opium", "Yves Saint Laurent", "Rp 1.900.000", "A glam rock fragrance full of mystery and energy."),
            Parfum(4, "Flowerbomb", "Viktor&Rolf", "Rp 2.200.000", "An explosive floral bouquet that makes everything more positive."),
            Parfum(5, "Miss Dior", "Dior", "Rp 2.100.000", "A fragrance that smells like love, with notes of rose and bergamot.")
        )

        val adapter = ParfumAdapter(womensParfumList)
        rvParfum.adapter = adapter
    }
}
