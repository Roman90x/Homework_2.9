package Transport.Mechanic;

public enum TypeTransport {
    CAR("легковые автомобили"),
    TRUCK("грузовые автомобили"),
    BUS("автобусы"),
    ALL("все виды");

    private final String name;


    TypeTransport(String name) {
        this.name = name;
    }
}
