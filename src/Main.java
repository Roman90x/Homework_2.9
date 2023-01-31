
import Transport.Bus.Bus;
import Transport.Car.Car;
import Transport.Driver.Driver;
import Transport.Driver.DriverB;
import Transport.Driver.DriverC;
import Transport.Driver.DriverD;
import Transport.Mechanic.Mechanic;
import Transport.Mechanic.TypeTransport;
import Transport.Transport;
import Transport.Truck.Truck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коллекции. Часть 1.");
        System.out.println("");

        Car audi = new Car(" AUDI ", " A8 50 L TDI quattro ",
                new DriverB(" Водитель легкового автомобиля ", true, -10));
        Car bmw = new Car(" BMW ", " Z8 ",
                new DriverB(" Водитель легкового автомобиля ", true, -10));

        Truck scania = new Truck(" Scania ", " R520 ",
                new DriverC(" Водитель грузового автомобиля ", true, 25));
        Truck volvo = new Truck(" Volvo ", " FM13 ",
                new DriverC(" Водитель грузового автомобиля ", true, 25));

        Bus higer = new Bus(" Higer ", " KLQ6128LQ ",
                new DriverD(" Водитель автобуса ", true, 0));
        Bus mersedes = new Bus(" Mercedes-Benz ", " Sprinter ",
                new DriverD(" Водитель автобуса ", true, 0));


        Mechanic mechanic1 = new Mechanic(" Громов Егор ", " Реактор ", TypeTransport.CAR);
        Mechanic mechanic2 = new Mechanic(" Титов Денис ", " Автодром ", TypeTransport.TRUCK);
        Mechanic mechanic3 = new Mechanic(" Отто Марк ", " Инойл ", TypeTransport.BUS);
        Mechanic mechanic4 = new Mechanic(" Белов Антон ", " Авангард ", TypeTransport.ALL);

        audi.addMechanic(mechanic1);
        bmw.addMechanic(mechanic1);
        scania.addMechanic(mechanic2);
        volvo.addMechanic(mechanic2);
        mersedes.addMechanic(mechanic3);
        higer.addMechanic(mechanic4);
        audi.addMechanic(mechanic1);

        List<Transport<?>> racers = new ArrayList<>();
        racers.add(audi);
        racers.add(bmw);
        racers.add(volvo);
        racers.add(scania);
        racers.add(higer);
        racers.add(mersedes);


        Map<Transport<?>, Mechanic> transportMechanicMap = new HashMap<>();
        for (Transport<?> racer : racers) {
            for (Mechanic mechanic : racer.getMechanics()) {
                transportMechanicMap.put(racer, mechanic);
            }
        }

        for (Map.Entry<Transport<?>, Mechanic> entry : transportMechanicMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }


}