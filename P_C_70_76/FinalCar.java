package P_C_70_76;

public class FinalCar {
    final int noOfWheels;
    final int noOfDoors;
    final String Model;

    public FinalCar(int noOfWheels, int noOfDoors, String model) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        Model = model;
    }

    @Override
    public String toString() {
        return "FinalCar [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", Model=" + Model + "]";
    }

    public static void main(String[] args) {
        FinalCar swift = new FinalCar(4, 4, "petrol");
        System.out.println(swift);
    }
}
