package com.anzen.android.examenandroid.models

interface ResponseListener<T> {
    fun onSuccess(responseObject: T)
    fun onError(error: String)
}