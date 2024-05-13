package com.example.abmotorss.models

class Product {
    var carname:String = ""
    var quantity:String = ""
    var price:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String, imageUrl: String, id: String) {
        this.carname = name
        this.quantity = quantity
        this.price = price
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}