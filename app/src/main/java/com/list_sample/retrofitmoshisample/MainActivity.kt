package com.list_sample.retrofitmoshisample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Moshiのセットアップ
        val moshi = Moshi.Builder()
                .build()

        // Retrofitのセットアップ
        val retrofit = Retrofit.Builder()
                .baseUrl(getString(R.string.base_url))
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()

        val service = retrofit.create(RequestPathInterface::class.java)

        // 非同期通信
        object : MyAsyncTask() {
            override fun doInBackground(vararg params: Void): String? {
                try {
                    val response = service.keyWordPython().execute()
                    Log.d(TAG, response.body()?.resultsReturned.toString())
                } catch (e: Exception) {
                    Log.e(TAG, e.toString())
                }
                return super.doInBackground(*params)
            }
        }.execute()
    }
}
