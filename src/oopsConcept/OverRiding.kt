package oopsConcept

open class Vehicle{
   open fun engine(){
        println("all vehicle has engine")
    }
}
class  VolvoBus : Vehicle(){

    override fun engine(){
        println("volvo bus has 45 hp engine")
    }
}

fun main(args : Array<String>){
    var bus = VolvoBus();
    bus.engine()
}