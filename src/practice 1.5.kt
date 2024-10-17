internal class Point(var x: Int, var y: Int) : Movable {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }
}

internal class CloudOfPoints(val points: ArrayList<Point>) : Movable {
    override fun move(dx: Int, dy: Int) {
        for (point in points) {
            point.move(dx, dy)
        }
    }

    override fun toString(): String {
        return "CloudOfPoints(points=$points)"
    }
}