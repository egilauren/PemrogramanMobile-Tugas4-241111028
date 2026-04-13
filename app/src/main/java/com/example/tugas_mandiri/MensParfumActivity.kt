package com.example.tugas_mandiri

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MensParfumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_parfum)

        findViewById<TextView>(R.id.tvListTitle).text = "Koleksi Parfum Pria"

        val rvParfum: RecyclerView = findViewById(R.id.rvParfum)
        rvParfum.layoutManager = LinearLayoutManager(this)

        val mensParfumList = listOf(
            Parfum(1, "Sauvage", "Dior", "Rp 2.100.000", "A fresh and noble composition, both raw and spirited."),
            Parfum(2, "Bleu de Chanel", "Chanel", "Rp 2.300.000", "A tribute to masculine freedom in an aromatic-woody fragrance."),
            Parfum(3, "Acqua di Gio", "Giorgio Armani", "Rp 1.800.000", "A light, distinguished fragrance with a splash of fresh sea notes."),
            Parfum(4, "Eros", "Versace", "Rp 1.500.000", "A fragrance for a strong, passionate man, who is master of himself."),
            Parfum(5, "Aventus", "Creed", "Rp 5.500.000", "A sophisticated woody and fruity fragrance with notes of blackcurrant and bergamot.")
        )

        val adapter = ParfumAdapter(mensParfumList)
        rvParfum.adapter = adapter
    }
}
