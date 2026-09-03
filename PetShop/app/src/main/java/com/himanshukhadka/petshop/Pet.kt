package com.himanshukhadka.petshop

// This is the Pet Class with two Arguments name which is String
// And age which is Int
//Note : both val and var are variable deceleration but val is read-only
// but var is read-write

abstract class Pet(val name: String, var age: Int){
    abstract fun speak(): String
}

interface Pettable{
    fun pet()
}