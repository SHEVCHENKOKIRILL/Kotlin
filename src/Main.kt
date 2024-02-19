//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello! My name is DICT_Bot.")
    println("Please, remind me your name.")
    val name = readLine()
    println("What a great name you have, $name")


    println("Let me guess your age")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3: Int = readLine()!!.toInt()
    val remainder5: Int = readLine()!!.toInt()
    val remainder7: Int = readLine()!!.toInt()
    val age = (remainder3 * 70 + remainder5 * 21 +remainder7 * 15) % 105
    println("Your age is $age")


    println("Now I will prove to you that I can count to any number you want.")
    val num: Int = readLine()!!.toInt()
    var sum = 0
    for (i in 0..num){
        sum += i
        println("$i")
    }


    var num1: Int
    do {
        println("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.")
        num1 = readLine()?.toIntOrNull() ?: 0

        if (num1 != 1 && num1 != 2 && num1 != 3) {
            println("Please, try again.")
        }
    } while (num1 != 1 && num1 != 2 && num1 != 3)

    println("Completed, have a nice day!\n" +
            "Congratulations, have a nice day!")
}