package com.example.myapplication.torun
import com.example.myapplication.model.Animal1
import com.example.myapplication.model.Animal2


fun main (){
    val animal1 = Animal1("Травоядные") // Надо создать два класса, с именем травоядные и хищники. Посмотрите правильные их перевод на английский
    val animal2 = Animal2("Плотоядные")

    var ListOfCarnivores: List<String> = listOf("Тирг","Лев") // В списках должен быть тип Вашего класса List<Predator> - например, класс хищники
    var ListOfHerbivores: List<String> = listOf("Свинья","Лошадь")
    print(animal1.animal)
    println(ListOfHerbivores)
    print(animal2.animal)
    println(ListOfCarnivores)


}
