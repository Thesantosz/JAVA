/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superMarket.Model;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Products{
    
    int id;
    String name;
    String value;
    String units;

    public Products(String name, String value, String units) {
        this.name = name;
        this.value = value;
        this.units = units;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
    
    
    
    
    
}
