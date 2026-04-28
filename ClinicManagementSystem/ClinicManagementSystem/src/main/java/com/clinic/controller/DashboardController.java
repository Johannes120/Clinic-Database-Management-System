package com.clinic.controller;

import com.clinic.dao.PatientDAO;
import com.clinic.dao.DoctorDAO;
import com.clinic.dao.AppointmentDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML private Label totalPatients;
    @FXML private Label totalDoctors;
    @FXML private Label totalAppointments;

    public void initialize() {
        totalPatients.setText(String.valueOf(new PatientDAO().getAllPatients().size()));
        totalDoctors.setText(String.valueOf(new DoctorDAO().getAllDoctors().size()));
        totalAppointments.setText(String.valueOf(new AppointmentDAO().getAllAppointments().size()));
    }
}