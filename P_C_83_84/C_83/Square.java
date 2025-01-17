package P_C_83_84.C_83;

public class Square extends Shape {

    private int Side;

    public Square(int side) {
        Side = side;
    }

    public int getSide() {
        return Side;
    }

    @Override
    public double CalculateArea() {

        return Math.pow(Side, 2);
    }

}
