import Transports.Bus;
import Transports.PassengerCar;
import Transports.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PassengerCar car1 = new PassengerCar("LADA", "2105", 0);
        PassengerCar car2 = new PassengerCar("LADA", "2105", 0);
        PassengerCar car3 = new PassengerCar("LADA", "2105", 0);
        PassengerCar car4 = new PassengerCar("LADA", "2105", 0);

        Truck truck1 = new Truck("КАМАЗ", "2105", 0);
        Truck truck2 = new Truck("КАМАЗ", "2105", 0);
        Truck truck3 = new Truck("КАМАЗ", "2105", 0);
        Truck truck4 = new Truck("КАМАЗ", "2105", 0);

        Bus bus1 = new Bus("ЛИАЗ", "2105", 0);
        Bus bus2 = new Bus("ЛИАЗ", "2105", 0);
        Bus bus3 = new Bus("ЛИАЗ", "2105", 0);
        Bus bus4 = new Bus("ЛИАЗ", "2105", 0);




    }
}