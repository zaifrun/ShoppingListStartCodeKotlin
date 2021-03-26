package com.example.shoppingliststartcodekotlin.data

import androidx.lifecycle.MutableLiveData

object Repository {
    var products = mutableListOf<Product>()

    private var productListener = MutableLiveData<MutableList<Product>>()


    fun getData(): MutableLiveData<MutableList<Product>> {
        //createTestData()
        productListener.value = products
        return productListener
    }

    fun createTestData()
    {
        //add some products to the products list
    }

}