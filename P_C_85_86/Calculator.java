package P_C_85_86;

public class Calculator {
    

    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b,int c){
        return a + b +c;
    }
    public double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        System.out.println(cal.add(5,6));
        System.out.println(cal.add(5,6,8));
        System.out.println(cal.add(5,6.2));
        System.out.println(cal.add(5.5,65.3));

    }
}
