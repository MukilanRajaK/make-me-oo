package org.oop;

import java.util.Objects;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        if(this.equals(to))
        {
            return 0;
        }
        double xDistance = to.x-this.x;
        double yDistance = to.y-this.y;
        double xSquare = Math.pow(xDistance, 2);
        double ySquare = Math.pow(yDistance, 2);
        return Math.sqrt(xSquare + ySquare);
    }

    public double direction(Point to) {
        if(this.equals(to))
        {
            return 0;
        }
        double xDistance = to.x-this.x;
        double yDistance = to.y-this.y;
        return Math.atan2(yDistance, xDistance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
