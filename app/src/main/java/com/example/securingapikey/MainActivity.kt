package com.example.securingapikey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.securingapikey.GetKeys.getNativeKey1
import com.example.securingapikey.GetKeys.getNativeKey2

class MainActivity : AppCompatActivity() {


    //blog for reference : https://medium.com/@abhi007tyagi/storing-api-keys-using-android-ndk-6abb0adcadad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val key1: String = String(Base64.decode(getNativeKey1(), Base64.DEFAULT))
        Log.i("secretKeys",getNativeKey1()!!)
        Log.i("secretKeys",getNativeKey2()!!)

    }


}