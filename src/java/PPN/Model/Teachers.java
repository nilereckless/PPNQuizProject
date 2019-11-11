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
public class Teachers {
    private int teacherId;
    private String teacherName;
    private String teacherLastName;
    private String ownerSubject;
    private String faculty;

    public Teachers(int teacherId, String teacherName, String teacherLastName, String ownerSubject, String faculty) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherLastName = teacherLastName;
        this.ownerSubject = ownerSubject;
        this.faculty = faculty;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getOwnerSubject() {
        return ownerSubject;
    }

    public void setOwnerSubject(String ownerSubject) {
        this.ownerSubject = ownerSubject;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Teachers{" + "teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherLastName=" + teacherLastName + ", ownerSubject=" + ownerSubject + ", faculty=" + faculty + '}';
    }
    
    
}
