public class Car {

    private String model;
    private String engineType;
    private String fuelTour;
    private int horsePower;


    public Car(String model, String engineType, String fuelTour, int horsePower) {
        this.model = model;
        this.engineType = engineType;
        this.fuelTour = fuelTour;
        this.horsePower = horsePower;

    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelTour() {
        return fuelTour;
    }

    public void setFuelTour(String fuelTour) {
        this.fuelTour = fuelTour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}