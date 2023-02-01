package Transport.Mechanic;

import java.util.Objects;

public class Mechanic {

    private String fullName;
    private String company;
    private final TypeTransport typeTransport;


    public Mechanic(String fullName, String company, TypeTransport typeTransport) {
        this.fullName = fullName;
        this.company = company;
        this.typeTransport = typeTransport;

    }

    private void performMaintenance() {
        System.out.println(fullName + "из компании" + company + "проводит техобслуживание.");
    }

    private void fixing() {
        System.out.println(fullName + "из компании" + company + "чинит машину.");

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isBlank() && !fullName.isEmpty()) {
            this.fullName = fullName;
        } else {
            this.fullName = " Имя Фамилия ";
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null && !company.isBlank() && !company.isEmpty()) {
            this.company = company;
        } else {
            this.company = " Компания ";
        }
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    @Override
    public String toString() {
        return " Механик " +
                fullName +
                " ремонтирует класс " + typeTransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return getFullName().equals(mechanic.getFullName()) && getCompany().equals(mechanic.getCompany()) && getTypeTransport() == mechanic.getTypeTransport();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getCompany(), getTypeTransport());
    }
}
