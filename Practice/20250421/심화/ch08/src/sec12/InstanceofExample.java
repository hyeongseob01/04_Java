package sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    static void ride(Vehicle v) {
        if (v instanceof Bus) {
            Bus bus = (Bus) v;
            bus.checkFare();
        }
        v.run();
    }
}

