package oopsConcept

fun main(args :Array<String>){
    val  person1 = Person("shailendra singh",24)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.Age}")
}
class Person(val firstName:String, var Age:Int){

}