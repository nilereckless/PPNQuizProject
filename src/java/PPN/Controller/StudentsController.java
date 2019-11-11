/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Controller;

import PPN.DB.BuildConnection;
import PPN.Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theeradonjaroonchon
 */
public class StudentsController {

    Connection conn;

    public Student getStudentByUsername(String username) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE Lower(fname) = ?");
            ps.setString(1, username.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getLong("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("password"), rs.getString("department"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Student getStudentById(long id) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getLong("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("password"), rs.getString("department"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> allStudent = new ArrayList();
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                allStudent.add(new Student(rs.getLong("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("password"), rs.getString("department")));
            }
            return allStudent;
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

      public boolean addStudent(Student s) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS (ID, FNAME, LNAME, PASSWORD, DEPARTMENT) VALUES (?,?,?,?,?)");
            ps.setLong(1, s.getId());
            ps.setString(2, s.getUsername());
            ps.setString(3, s.getLastname());
            ps.setString(4, s.getPassword());
            ps.setString(5, s.getDepartment());
            ps.executeUpdate();
                      
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        StudentsController sc = new StudentsController();
        Student s = sc.getStudentById(Long.valueOf("61130500054"));
        System.out.println(s);
        ArrayList<Student> as = sc.getAllStudent();
        System.out.println(as); 
        
        Student ss = new Student(123, "test", "mou", "kkk", "llo");
        sc.addStudent(ss);
        System.out.println(sc.getStudentById(123));
    }
}
