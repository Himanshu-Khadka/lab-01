package com.himanshukhadka.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity


val cat = Cat("Coco", 6)
val dog = Dog("Mochi", 6)
val scorpion = Scorpion("Stinger", 32)


//function pets that has the pets list
fun pets(){
    val pets = mutableListOf<Pet>()
    pets.add(cat)
    pets.add(dog)
    pets.add(scorpion)

    val pettablePets = mutableListOf<Pettable>()
    pettablePets.add(cat)
    pettablePets.add(dog)
//    pettablePets.add(scorpion) // This raises an error as the pet scorpion is does not inherit from the class pettable

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
    }
}

