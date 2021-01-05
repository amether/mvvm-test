package com.example.mvvm_test

import androidx.databinding.ObservableField

class Observer {
    val text = ObservableField("old data")
    val isLoading = ObservableField(false)
}