package com.aguaviva.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel () {


    /*
    LiveData valor imutavel por padrão
    MutableLiveDAte : mutavel
     */

    var cont = MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1) // caso nao seja nulo o app roda isso
    }

}