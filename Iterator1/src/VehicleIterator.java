import java.util.List;

public class VehicleIterator implements Iterator{

    private List<Vehicle> vehicles;
    private int index;

    public VehicleIterator(List<Vehicle> vehicles) {
        this.index = 0;
        this.vehicles = vehicles;
    }

    @Override
    public boolean hasNext() {
        if(vehicles.size() -1 < index){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return vehicles.get(index++);
    }
}
