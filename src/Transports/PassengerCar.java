package Transports;

public class PassengerCar extends Car implements Competable{
    public PassengerCar(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 8;
    }

    @Override
    public int maxSpeed() {
        return 150;
    }
}
