package com.example.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//regras de negócios
//mesmo que a tela seja criada novamente, ela não perderá seus valores :)
class MainViewModel: ViewModel() {
    //toda vez que incrementar algum valor na var da viewmodel, a activity vai ser informada
    var mContador = MutableLiveData<String>().apply { value = contador.toString() }
    private var contador: Int = 0

    private fun setContador() {
        mContador.value = contador.toString()

    }
    private fun validaContador() {
        contador++

        if (contador > 5) {
            contador = 0
        }
        setContador()
    }

    fun Contador() {
        validaContador()
    }
}