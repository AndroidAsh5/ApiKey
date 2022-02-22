package com.example.securingapikey

object GetKeys {


    init {
        System.loadLibrary("keys")

    }

    external fun getNativeKey1(): String?

    external fun getNativeKey2(): String?

}