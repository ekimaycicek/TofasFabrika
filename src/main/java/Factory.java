import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Car> cars;

    public void factory() {
        this.cars = new ArrayList<>();
    }



    public void addCar(Car car) {
        cars.add(car);
        System.out.println("New car added: " + car.getModel());
    }

    public void productionTime() {
        for (Car car : cars) {
            partsSupply(car);
            assembly(car);
            paintProcess(car);
            qualityControl(car);
            System.out.println(car.getModel() + " production of the car is completed.");
        }
    }

    private void partsSupply(Car car) {
        System.out.println(car.getModel() + " parts are supplied for the car...");
        // Parçaların temin işlemleri
    }

    private void assembly(Car car) {
        System.out.println(car.getModel() + " car being assembled...");
        // Montaj işlemleri
    }

    private void paintProcess(Car car) {
        System.out.println(car.getModel() + " car is being painted...");
        // Boya işlemi
    }

    private void qualityControl(Car car) {
        System.out.println(car.getModel() + " car undergoes quality control...");
        // Kalite kontrol işlemleri
    }
}