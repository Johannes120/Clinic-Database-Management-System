package com.clinic.model;

public class Doctor {
    private int id;
    private String firstName;
    private String lastName;
    private String specialization;

    public Doctor(int id, String firstName, String lastName, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
}