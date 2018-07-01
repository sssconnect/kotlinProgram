package classtype

sealed class MyExample{
    class OP1 : MyExample()
    class OP2 : MyExample()
}
fun main(args : Array<String>){
    val obj : MyExample = MyExample.OP2()

    var output1 = when(obj){
        is MyExample.OP1 -> "Option one has been chosean"
        is MyExample.OP2 -> "option two has been chosean"
    }

    println(output1)
}