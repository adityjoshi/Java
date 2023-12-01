
/*
Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

 */



package Recursion.oops;

public class perimeterArea {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10);
        System.out.println(" Perimeter of circle: " + myCircle.getPerimeter());
        System.out.println("Area of circle: " + myCircle.getArea());
    }
    static public class Shape {
        public double getPerimeter() {
            return 0;
        }
        public double getArea() {
            return 0;
        }
    }
     static class Circle extends Shape{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getPerimeter() {
            return 2*Math.PI*radius;
        }

        public double getArea() {
            return Math.PI*radius*radius ;
        }
    }
}
