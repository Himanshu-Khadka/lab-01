package com.himanshukhadka.petshop

class Happy(date: String):Mood(date){
    override fun displayMood():String{
        return "Happy! Yay"
    }

}