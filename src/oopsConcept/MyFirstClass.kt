package oopsConcept

class MyFirstClass{

    private var name : String = "Shailendra Singh Sisodiya"

    fun printName(){
        println(name)
    }
}
fun main(args:Array<String>){

    var myObj = MyFirstClass()
    myObj.printName()
}