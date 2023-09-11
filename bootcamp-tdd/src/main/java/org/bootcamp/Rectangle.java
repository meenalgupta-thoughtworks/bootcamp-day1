package org.bootcamp;

public class Rectangle {

    // TODO :  dont use constants
    //  use @BeforeEach, and initialise the area and perimeter there
    // cover negative TCs,

    private Double length;
    private Double breadth;

    public Rectangle(Double length, Double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public Double area() {
        return this.length * this.breadth;
    }
    public Double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
