package com.example.retrofitcoroutineexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**     Code with ❤
╔════════════════════════════╗
║  Created by Buğra Yetkin  ║
╠════════════════════════════╣
║ bugrayetkinn@gmail.com ║
╠════════════════════════════╣
║     15/06/2020 - 14:41     ║
╚════════════════════════════╝
 */
data class Model(

    @SerializedName("currency")
    @Expose
    val currency: String,

    @SerializedName("price")
    @Expose
    val price: String
)
