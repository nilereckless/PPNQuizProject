/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Controller;

import PPN.DB.BuildConnection;
import PPN.Model.Student;
import PPN.Model.Subject;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.descriptionType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theeradonjaroonchon
 */
public class SubjectsController {
     Connection conn;
     
     
     public Subject getSubjectsByName(String name){
         conn = BuildConnection.getConnection();
         try {
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Subjects WHERE name=?");
             ps.setString(1, name);
             ResultSet rs = ps.executeQuery();
             if(rs.next()){
                 return new Subject(rs.getString("Subject_id"), rs.getString("name"), rs.getString("T_ID"), rs.getString("DETAILS"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(SubjectsController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
     }

    public Subject getSubjectsById(String id) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Subjects WHERE Subject_id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Subject(rs.getString("Subject_id"), rs.getString("name"), rs.getString("T_ID"), rs.getString("DETAILS"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public ArrayList<Subject> getAllSubject(String description){
        ArrayList<Subject> sj = new ArrayList();
        SubjectsController sc = new SubjectsController();
        String query = "SELECT * FROM SUBJECTS where SUBJECT_ID like ?";    
         try {
             conn = BuildConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,"%" + description + "%");
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 sj.add(new Subject(rs.getString("SUBJECT_ID"), rs.getString("NAME"), rs.getString("T_ID"), rs.getString("DETAILS")));
             }
             return sj;
         } catch (SQLException ex) {
             Logger.getLogger(SubjectsController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
   
    
    
    
    public static void main(String[] args) {
        SubjectsController sc = new SubjectsController();
        Subject s = sc.getSubjectsById("INT303");
        System.out.println(s);     
        ArrayList<Subject> s1 =sc.getAllSubject("I");
        System.out.println(s1);
        
        
    }
    
}
