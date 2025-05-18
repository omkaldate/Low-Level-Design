package SOLID.openClosePrinciple;
 /*
 To add a new shape, you dont have to modify the calculateArea method,
 Now, to add a new shape like Triangle, you just implement the Shape interface:
  */

class Triangle implements Shape {
    private double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
