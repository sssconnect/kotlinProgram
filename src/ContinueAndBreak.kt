fun main(args: Array<String>) {
    innerLoop@ for (i in 1..10){
        for (j in 1..10){

            if (j == 5){
                continue
            } else if(j == 6){
                break
            }
           else{
                println("value of i = $i and j = $j")
            }
        }
    }
}