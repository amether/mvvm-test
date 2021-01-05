package com.example.mvvm_test

import androidx.databinding.ObservableField

class MainViewModel {
    var model: Model = Model()

    val text = ObservableField<String>()

    val isLoading = ObservableField<Boolean>()

    fun refresh(){
        isLoading.set(true)
        model.refreshData(object : OnDataReadyCallback {
            override fun onDataReady(data: String) {
                isLoading.set(false)
                text.set(data)
            }
        })
    }
}