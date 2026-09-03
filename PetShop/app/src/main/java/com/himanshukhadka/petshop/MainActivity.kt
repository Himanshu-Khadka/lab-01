package com.himanshukhadka.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.himanshukhadka.petshop.ui.theme.PetShopTheme

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
        enableEdgeToEdge()
        setContent {
            PetShopTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PetShopTheme {
        Greeting("Android")
    }
}