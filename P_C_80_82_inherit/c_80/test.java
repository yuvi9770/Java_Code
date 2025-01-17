package P_C_80_82_inherit.c_80;

public class test {
    public static void main(String[] args) {
        LibraryItem lib = new LibraryItem("Java", "Jack", "FGF87");
        System.out.println(lib);

        Magazine mag = new Magazine("tr");
        System.out.println(mag.getIssueNumber());

    }

}
