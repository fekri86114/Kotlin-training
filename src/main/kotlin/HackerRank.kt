fun main() {
    println("chandbar kharid kardeid?")
    val barKharid = readLine()!!.toInt()

    println("harbar chandta khrideid? be nobe benevisid")
    val chandta = mutableListOf<Int>()

    for (i in 1..barKharid) {
        chandta.add(readLine()!!.toInt())
    }

    println("chand beheshoon dadi? be nobe benevisid")
    val pool = mutableListOf<Int>()

    for (i in 1..barKharid) {
        pool.add(readLine()!!.toInt())
    }

    val answer =
        ((chandta[0] * pool[0]) + (chandta[1] * pool[1]) + (chandta[2] * pool[2])) / (chandta[0] + chandta[1] + chandta[2])

    println("miyangin kharid shoma: $answer")
}

// ------------------------------------ 1 ----------------------------------------------
/*
fun main() {

    val a: Array<Int> = arrayOf(3, 0, 0)
    val b: Array<Int> = arrayOf(11, 2, 4)
    val c: Array<Int> = arrayOf(4, 5, 6)
    val d: Array<Int> = arrayOf(10, 8, -12)

    val f: Array<Array<Int>> = arrayOf(a, b, c, d)

    println(diagonalDifference(f))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var sum = 0
    var sum1 = 0
    for (i in 0..arr.size - 1) {
        sum += arr[i][i]
        sum1 += arr[i][arr.size - 1 - i]
    }
    return abs(sum - sum1)
}
*/

// ------------------------------------- 2 ----------------------------------------------
/*   // val a= ( (10 * 1000) + (20 * 1500) + (30 * 2000) ) / 60

    println("chandbar kharid kardeid?")
    val barKharid = readLine()!!.toInt()

    println("harbar chandta khrideid? be nobe benevisid")
    val chandta = mutableListOf<Int>()

    for (i in 1..barKharid) {
        chandta.add(readLine()!!.toInt())
    }

    println("chand beheshoon dadi? be nobe benevisid")
    val pool = mutableListOf<Int>()

    for (i in 1..barKharid) {
        pool.add(readLine()!!.toInt())
    }

    val answer =
        ((chandta[0] * pool[0]) + (chandta[1] * pool[1]) + (chandta[2] * pool[2])) / (chandta[0] + chandta[1] + chandta[2])

    println("miyangin kharid shoma: $answer")
    */