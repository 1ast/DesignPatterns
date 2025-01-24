package generative.prototype

import java.util.Date

//Data class implements prototype automatically (copy, equals, hashcode)
fun main() {
    val prototype1 = Prototype("prototype1", date = Date())
    val prototype2 = prototype1.copy()

    println("Prototype1 is${if (prototype1 != prototype2) "not" else " "} equal Prototype2")
    println("Prototype1 is${if (prototype1 !== prototype2) "not" else " "} the same that Prototype2")
}

data class Prototype(
    val name: String,
    val date: Date
)
