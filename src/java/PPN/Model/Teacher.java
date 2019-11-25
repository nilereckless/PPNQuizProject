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
public class Teacher {

    private long Id;
    private String fullname;
    private String password;
    private String ownerSubject;
    private String department;
    private String email;
    
    
    
    public Teacher (){
        
    }

    public Teacher(long Id, String fullname, String password, String ownerSubject, String department, String email) {
        this.Id = Id;
        this.fullname = fullname;
        this.password = password;
        this.ownerSubject = ownerSubject;
        this.department = department;
        this.email = email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerSubject() {
        return ownerSubject;
    }

    public void setOwnerSubject(String ownerSubject) {
        this.ownerSubject = ownerSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" + "Id=" + Id + ", fullname=" + fullname + ", password=" + password + ", ownerSubject=" + ownerSubject + ", department=" + department + ", email=" + email + '}';
    }

   

    

   


    

    
    
    
}
