import java.time.LocalDate

//#1#2
fun main(){
    println("Enter the number: ")
    val number = readLine()?.toIntOrNull()
    if (number != null) {
        if (number % 2 == 0) {
            println("Even")
            val even = number * 4
            println(even)
        } else {
            println("Odd")
            val odd = number * 5
            println(odd)
        }
    } else {
        println("No correct")
    }

//    #3
    println("Enter the different number")
    val i = readLine()
    val numb = i?.toDoubleOrNull()
    if (numb != null) {
        val neg_num = -Math.abs(numb)
        println(neg_num)
    } else {
        println("No correct")
//    }


//    #4
        println("Enter the year")
        val year = readLine()?.toIntOrNull()
        if (year != null) {
            val year_now = LocalDate.now().year
            val age = year_now - year
            println(age)
        }

//    #5
        val arr = arrayOf(81, 24, 9, 17, 61)
        println(arr.joinToString())
        val minimum = arr.minOrNull()
        println("Minimum value: $minimum")

//    #6
        val listOf = arrayOf(7, 84, 23, 17, 42, 53)
        println(listOf.joinToString())
        val values = listOf.sortedDescending()
        val first = values[0]
        val second = values[1]
        println("Maximum values: $first $second")

//    #7
        val pos_neg = arrayOf(7, -51, 23, 6, -12, -4, 1, 81, 35, -19)
        println(pos_neg.joinToString())
        var pos = 0
        var neg = 0
        for (i in pos_neg) {
            if (i > 0) {
                pos += 1
            } else if (i < 0) {
                neg += i
            }
        }
        println("[$pos, $neg]")

//  #8
        val litters = arrayOf("l", "u", "o", "h", "e", "g", "c", "a", "i")
        println(litters.joinToString())
        var c = 0
        for (w in litters) {
            for (char in w.toLowerCase()) {
                if (char in "aeiou") {
                    c++
                }
            }
        }
        println(c)

//    #9
        println("Enter the word")
        val random_word = readLine()
        if (!random_word.isNullOrEmpty()) {
            val middle = random_word.length / 2
            val d: Char = if (random_word.length % 2 == 0) {
                random_word[middle - 1]
            } else {
                random_word[middle]
            }
            println(d)
        }
    }
}