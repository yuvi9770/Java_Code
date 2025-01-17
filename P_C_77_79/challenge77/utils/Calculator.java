package P_C_77_79.challenge77.utils;

import P_C_77_79.challenge77.geometry.circle;
import P_C_77_79.challenge77.geometry.rectangle;

public class Calculator {
    public static void main(String[] args) {
        circle cir = new circle(5);
        rectangle rect = new rectangle(15, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breadth;
        System.out.println("Area of circle: " + cirArea);
        System.out.println("Area of rectangle: " + rectArea);
    }
}
