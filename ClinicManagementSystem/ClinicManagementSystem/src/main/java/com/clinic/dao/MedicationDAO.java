package com.clinic.dao;

import com.clinic.model.Medication;
import com.clinic.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicationDAO {

    public List<Medication> getAllMedications() {
        List<Medication> list = new ArrayList<>();

        String query = "SELECT * FROM Medication";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                list.add(new Medication(
                        rs.getInt("medication_id"),
                        rs.getString("medication_name"),
                        rs.getString("dosage"),
                        rs.getString("side_effects")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}