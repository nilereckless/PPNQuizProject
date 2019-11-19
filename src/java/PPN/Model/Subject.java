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
public class Subject {
    private String id;
    private String name;
    private String T_ID;
    private String DETAILS;
    
    public Subject(){
        
    }

    public Subject(String id, String name, String T_ID, String DETAILS) {
        this.id = id;
        this.name = name;
        this.T_ID = T_ID;
        this.DETAILS = DETAILS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getT_ID() {
        return T_ID;
    }

    public void setT_ID(String T_ID) {
        this.T_ID = T_ID;
    }

    public String getDETAILS() {
        return DETAILS;
    }

    public void setDETAILS(String DETAILS) {
        this.DETAILS = DETAILS;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name + ", T_ID=" + T_ID + ", DETAILS=" + DETAILS + '}';
    }

    
   
    
}
