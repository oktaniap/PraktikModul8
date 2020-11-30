package com.example.modul8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class CommunicationViewModel : ViewModel() {
    //menginisialisasi data yang berelasi tiap tab(view model)
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}
