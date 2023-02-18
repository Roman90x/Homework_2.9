package Transport.Car;

import Transport.Driver.DriverB;
import Transport.Transport;

public class Car extends Transport<DriverB> {
    public Car(String brand, String model, DriverB driver) {
        super(brand, model, driver);
    }
}
