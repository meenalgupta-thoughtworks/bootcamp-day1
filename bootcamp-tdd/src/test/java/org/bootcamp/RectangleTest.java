package org.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {


    @Test
    public void calculateRectangleArea() {
        Rectangle rectangle = new Rectangle();

        Double area = rectangle.calculateArea(5.0, 5.0);
        assertEquals(25.0, area);
    }
}
