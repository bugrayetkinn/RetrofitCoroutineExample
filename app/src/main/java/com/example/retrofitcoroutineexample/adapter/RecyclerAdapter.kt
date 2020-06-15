package com.example.retrofitcoroutineexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitcoroutineexample.databinding.CryptoDesignBinding
import com.example.retrofitcoroutineexample.model.Model
import java.util.ArrayList


/**     Code with ❤
╔════════════════════════════╗
║  Created by Buğra Yetkin  ║
╠════════════════════════════╣
║ bugrayetkinn@gmail.com ║
╠════════════════════════════╣
║     15/06/2020 - 15:16     ║
╚════════════════════════════╝
 */
class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.CryptoHolder>() {

    var cryptoModels: ArrayList<Model> = ArrayList()

    class CryptoHolder(cryptoBinding: CryptoDesignBinding) :
        RecyclerView.ViewHolder(cryptoBinding.root) {


        val textViewCurrency = cryptoBinding.textViewCurrency
        val textViewPrice = cryptoBinding.textViewPrice
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoHolder {

        val cryptoDesignBinding = CryptoDesignBinding.inflate(LayoutInflater.from(parent.context))

        return CryptoHolder(cryptoDesignBinding)
    }

    override fun getItemCount(): Int {
        return cryptoModels.size
    }

    override fun onBindViewHolder(holder: CryptoHolder, position: Int) {
        holder.textViewCurrency.text = cryptoModels[position].currency
        holder.textViewPrice.text = cryptoModels[position].price
    }


}