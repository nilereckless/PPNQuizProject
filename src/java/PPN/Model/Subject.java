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
    
    public Subject(){
        
    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Subjects{" + "id=" + id + ", name=" + name + '}';
    }

    
    
    
}
