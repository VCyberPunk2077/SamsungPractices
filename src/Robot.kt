class Robot (var x: Int, var y: Int, var direction: Direction) {
    fun turnLeft() {
         direction = when (direction) {
             Direction.RIGHT -> Direction.UP
             Direction.UP -> Direction.LEFT
             Direction.LEFT -> Direction.DOWN
             Direction.DOWN -> Direction.RIGHT
         }
    }
    fun turnRight() {
        direction = when (direction) {
            Direction.RIGHT -> Direction.DOWN
            Direction.UP -> Direction.RIGHT
            Direction.LEFT -> Direction.UP
            Direction.DOWN -> Direction.LEFT
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.RIGHT -> x++
            Direction.UP -> y++
            Direction.LEFT -> x--
            Direction.DOWN -> y--
        }
    }

    override fun toString(): String {
        return("x: $x, y: $y, dir: $direction")
    }


}