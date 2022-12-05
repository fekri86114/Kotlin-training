/**
 * Created by Mohammadreza Fekri.
 * Github: fekri86114
 * */

fun studentsGrade(grade: List<Int>, top: Int = 18): Int {

    var count = 0

    grade.forEach {
        if (it > top) {
            count++
        }
    }
    return count
}

fun main() {
    val gradeList = listOf<Int>(12, 18, 14, 19, 20, 20, 13, 17, 16)
    val topScore = 18
    val result = studentsGrade(gradeList, topScore)
    println(result)

}


/*
    val month = readLine()!!.toInt()
    when (month) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
//        in 1..12 -> println("You request is possible.") // It checks if the input numbers are between 1 and 12.
//        !in 1..12 -> println("You request is not possible.") // It checks if the numbers are not between 1 and 12 and does something else

        else -> println("Your request is not possible.")
    }
     */

/*
* array          => fixed size
* arrayList      => not fixed
* List           => نوع ذخیره سازی متفاوت
* mutableList    => a list that is changeable - Mutable
* */

/*    var name: String = "MohammadReza"
    var familyName: String? = null

    // 1.method to check null
    if ( familyName != null ) {
        println( familyName.toInt() )
    }

    // 2.second method: kotlin method 1
    familyName?.toInt() // check if is not null, then run the code
    familyName?.toInt() ?: "20"

    // kotlin method 3
    familyName!!.toInt()

    // kotlin method 3
    familyName?.let {
        it.toInt()
    }
*/