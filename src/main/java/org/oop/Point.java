package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        double xDistance = to.x-this.x;
        double yDistance = to.y-this.y;
        double xSquare = Math.pow(xDistance, 2);
        double ySquare = Math.pow(yDistance, 2);
        return Math.sqrt(xSquare + ySquare);
    }

    public double direction(Point to) {
        double xDistance = to.x-this.x;
        double yDistance = to.y-this.y;
        return Math.atan2(yDistance, xDistance);
    }
}
