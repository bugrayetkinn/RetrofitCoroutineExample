package com.example.retrofitcoroutineexample.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**     Code with ❤
╔════════════════════════════╗
║  Created by Buğra Yetkin  ║
╠════════════════════════════╣
║ bugrayetkinn@gmail.com ║
╠════════════════════════════╣
║     15/06/2020 - 14:46     ║
╚════════════════════════════╝
 */
class CryptoClient {

    companion object {


        val BASE_URL: String = "https://api.nomics.com/v1/"

        fun getClient(): Retrofit? {

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }


}