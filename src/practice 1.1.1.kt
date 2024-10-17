fun main() {
    val input = readln().split(' ')
    val a = input[0].toFloat(); val b = input[1].toFloat(); val m = input[2].toFloat(); val n = input[3].toFloat();
    if ((a > m || b > n) || (a > n || b > m)){
        print("YES")
    }
    else print("NO")
}