package P_C_96_98.c_97;

public class ENUM_Testing {
    public static void main(String[] args) {
        
        System.out.println("Print all Days of a week:");

        for (Day val : Day.values()) {
            System.out.printf("%s : %s \n",val,val.getType());
        }
    }
}
