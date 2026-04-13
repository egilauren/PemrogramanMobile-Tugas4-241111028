package com.example.tugas_mandiri

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardMensParfum: MaterialCardView = findViewById(R.id.cardMensParfum)
        val cardWomensParfum: MaterialCardView = findViewById(R.id.cardWomensParfum)

        cardMensParfum.setOnClickListener {
            val intent = Intent(this, MensParfumActivity::class.java)
            startActivity(intent)
        }

        cardWomensParfum.setOnClickListener {
            val intent = Intent(this, WomensParfumActivity::class.java)
            startActivity(intent)
        }
    }
}
