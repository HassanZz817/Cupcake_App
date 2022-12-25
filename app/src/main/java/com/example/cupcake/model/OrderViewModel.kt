package com.example.cupcake.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel: ViewModel() {
    private val _quantity = MutableLiveData<Int>(0)
            val quantity = _quantity
    private val _flavor = MutableLiveData<String>("")
            val flavor = _flavor
    private val _date = MutableLiveData<String>("")
            val date = _date
    private val _price = MutableLiveData<Double>(0.00)
            val price = _price

    fun setQuantity (numberCupcakes: Int){
        _quantity.value = numberCupcakes
    }
    fun setFlavor (desiredFlavor: String) {
        _flavor.value = desiredFlavor
    }
    fun setDate ( pickupDate: String){
        _date.value = pickupDate
    }
    fun hasNoFlavorSet():Boolean{
        return _flavor.value.isNullOrEmpty()
    }
}
