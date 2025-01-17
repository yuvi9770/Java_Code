package P_C_77_79.challenge78;

public class TestAcc {
    public static void main(String[] args) {
        BankAccount Acc = new BankAccount("001", "Yug");
        Acc.depositMoney(100);
        System.out.println(Acc.withdrawMoney(50));
        System.out.println(Acc.withdrawMoney(100));
        System.out.println(Acc.withdrawMoney(-50));
        Acc.depositMoney(-21);
    }

}
