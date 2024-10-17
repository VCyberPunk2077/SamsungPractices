import kotlin.math.abs
import kotlin.math.max

fun main() {
    val s = readln().split(" ")
    val k:Int = s[0].toInt()
    val x:Int = s[1].toInt()
    val y:Int = s[2].toInt()

    if (k - max(x, y) >= 2) {
        print(k - max(x, y))
    }
    else if ( ( 0 <= k - max(x, y)) && (abs(x - y) < 2) )  {
        print(2 - abs(x - y))
    }
    else if ( ( 0 <= k - max(x, y)) && (abs(x - y) > 2) ) {
        print(k - max(x,y))
    }
    else {
        if (abs(x - y) > 2) {
            print(0)
        }
        else print(2 - abs(x - y))
    }
}