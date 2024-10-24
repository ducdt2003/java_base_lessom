package baitap12;

public class Patient extends People {
    private String medicalRecordNumber;
    private int dateTime;

    public Patient() {
    }

    public Patient(String name, int age, String medicalRecordNumber, int dateTime) {
        super(name, age);
        this.medicalRecordNumber = medicalRecordNumber;
        this.dateTime = dateTime;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public int getDateTime() {
        return dateTime;
    }

    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "medicalRecordNumber='" + medicalRecordNumber + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
