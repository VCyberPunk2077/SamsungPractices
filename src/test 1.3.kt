fun main() {
    var a: Int? = null
    a?.let { it * 2 }
    println(a)
}