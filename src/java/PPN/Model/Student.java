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
public class Student {
    private long id;
    private String username ;
    private String lastname;
    private String password;
    private String department;
    
    public Student(){
        
    }

    public Student(long id, String username, String lastname, String password, String department) {
        this.id = id;
        this.username = username;
        this.lastname = lastname;
        this.password = password;
        this.department = department;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", username=" + username + ", lastname=" + lastname + ", password=" + password + ", department=" + department + '}';
    }
    
    
    
    
    
 
    
}
