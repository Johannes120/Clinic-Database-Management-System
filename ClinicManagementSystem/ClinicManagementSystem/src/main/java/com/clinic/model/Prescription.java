package model;

public class Prescription {

    private int prescriptionId;
    private int appointmentId;
    private int medicationId;
    private int quantity;
    private String instructions;

    // Optional object reference (VERY useful for UI)
    private Medication medication;

    // Constructor
    public Prescription(int prescriptionId, int appointmentId, int medicationId, int quantity, String instructions) {
        this.prescriptionId = prescriptionId;
        this.appointmentId = appointmentId;
        this.medicationId = medicationId;
        this.quantity = quantity;
        this.instructions = instructions;
    }

    // Empty constructor
    public Prescription() {}

    // Getters and Setters
    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    // Optional relationship (for JOIN queries)
    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    @Override
    public String toString() {
        return "Prescription: " + quantity + "x " + 
               (medication != null ? medication.getMedicationName() : "Medication ID " + medicationId);
    }
}