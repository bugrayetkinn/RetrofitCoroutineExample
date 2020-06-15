package com.example.retrofitcoroutineexample.retrofit

import com.example.retrofitcoroutineexample.model.Model
import retrofit2.Response
import retrofit2.http.GET


/**     Code with ❤
╔════════════════════════════╗
║  Created by Buğra Yetkin  ║
╠════════════════════════════╣
║ bugrayetkinn@gmail.com ║
╠════════════════════════════╣
║     15/06/2020 - 14:45     ║
╚════════════════════════════╝
 */

interface API {

    @GET("prices?key=77695d0f51032d8c1f9b1c6c8ea23781")
    suspend fun getData(): Response<List<Model>>
}