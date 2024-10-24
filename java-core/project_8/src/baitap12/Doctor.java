package baitap12;

public class Doctor extends People{
    private String Specialty;
    private String numberOfWrkingHours;

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public String getNumberOfWrkingHours() {
        return numberOfWrkingHours;
    }

    public void setNumberOfWrkingHours(String numberOfWrkingHours) {
        this.numberOfWrkingHours = numberOfWrkingHours;
    }

    public Doctor() {
    }

    public Doctor(String name, int age, String specialty, String numberOfWrkingHours) {
        super(name, age);
        Specialty = specialty;
        this.numberOfWrkingHours = numberOfWrkingHours;
    }
}
