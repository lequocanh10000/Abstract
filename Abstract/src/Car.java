import java.util.List;
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

     public String getInfo(){
        return "Car:" + "/n"
                + "/t" + "Brand: " + this.brand
                + "/t" + "Brand: " + this.brand
                + "/t" + "Brand: " + this.brand
                + "/t" + "Brand: " + this.brand;
     }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
