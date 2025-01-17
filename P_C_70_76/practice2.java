package P_C_70_76;

public class practice2 {
    public static void main(String[] args) {
        int marks = 78;
        String name = "ravi";

        System.out.println("Hello, " + name + " your marks is " + marks);

        System.out.printf("Hello, %s your marks is %d", name, marks);
        System.out.printf("%n"); // use to move cursor in another line like "\n"
        System.out.printf("%s %n", name);
        System.out.printf("%15s %n", name);
        System.out.printf("%-15s %n", name);
        System.out.printf("%-15S \n", name);

        int num = 123456789;
        System.out.printf("%d \n", num);
        System.out.printf("%,15d \n", num);
        System.out.printf("%+,15d \n", num);
        System.out.printf("%-+,15d \n", num);
        System.out.printf("%0,15d \n", num);
    }
}
