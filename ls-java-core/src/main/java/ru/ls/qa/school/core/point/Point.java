package ru.ls.qa.school.core.point;

public class Point {
    private double xPoint;
    private double yPoint;

    public Point(double x, double y) {
        this.xPoint = x;
        this.yPoint = y;
    }

    public double distance(Point point) {
        double rangeX = this.xPoint - point.xPoint;
        double rangeY = this.yPoint - point.yPoint;
        return Math.sqrt(rangeX * rangeX + rangeY * rangeY);
    }
}