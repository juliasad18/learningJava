package com.positions;

public class Application {
    public static void main(String[] args) {
        Point firstPoint = new Point(6 ,5);
        Point secondPoint = new Point(3 ,1);

        System.out.println(firstPoint.distance());
        System.out.println(firstPoint.distance(2, 2));
        System.out.println(firstPoint.distance(secondPoint));

        Point point = new Point();
        System.out.println(point.distance());

    }
}
