/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Controller;

import PPN.DB.BuildConnection;
import PPN.Model.Quiz;
import PPN.Model.Subject;
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
public class QuizsController {
    Connection conn;
    
    public ArrayList<Quiz> getQuizBySubject (String subject){
        ArrayList<Quiz> q = new ArrayList();
        QuizsController qc = new QuizsController();
        String query = "SELECT * FROM QUIZ  where SUBJECT_ID = ?";    
         try {
             conn = BuildConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1, subject);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 q.add(new Quiz(rs.getLong("QUIZ_ID"), rs.getString("QUIZ_NAME"), rs.getString("QUIZ_DETAILS"), rs.getString("SUBJECT_ID")));
             }
             return q;
         } catch (SQLException ex) {
             Logger.getLogger(QuizsController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
    public ArrayList<Quiz> getAllQuiz(String description){
        ArrayList<Quiz> q = new ArrayList();
        QuizsController qc = new QuizsController();
        String query = "SELECT * FROM QUIZ  where Lower(SUBJECT_ID) like ?";    
         try {
             conn = BuildConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setString(1,"%" + description.toLowerCase() + "%");
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 q.add(new Quiz(rs.getLong("QUIZ_ID"), rs.getString("QUIZ_NAME"), rs.getString("QUIZ_DETAILS"), rs.getString("SUBJECT_ID")));
             }
             return q;
         } catch (SQLException ex) {
             Logger.getLogger(QuizsController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
    public boolean addQuiz(Quiz q){
        conn = BuildConnection.getConnection();
         try {
             PreparedStatement ps =conn.prepareStatement("INSERT INTO QUIZ (QUIZ_NAME, QUIZ_DETAILS, SUBJECT_ID) VALUES (?,?,?)");
             ps.setString(1, q.getQuizName());
             ps.setString(2, q.getQuizDetails());
             ps.setString(3, q.getSubjectId());
             ps.executeUpdate();
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(QuizsController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    }
    
    public static void main(String[] args) {
        QuizsController qc = new QuizsController();
        ArrayList<Quiz> q = qc.getAllQuiz("description");
        System.out.println(q);
        
        
        Quiz q1 = new Quiz("quizName", "quizDetails", "subjectId");
        qc.addQuiz(q1);
        System.out.println(qc.getAllQuiz("quiz"));
        
        
    }
}
