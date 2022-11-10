package Transports;

public abstract class Car {
    private String brand;
    private String model;
    private float engineVolume;

    public Car(String brand, String model, int engineVolume) {
        this.setBrand(brand);
        this.setModel(model);
        this.setEngineVolume(engineVolume);
    }

    boolean parameterIsNotCorrect(String parametr) {
        return (parametr == null || parametr.isEmpty());
    }

    void startMoving() {

    }

    void finishMoving() {

    }

      public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (parameterIsNotCorrect(brand)) {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        if (parameterIsNotCorrect(model)) {
            this.model = "default";
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
}
