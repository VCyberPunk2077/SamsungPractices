fun main() {
    val r = Robot(0,1,Direction.UP)
    moveRobot(r, 3, 7)
    println("${r.x} ${r.y}")
}

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    while (r.x != toX || r.y != toY) {
        when {
            r.y < toY -> {
                while(r.direction != Direction.UP){
                    r.turnRight()
                }
            }
            r.y > toY -> {
                while(r.direction != Direction.DOWN){
                    r.turnRight()
                }
            }
            r.x < toX -> {
                while(r.direction != Direction.RIGHT){
                    r.turnRight()
                }
            }
            r.x > toX -> {
                while(r.direction != Direction.LEFT){
                    r.turnRight()
                }
            }
        }
        r.stepForward()
    }
}