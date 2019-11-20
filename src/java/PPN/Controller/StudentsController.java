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
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE Lower(fullname) = ?");
            ps.setString(1, username.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                return new Student(rs.getLong("id"), rs.getString("fullname"), rs.getString("password"), rs.getString("syear"), rs.getString("department"));
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
                return new Student(rs.getLong("id"), rs.getString("fullname"), rs.getString("password"), rs.getString("syear"), rs.getString("department"));
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
                allStudent.add(new Student(rs.getLong("id"), rs.getString("fullname"), rs.getString("password"), rs.getString("syear"), rs.getString("department")));
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
            PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS (ID, FULLNAME, PASSWORD, SYEAR, DEPARTMENT) VALUES (?,?,?,?,?)");
            ps.setLong(1, s.getId());
            ps.setString(2, s.getFullname());
            ps.setString(3, s.getPassword());
            ps.setString(4, s.getSyear());
            ps.setString(5, s.getDepartment());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean UpdateStudentInformation(Student s) {
        StudentsController sc = new StudentsController();
        conn = BuildConnection.getConnection();
        try {
            Student s1 = sc.getStudentById(s.getId());
            PreparedStatement ps = conn.prepareStatement("UPDATE STUDENTS set fullname=?,password=? WHERE id = ?");
            ps.setString(1, s.getFullname());
            ps.setString(2, s.getPassword());
            ps.setLong(3, s.getId());

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
        s.setFullname("THEERADON JAROONCHON");
        System.out.println(sc.UpdateStudentInformation(s));

    }
}
