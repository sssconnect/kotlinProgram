fun main(args: Array<String>) {

    print("enter your choice")
   var  x = readLine()!!.toInt()

    when (x) {

        1 -> print("x == 1")
        2 -> print("X == 2")
        else -> {
            print("x is niether 1 or 2")
        }
    }
}