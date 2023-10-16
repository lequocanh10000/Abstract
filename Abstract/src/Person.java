import java.util.List;
public class Person {
    private String name;
    private String address;

    private List<Vehicle> vehicleList;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber) {
        for(Vehicle value : vehicleList) {
            if(value.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(value);
            }
        }
    }

    public String getVehiclesInfo() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
