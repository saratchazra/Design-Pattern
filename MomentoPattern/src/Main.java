public class Main {
    public static void main(String[] args) {

        System.out.println("Momento Method");

        Originator originator = new Originator("Sarat","sarat@gmail.com");

        CareTaker careTaker = new CareTaker();

        // add 1st snapShot
        careTaker.add(originator.createMomento());
        System.out.println(originator.getName());
        // update originator
        originator.setName("Deepak");
        careTaker.add(originator.createMomento());
        System.out.println(originator.getName());
        System.out.println(originator.getEmail());
        //

        originator.restoreFromMomento(careTaker.get(0));

        System.out.println(originator.getName());
    }
}
