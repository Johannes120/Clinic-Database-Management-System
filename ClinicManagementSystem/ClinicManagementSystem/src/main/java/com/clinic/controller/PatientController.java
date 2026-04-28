package com.clinic.controller;

import com.clinic.dao.PatientDAO;
import com.clinic.model.Patient;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PatientController {

    @FXML private TableView<Patient> table;
    @FXML private TableColumn<Patient, Integer> colId;
    @FXML private TableColumn<Patient, String> colFirstName;
    @FXML private TableColumn<Patient, String> colLastName;
    @FXML private TableColumn<Patient, String> colPhone;

    public void initialize() {

        colId.setCellValueFactory(data ->
                new javafx.beans.property.SimpleIntegerProperty(data.getValue().getId()).asObject());

        colFirstName.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getFirstName()));

        colLastName.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getLastName()));

        colPhone.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getPhone()));

        loadPatients();
    }

    private void loadPatients() {
        PatientDAO dao = new PatientDAO();
        table.setItems(FXCollections.observableArrayList(dao.getAllPatients()));
    }
}