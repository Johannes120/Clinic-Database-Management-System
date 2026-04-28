package com.clinic.controller;

import com.clinic.dao.AppointmentDAO;
import com.clinic.model.Appointment;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AppointmentController {

    @FXML private TableView<Appointment> table;
    @FXML private TableColumn<Appointment, Integer> colId;
    @FXML private TableColumn<Appointment, String> colPatient;
    @FXML private TableColumn<Appointment, String> colDoctor;
    @FXML private TableColumn<Appointment, String> colStatus;

    public void initialize() {

        colId.setCellValueFactory(data ->
                new javafx.beans.property.SimpleIntegerProperty(data.getValue().getId()).asObject());

        colPatient.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getPatientName()));

        colDoctor.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getDoctorName()));

        colStatus.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getStatus()));

        loadData();
    }

    private void loadData() {
        AppointmentDAO dao = new AppointmentDAO();
        table.setItems(FXCollections.observableArrayList(dao.getAllAppointments()));
    }
}