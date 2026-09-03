package com.himanshukhadka.petshop


//Abstract class Mood with attribute date

abstract class Mood(val date: String){
    abstract fun displayMood():String
}

class Happy(date: String):Mood(date){
    override fun displayMood():String{
        return "Happy! Yay"
    }

}

class Sad(date: String):Mood(date){
    override fun displayMood():String{
        return "Sad!, Ohh"
    }

}

class Excited(date: String):Mood(date){
    override fun displayMood(): String {
        return "ohhhhhhh Yeahhhhhhh I am excited"
    }
}

class Grumpy(date: String):Mood(date){
    override fun displayMood(): String {
        return "Grump Grump Grump"
    }
}

