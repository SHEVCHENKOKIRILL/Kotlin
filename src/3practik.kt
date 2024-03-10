import kotlin.random.Random
fun main() {
    val objects = listOf("stone", "scissors", "paper")
    val ranObject = objects.random()
    println("Choose the object: ")
    val choice = readLine()
    if (choice in objects){
        println(ranObject)
        println(choice)
        if (choice == ranObject){
            println("Nobody win")
        } else{
            when (choice){
                "stone" -> if (ranObject == "scissors"){
                    println("You win!")
                }else {
                    println("You lose!")
                }
                "scissors" -> if (ranObject == "paper"){
                    println("You win!")
                }else {
                    println("You lose")
                }
                "paper" -> if (ranObject == "stone"){
                    println("You win")
                } else{
                    println("You lose")
                }
            }
        }
    } else{
        println("Try again")
    }
}