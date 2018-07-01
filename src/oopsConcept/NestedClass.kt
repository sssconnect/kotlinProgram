package oopsConcept

class OuterClass{
    var test : String = "from Outer class"

    fun printVariable(){
        println(test)
    }

    class InnerClass{
        var test = "from Inner class"

        fun prinVariable(){

            println(test)
        }
    }
}

fun main(args : Array<String>){
    var demoInner = OuterClass.InnerClass().prinVariable()
    var demo = OuterClass()
    print(demo.printVariable())
}