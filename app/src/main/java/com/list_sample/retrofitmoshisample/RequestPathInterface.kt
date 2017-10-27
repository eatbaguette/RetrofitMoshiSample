package com.list_sample.retrofitmoshisample

import android.telecom.Call
import retrofit2.http.GET

/**
 * Created by monkey on 2017/10/27.
 */
interface RequestPathInterface {
    @GET("?keyword=python")
    fun keyWordPython(): retrofit2.Call<SearchResultModel>
}