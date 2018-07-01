import jdk.nashorn.internal.ir.annotations.Immutable

fun main(args: Array<String>) {
    val number1: MutableList<Int> = mutableListOf(1,2,3,4)
    val readOnlyList: List<Int> = number1

    println("My immutable list"+ number1)
    number1.add(5)

    println("Immutable list after addition"+ number1)
    println(readOnlyList)
}