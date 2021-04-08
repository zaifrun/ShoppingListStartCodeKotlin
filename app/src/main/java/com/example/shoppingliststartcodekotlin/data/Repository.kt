package com.example.shoppingliststartcodekotlin.data

import androidx.lifecycle.MutableLiveData

object Repository {
    var products = mutableListOf<Product>()

    //listener to changes that we can then use in the Activity
    private var productListener = MutableLiveData<MutableList<Product>>()


    fun getData(): MutableLiveData<MutableList<Product>> {
        if (products.isEmpty())
            createTestData()
        productListener.value = products
        return productListener
    }

    fun createTestData()
    {
        //add some products to the products list - for testing purposes
    }

}