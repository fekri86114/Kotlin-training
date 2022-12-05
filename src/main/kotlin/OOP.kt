private class Human ( nameHuman: String , familyHuman: String , mobileHuman: String ) {

     private var name: String = nameHuman
     private val lastName: String = familyHuman
     private val phoneNumber: String = mobileHuman

    fun introduce() {
        println("Hello, I'm $name $lastName. My phone number: $phoneNumber")
    }

    fun sayHello() {
        println("Hello everyone!")
    }

    fun sayGoodbye() {
        println("Goodbye!")
    }

    fun eatBreakfast() {
        println("I'm eating breakfast")
    }

    fun goToSchool() {
        println("I'm going to school")
    }

    fun sleep() {
        println("I'm sleeping")
    }

    fun eatFruit( nameFruit: String ) {
        println("I'm eating $nameFruit")
    }

}

fun main() {
    val hadi = Human( "hadi" , "fekri" , "09141001010" )
    hadi.introduce()
}

// 19 is done