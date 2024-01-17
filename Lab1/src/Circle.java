import java.lang.Math;


public class Circle {
    double radius;


    //this is a constructor(parameter for classes)
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) { 
        this.radius = radius;
    }

    public double Area(double radius) {
        return Math.PI * radius * radius;
    }

    public double perimeter(double radius) {
        return Math.PI *(radius *2);
    }

}
