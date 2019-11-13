/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Controller;

import PPN.DB.BuildConnection;
import PPN.Model.Student;
import PPN.Model.Teacher;
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
public class TeachersController {

    Connection conn;

    public Teacher getTeacherByUsername(String username) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM teachers WHERE Lower(fullname) = ?");
            ps.setString(1, username.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Teacher(rs.getLong("id"), rs.getString("fullname"), rs.getString("password"), rs.getString("ownerSubject"), rs.getString("department"), rs.getString("email"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Teacher getTeacherById(long id) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM teachers WHERE id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Teacher(rs.getLong("id"), rs.getString("fullname"), rs.getString("password"), rs.getString("owner_Subject"), rs.getString("department"), rs.getString("email"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Teacher> getAllTeacher() {
        ArrayList<Teacher> allTeacher = new ArrayList();
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM teachers");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                allTeacher.add(new Teacher(rs.getLong("id"), rs.getString("fullname"), rs.getString("password"), rs.getString("owner_Subject"), rs.getString("department"), rs.getString("email")));
            }
            return allTeacher;
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean addTeacher(Teacher t) {
        conn = BuildConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO TEACHERS (ID, FULLNAME, PASSWORD, owner_Subject, DEPARTMENT, EMAIL) VALUES (?,?,?,?,?,?)");
            ps.setLong(1, t.getId());
            ps.setString(2, t.getFullname());
            ps.setString(3, t.getPassword());
            ps.setString(4, t.getOwnerSubject());
            ps.setString(5, t.getDepartment());
            ps.setString(6, t.getEmail());
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TeachersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        TeachersController tc = new TeachersController();
        ArrayList<Teacher> tt = tc.getAllTeacher();
        System.out.println(tt);
    }
}
