package com.example.retrofitcoroutineexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.retrofitcoroutineexample.adapter.RecyclerAdapter
import com.example.retrofitcoroutineexample.databinding.ActivityMainBinding
import com.example.retrofitcoroutineexample.model.Model
import com.example.retrofitcoroutineexample.retrofit.API
import com.example.retrofitcoroutineexample.retrofit.CryptoClient
import com.example.retrofitcoroutineexample.viewmodel.MainViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val mainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var cryptoModels: ArrayList<Model>

    val adapter: RecyclerAdapter by lazy {
        RecyclerAdapter()
    }

    val mainViewModel: MainViewModel by lazy {
        MainViewModel()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        cryptoModels = ArrayList()

        mainBinding.recyclerView.setHasFixedSize(true)
        mainBinding.recyclerView.layoutManager =
            LinearLayoutManager(this)

        mainViewModel.getCryptoModels().observe(this, Observer {

            cryptoModels = it
            adapter.cryptoModels = cryptoModels
            mainBinding.recyclerView.adapter = adapter
        })


    }
}