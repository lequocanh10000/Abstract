import java.util.List;
public class Motorbike extends Vehicle {
    private boolean hasSidecar;

    public Motorbike(String brand, String model, String registrationNumber, Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    public String getInfo() {
        return null;
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }
}
