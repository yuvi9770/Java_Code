package P_C_70_76;

import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle spec: [radius" + radius + " ,Circumference:" + getCircumference() + " ,Area:" + getArea() + "]";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in circles");
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
        input.close();
    }
}
