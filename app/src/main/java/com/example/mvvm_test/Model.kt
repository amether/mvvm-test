package com.example.mvvm_test

import android.os.Handler


class Model {

    fun refreshData(onDataReadyCallback: OnDataReadyCallback) {
        Handler().postDelayed({ onDataReadyCallback.onDataReady("new data") },2000)
    }
}

interface OnDataReadyCallback {
    fun onDataReady(data : String)
}