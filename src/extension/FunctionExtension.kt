package extension

class  ExtensionTest{
    var skills : String = "null"
    fun printMySkills(){
        println(skills)
    }
}
fun main(args :Array<String>){
    var ob1 = ExtensionTest()
    ob1.skills = "Java"

    var ob2 = ExtensionTest()
    ob2.skills = "kotlin"

    var ob3 = ExtensionTest()
    ob3.skills = ob1.addMySkills(ob2)
    ob3.printMySkills()

}

fun ExtensionTest.addMySkills(ob : ExtensionTest):String{
    var ob4 = ExtensionTest()
    ob4.skills = this.skills + " "+ob.skills;
    return  ob4.skills
}