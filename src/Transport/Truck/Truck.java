package Transport.Truck;

import Transport.Driver.DriverC;
import Transport.Transport;

public class Truck extends Transport<DriverC> {
    public Truck(String brand, String model, DriverC driver) {
        super(brand, model, driver);
    }
}
