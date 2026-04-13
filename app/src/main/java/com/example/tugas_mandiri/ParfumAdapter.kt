package com.example.tugas_mandiri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ParfumAdapter(private val parfumList: List<Parfum>) :
    RecyclerView.Adapter<ParfumAdapter.ParfumViewHolder>() {

    class ParfumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvParfumName)
        val tvBrand: TextView = itemView.findViewById(R.id.tvParfumBrand)
        val tvPrice: TextView = itemView.findViewById(R.id.tvParfumPrice)
        val tvDescription: TextView = itemView.findViewById(R.id.tvParfumDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParfumViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_parfum, parent, false)
        return ParfumViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParfumViewHolder, position: Int) {
        val parfum = parfumList[position]
        holder.tvName.text = parfum.name
        holder.tvBrand.text = parfum.brand
        holder.tvPrice.text = parfum.price
        holder.tvDescription.text = parfum.description
    }

    override fun getItemCount(): Int = parfumList.size
}
