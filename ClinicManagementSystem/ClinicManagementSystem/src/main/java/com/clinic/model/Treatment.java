package model;

public class Treatment {

    private int treatmentId;
    private int appointmentId;
    private String diagnosis;
    private String treatmentDescription;

    // Constructor
    public Treatment(int treatmentId, int appointmentId, String diagnosis, String treatmentDescription) {
        this.treatmentId = treatmentId;
        this.appointmentId = appointmentId;
        this.diagnosis = diagnosis;
        this.treatmentDescription = treatmentDescription;
    }

    // Empty constructor
    public Treatment() {}

    // Getters and Setters
    public int getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(int treatmentId) {
        this.treatmentId = treatmentId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    @Override
    public String toString() {
        return diagnosis + " - " + treatmentDescription;
    }
}