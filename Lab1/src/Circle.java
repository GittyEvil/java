import java.lang.Math;


public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius =radius;
    }

    public double Area(double radius) {
        return Math.PI * radius * radius;
    }

    public double perimeter(double radius) {
        return Math.PI *(radius *2);
    }

}
