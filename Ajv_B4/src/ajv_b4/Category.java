/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajv_b4;

/**
 *
 * @author ADMIN
 */
public class Category{
    int ID;
    String name;

    public Category(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }
    
    
}
