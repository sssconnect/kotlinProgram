package oopsConcept

// the only difference between nested and inner is inner can access members of outer also. we use inner keyword
// in nested class for defining inner class

class Outer{
    var fromOuter : String = "this var is member of outer class"

    fun fromOuter(){
        println("this fun is from outer class")
    }

    inner class InnerClass{
        fun outerclassMember(){

            println(fromOuter)
        }
    }
}

fun main(args : Array<String>){

    var outerMember = Outer().InnerClass().outerclassMember()
    print(outerMember)
}
