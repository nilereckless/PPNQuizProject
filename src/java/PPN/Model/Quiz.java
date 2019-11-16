/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Model;

/**
 *
 * @author theeradonjaroonchon
 */
public class Quiz {
    private Long quizId;
    private String quizName;
    private String quizDetails;
    private String subjectId;
    
    public Quiz(){
        
    }

    public Quiz(String quizName, String quizDetails, String subjectId) {
        this.quizName = quizName;
        this.quizDetails = quizDetails;
        this.subjectId = subjectId;
    }
    

    public Quiz(Long quizId, String quizName, String quizDetails, String subjectId) {
        this.quizId = quizId;
        this.quizName = quizName;
        this.quizDetails = quizDetails;
        this.subjectId = subjectId;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizDetails() {
        return quizDetails;
    }

    public void setQuizDetails(String quizDetails) {
        this.quizDetails = quizDetails;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizId=" + quizId + ", quizName=" + quizName + ", quizDetails=" + quizDetails + ", subjectId=" + subjectId + '}';
    }

   
    
    
}
