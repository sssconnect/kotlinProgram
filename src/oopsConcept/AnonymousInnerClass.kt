package oopsConcept

interface  Human{
    fun think()
}
fun main(args:Array<String>){
    var programmer : Human = object :Human{

        override fun think() {
            print("this is an example of anonymousInnerClass")
        }

    }
    programmer.think()
}