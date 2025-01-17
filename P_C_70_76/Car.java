package P_C_70_76;

public class Car {
    // this is practive of method toString()
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;

    String name;
    String modelName;
    String Company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelName, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelName = modelName;
        this.Company = company;
    }

    @Override
    public String toString() {
        return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
                + name + ", modelName=" + modelName + ", Company=" + Company + "]";
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "swift", "SW678", "Maruti");
        System.out.println(swift.toString());
    }
}
