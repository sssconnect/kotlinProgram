package oopsConcept

interface A{
    fun printMe(){
        println("method of interface A")
    }
}
interface B{
    fun printMeToo(){
        println("method of interface B")
    }
}
class MultifpleInterfaceExample : A,B
    fun main(args : Array<String>){
        val obj = MultifpleInterfaceExample()
        obj.printMe()
        obj.printMeToo()
    }
