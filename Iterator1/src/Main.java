public class Main {

    public static void main(String[] args) {
        System.out.println("Iterator Method");

        Parking parking = new Parking();

        parking.addVehicle(new Vehicle("1"));
        parking.addVehicle(new Vehicle("2"));
        parking.addVehicle(new Vehicle("3"));
        parking.addVehicle(new Vehicle("4"));

        Iterator iterator = parking.createIterator();

        while (iterator.hasNext()){
            Vehicle vehicle = (Vehicle) iterator.next();
            System.out.println(vehicle.getNumber());
        }

    }
}
