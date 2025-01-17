package P_C_80_82_inherit.c_82;

public class ArrayOperation {

    private int[] number;

    public ArrayOperation(int[] number) {
        this.number = number;
    }

    public static void main(String[] args) {
        ArrayOperation arr = new ArrayOperation(new int[] { 1, 3, 4, 5 });
        ArrayOperation.Statistics sta = new ArrayOperation.Statistics();
        System.out.println(sta.mean(arr.number));
    }

    private static class Statistics {
        double mean(int[] number) {
            double sum = 0;
            for (int num : number) {
                sum += num;
            }
            return sum / number.length;
        }
    }
}
