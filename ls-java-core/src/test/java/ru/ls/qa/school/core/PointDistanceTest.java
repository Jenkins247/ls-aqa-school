package ru.ls.qa.school.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.core.point.Point;

public class PointDistanceTest {
    @Test
    public void testAbDistanceForPosNum() {
        int expectedValue = 5;
        Point pointA = new Point(2, 3);
        Point pointB = new Point(5, 7);
        Assertions.assertEquals(expectedValue, pointA.distance(pointB));
    }

    @Test
    public void testAbDistanceForNegativeNum() {
        double expectedValue = 11.661903789690601;
        Point pointA = new Point(-1, 3);
        Point pointB = new Point(5, -7);
        Assertions.assertEquals(expectedValue, pointA.distance(pointB));
    }


    @Test
    public void testAbDistanceForZero() {
        double expectedValue = 0.00;
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 0);
        Assertions.assertEquals(expectedValue, pointA.distance(pointB));
    }

    @Test
    public void testAaDistanceEqlZero() {
        double expectedValue = 0.00;
        Point pointA = new Point(200, 300);
        Assertions.assertEquals(expectedValue, pointA.distance(pointA));
    }

    @Test
    public void testAbDistanceEqualsBa() {
        Point pointA = new Point(2, -10);
        Point pointB = new Point(-13, 9);
        Assertions.assertEquals(pointA.distance(pointB), pointB.distance(pointA));
    }
}