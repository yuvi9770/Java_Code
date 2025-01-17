package P_C_85_86;

public class practice_passByReference {

public static void main(String[] args) {
    point num = new point(5, 11);
    System.out.println("Num: " + num);
    change(num);
    System.out.println("Num: " + num);
    
}

public static void change(point p){
    // p.x++;
    // p.y++;
    int temp = p.x;
    p.x =p.y;
    p.y = temp;

    System.out.println(p);
}

    public static class  point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point [x=" + x + ", y=" + y + "]";
    }
        
    }
}
