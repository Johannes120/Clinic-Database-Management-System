package com.clinic.dao;

import com.clinic.model.Treatment;
import com.clinic.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TreatmentDAO {

    public List<Treatment> getAllTreatments() {
        List<Treatment> list = new ArrayList<>();

        String query = "SELECT * FROM Treatment";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                list.add(new Treatment(
                        rs.getInt("treatment_id"),
                        rs.getInt("appointment_id"),
                        rs.getString("diagnosis"),
                        rs.getString("treatment_description")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}