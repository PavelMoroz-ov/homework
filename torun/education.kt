package com.example.myapplication.torun
import com.example.myapplication.model.Animal1
import com.example.myapplication.model.Animal2


fun main (){
    val animal1 = Animal1("Травоядные")
    val animal2 = Animal2("Плотоядные")

    var ListOfCarnivores: List<String> = listOf("Тирг","Лев")
    var ListOfHerbivores: List<String> = listOf("Свинья","Лошадь")
    print(animal1.animal)
    println(ListOfHerbivores)
    print(animal2.animal)
    println(ListOfCarnivores)


}