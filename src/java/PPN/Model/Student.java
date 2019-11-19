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
    private String fullname ;
    private String password;
    private String syear;
    private String department;
    
    
    public Student(){
        
    }

    public Student(long id, String fullname, String password, String syear, String department) {
        this.id = id;
        this.fullname = fullname;
        this.password = password;
        this.syear = syear;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getSyear() {
        return syear;
    }

    public void setSyear(String syear) {
        this.syear = syear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullname=" + fullname + ", password=" + password + ", syear=" + syear + ", department=" + department + '}';
    }

    
    
    
    
 
    
}
