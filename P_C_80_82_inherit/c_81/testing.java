package P_C_80_82_inherit.c_81;

public class testing {

    public static void main(String[] args) {
        Person person1 = new Person("Ram", 21);
        Person person2 = new Person("Ram", 21);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        if (person1.equals(person2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
