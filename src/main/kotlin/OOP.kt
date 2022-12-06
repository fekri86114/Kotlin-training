open class Human(
    open protected val name: String,
    protected val lastName: String,
    protected val phoneNumber: String
) {
    open fun introduce() {
        println("Hello, I'm $name $lastName. My phone number: $phoneNumber")
    }
}

class Student(
    private val studentId: Int,
    private val entranceYear: Int,
    private val passedCourses: Int,
    private val nameUniversity: String,
    private val rankUniversity: Int,
    name: String,
    lastName: String,
    phoneNumber: String
) : Human(name, lastName, phoneNumber) {

    override val name: String
        get() = "Mohammadreza"

    override fun introduce() {
        super.introduce()
        println("name: $name")
        println("lastname: $lastName")
        println("phone number: $phoneNumber")
        println("university name: $nameUniversity")
        println("university rank: $rankUniversity")
    }
}
fun main() {
    val sara = Student(
        202,
        2025,
        5,
        "Stanford",
        3,
        "Sara",
        "Jackson",
        "012345678910"
    )
    sara.introduce()
}