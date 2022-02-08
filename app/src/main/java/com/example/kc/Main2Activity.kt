package com.example.kc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.kc.databinding.Activity2mainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_2main.*
import kotlinx.android.synthetic.main.city_items.*
import java.util.ArrayList

class Main2Activity : AppCompatActivity() {

    //var binding: Activity2mainBinding? = null
    lateinit var items: MutableList<City>
    lateinit var adapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2main)

        val userAdapter = createAdapter()
        userAdapter.submitList(CITIES_DATA_SAMPLE)

        recycler_view.adapter = userAdapter
        //init()
    }
    fun init(){
        items = ArrayList()

    }

    private fun createAdapter(): CityAdapter {
        return CityAdapter { view: View, user: City ->
            //Snackbar.make(view, user.toString(), Snackbar.LENGTH_LONG).show()
            val Intent = Intent(this, Main3Activity::class.java)

            Intent.putExtra("name",user.name)
            Intent.putExtra("subtitle",user.subtitle)
            Intent.putExtra("script",user.script)
            Intent.putExtra("youtube",user.youtube)

            startActivity(Intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            //finish();
        }
    }
}