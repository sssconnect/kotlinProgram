fun main(args:Array<String>){
    val items = listOf(1,2,3,4,5)
    println("first element of list="+items.first())
    println("last element of list="+items.last())
    println("even number of list = "+items.filter{it % 2 == 0})

    val  readWriteMap = hashMapOf("fi" to 1,"se" to 2,"th" to 3)
    println(readWriteMap)
    println("fi ="+readWriteMap["fi"])

    val mHasSet = hashSetOf("a","b","c","d")
    println("set Values are ="+mHasSet)
    println("set value at index = "+mHasSet)
}