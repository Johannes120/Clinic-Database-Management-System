package model;

public class Medication {

    private int medicationId;
    private String medicationName;
    private String dosage;
    private String sideEffects;

    // Constructor
    public Medication(int medicationId, String medicationName, String dosage, String sideEffects) {
        this.medicationId = medicationId;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
    }

    // Empty constructor
    public Medication() {}

    // Getters and Setters
    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    @Override
    public String toString() {
        return medicationName + " (" + dosage + ")";
    }
}