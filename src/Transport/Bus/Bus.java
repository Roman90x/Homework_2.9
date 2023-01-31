package Transport.Bus;

import Transport.Driver.DriverD;
import Transport.Transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model,DriverD driver) {
        super(brand, model, driver);
    }
}
