package com.example.testdatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Divya Yadav on 23-Oct-19.
 */
class SimpleViewModel : ViewModel() {

     private val _name = MutableLiveData("Hey")
     private val _lastName = MutableLiveData("There!")
     private val _likes = MutableLiveData(0)

    val name : LiveData<String> = _name
    val lastName : LiveData<String> = _lastName
    val likes : LiveData<Int> = _likes

    fun onLike(){
        _likes.value = _likes.value?.plus(1)
    }
}