package P_C_77_79.challenge78;

class BankAccount {

    private String AccountNumber;
    private String AccountHolderName;
    private double Balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid deposit");
        } else {
            Balance += money;
        }
    }

    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("invalid withdraw");
        } else if (Balance >= money) {
            Balance -= money;
        } else {
            System.out.print("only allowed: ");
            money = Balance;
            Balance = 0;
        }
        return money;
    }
}
