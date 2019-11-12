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
    private Long Id;
    private String username;
    private String LastName;
    private String password;
    private String ownerSubject;
    private String department;
    
    
    public Teacher (){
        
    }

    public Teacher(Long Id, String username, String LastName, String password, String ownerSubject, String department) {
        this.Id = Id;
        this.username = username;
        this.LastName = LastName;
        this.password = password;
        this.ownerSubject = ownerSubject;
        this.department = department;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
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

    @Override
    public String toString() {
        return "Teacher{" + "Id=" + Id + ", username=" + username + ", LastName=" + LastName + ", password=" + password + ", ownerSubject=" + ownerSubject + ", department=" + department + '}';
    }

    
    
    
    
    
}
