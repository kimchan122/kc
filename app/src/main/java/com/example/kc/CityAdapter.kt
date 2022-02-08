package com.example.kc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(
    //I decided to create a functional interface instead of a new class.
    val onClickItem: (view: View, city: City) -> Unit
) : ListAdapter<City, CityViewHolder>(CityDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.city_items, parent, false))
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        getItem(position)?.let { city ->
            holder.bind(city, createOnClickListener(city))
        }
    }

    private fun createOnClickListener(city: City): View.OnClickListener {
        return View.OnClickListener { view ->
            //Here, We call the functional interface.
            onClickItem(view, city)
        }
    }
}

class CityDiffCallback : DiffUtil.ItemCallback<City>() {
    override fun areItemsTheSame(oldItem: City, newItem: City): Boolean = oldItem.cityId == newItem.cityId
    override fun areContentsTheSame(oldItem: City, newItem: City): Boolean = oldItem.name == newItem.name
}

class CityViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var imageViewImage: ImageView = view.findViewById(R.id.image)
    private var textViewName: TextView = view.findViewById(R.id.name)
    private var textViewScript: TextView = view.findViewById(R.id.script)
    //private var textViewSubtitle: TextView = view.findViewById(R.id.subtitle)
    //private var textViewYoutube: TextView = view.findViewById(R.id.youtube)

    fun bind(city: City, onClickListener: View.OnClickListener) {
        imageViewImage.setImageResource(city.image)
        textViewName.text = city.name
        textViewScript.text = city.script
        //textViewSubtitle.text = city.subtitle
        //textViewYoutube.text = city.youtube
        itemView.setOnClickListener(onClickListener)
    }
}
