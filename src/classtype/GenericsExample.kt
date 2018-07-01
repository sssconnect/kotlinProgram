package classtype

fun main(args : Array<String>){

    var ob1 = GenericsExample<String>("java")
    var ob2 = GenericsExample<Int>(10)
}
class GenericsExample<T>(input : T){
    init {
        println("I am getting called with value $input")
    }
}