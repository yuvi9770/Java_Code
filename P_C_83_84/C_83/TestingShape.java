package P_C_83_84.C_83;

public class TestingShape {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Square sq = new Square(123);

        System.out.println("Area of circle is " + cir.CalculateArea());
        System.out.println("Area of sq is " + sq.CalculateArea());

    }
}
