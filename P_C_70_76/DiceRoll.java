package P_C_70_76;

public class DiceRoll {

    int rolls() {
        double num = Math.random() * 6;
        return (int) Math.round(num); // Ceil and round both can be used here
    }

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        for (int i = 0; i < 100; i++) {
            System.out.println(dice.rolls());
        }
    }
}
