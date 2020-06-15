package com.example.retrofitcoroutineexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitcoroutineexample.model.Model
import com.example.retrofitcoroutineexample.retrofit.API
import com.example.retrofitcoroutineexample.retrofit.CryptoClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*


/**     Code with ❤
╔════════════════════════════╗
║  Created by Buğra Yetkin  ║
╠════════════════════════════╣
║ bugrayetkinn@gmail.com ║
╠════════════════════════════╣
║     15/06/2020 - 15:52     ║
╚════════════════════════════╝
 */
class MainViewModel : ViewModel() {


    val cryptoData: MutableLiveData<ArrayList<Model>> = MutableLiveData()
    val retrofit = CryptoClient.getClient()?.create(API::class.java)

    fun getCryptoModels(): MutableLiveData<ArrayList<Model>> {

        viewModelScope.launch {

            val response = retrofit?.getData()

            withContext(Dispatchers.Main) {

                if (response?.isSuccessful!!) {

                    response.body().let {

                        cryptoData.value = it as ArrayList<Model>?
                    }
                }
            }
        }

        return cryptoData
    }
}