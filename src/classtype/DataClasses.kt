package classtype

data class Book(val name : String, val publisher : String, var reviewScore : Int)

fun main(args : Array<String>){
    val book = Book("kotlin","sisodiya publisher", 5)
    println("Name of book = "+book.name)
    println("publisher ="+book.publisher)
    println("review ="+book.reviewScore)

    book.reviewScore = 7
    println(book.toString())
    println("Example of hashcode = "+book.hashCode())
}