package P_C_83_84.C_83;

public class Circle extends Shape {

    private int Radius;

    public Circle(int radius) {
        Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * Math.pow(Radius, 2);

    }
}