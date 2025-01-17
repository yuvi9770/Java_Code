package P_C_96_98.practice;

public class TestEnums {
    
    public static void main(String[] args) {
        TrafficLight_ENUM color = TrafficLight_ENUM.RED;

        //TrafficLight color = TrafficLight.valueOf("RED");  //this line throws an exception if it find the given argument is not defined
                                                             // valueof() is used fetch data from database       

        System.out.println(color);
        System.out.println(color.getAction());
          
          

        Grade_ENUM g = Grade_ENUM.A;
        System.out.println(g);
        
        for (Grade_ENUM values : Grade_ENUM.values()) {
            System.out.println(values);
        }

    }
}
