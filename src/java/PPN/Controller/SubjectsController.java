/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Controller;

import PPN.DB.BuildConnection;
import PPN.Model.Student;
import PPN.Model.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theeradonjaroonchon
 */
public class SubjectsController {
     Connection conn;

    public Subject getSubjectsById(String id) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Subjects WHERE Subject_id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Subject(rs.getString("Subject_id"), rs.getString("name"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public static void main(String[] args) {
        SubjectsController sc = new SubjectsController();
        Subject s = sc.getSubjectsById("INT303");
        System.out.println(s);
    }
    
}
