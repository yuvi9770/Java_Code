package P_C_70_76;

public class StudentTostr {
    int age;
    int rollNumber;
    String name;
    String address;

    public StudentTostr(int age, int rollNumber, String name, String address) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student detail: [age=" + age + ", rollNumber=" + rollNumber + ", name=" + name + ", address=" + address
                + "]";
    }

    public static void main(String[] args) {
        StudentTostr stu = new StudentTostr(21, 4560, "Shayam", "New Delhi");
        System.out.println(stu);
    }
}