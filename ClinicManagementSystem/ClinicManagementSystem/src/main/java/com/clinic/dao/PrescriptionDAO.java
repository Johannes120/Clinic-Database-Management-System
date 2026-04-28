package com.clinic.dao;

import com.clinic.model.Prescription;
import com.clinic.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionDAO {

    public List<Prescription> getAllPrescriptions() {
        List<Prescription> list = new ArrayList<>();

        String query = "SELECT * FROM Prescription";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                list.add(new Prescription(
                        rs.getInt("prescription_id"),
                        rs.getInt("appointment_id"),
                        rs.getInt("medication_id"),
                        rs.getInt("quantity"),
                        rs.getString("instructions")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}