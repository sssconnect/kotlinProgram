package oopsConcept

open class Base{
    fun  printFromBase(){
        println("Hey !! i am calling from base class")
    }
}
class Drived : Base(){
}

fun main(args : Array<String>){
    var objOfDrived = Drived()
    objOfDrived.printFromBase()
}