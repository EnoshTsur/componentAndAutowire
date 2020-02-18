package run

fun main(args: Array<String>) {
    println("Hi there!")

    val enosh = Person("Enosh", 29)

    val alpha = "A".."Z"

    print("F in alpha? : ${"F" in alpha}")
}

class Person(private var name: String, private var age: Int) {

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}
