package com.positions;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distanceResult = Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
        return distanceResult;
    }

    public double distance(int x, int y) {
        double distanceResult = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return distanceResult;
    }

    public double distance(Point another) {
        double distanceResult = Math.sqrt((another.getX() - this.x) * (another.getX() - this.x) + (another.getY() - this.y) * (another.getY() - this.y));
        return distanceResult;
    }

}
