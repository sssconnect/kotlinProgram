package oopsConcept

interface  ExampleInterface {
    var myVar : Int
    fun absMethod(): String

    fun  hello(){
        println("welcome from kotlin interface")
    }
}
class InterfaceImple : ExampleInterface{
    override  var myVar : Int = 25
    override fun absMethod()  = "Happy Learning "
}
fun main(args : Array<String>){
    val obj = InterfaceImple()
    println("My variable Value is = ${obj.myVar}")
    obj.hello()

    println(obj.absMethod())
}