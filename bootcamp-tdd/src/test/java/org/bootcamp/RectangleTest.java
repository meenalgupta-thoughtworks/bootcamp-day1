package org.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    final static Double LENGTH = 5.0;
    final static Double BREADTH = 5.0;

    @Test
    public void findRectangleAreaTest() {
        final Double AREA = 25.0;
        Rectangle rectangle = new Rectangle(LENGTH, BREADTH);
        Double area = rectangle.area();
        assertEquals(AREA, area);
    }

    @Test
    public void findRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(LENGTH, BREADTH);
        final Double perimeter = 20.0;
        assertEquals(perimeter, rectangle.perimeter());
    }
}

