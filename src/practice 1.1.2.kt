fun main() {
    val string:String = readln()
    var countA = 0; var countT = 0; var countG = 0; var countC = 0
    for (i in string) {
        when (i) {
            'A' -> countA++
            'T' -> countT++
            'G' -> countG++
            'C' -> countC++

        }
    }
    println("$countA $countT $countG $countC")
}