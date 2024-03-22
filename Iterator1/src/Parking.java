import java.util.ArrayList;
import java.util.List;

public class Parking{

    private List<Vehicle> vehicles;

    public Parking(){
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Iterator createIterator(){
        return new VehicleIterator(this.vehicles);
    }
}
