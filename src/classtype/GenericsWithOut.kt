package classtype

fun main(args : Array<String>){
    var obj1 = GenericsExample<Int>(10)
    var obj2 = GenericsExample<Double>(20.0)
}
class GenericsWithOut<out  T>(input : T){
    init {
        println("I am getting called with value $input")
    }
}