/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmi.de.langton;

/**
 *
 * 
 */
public class Case {
    
    private boolean color;
    // false => Noir
    // true => Blanc
    
    //Constructors
    public Case(String color) {
        
        if (color.toLowerCase() == "white") {
            this.color = true;
        }
        else if (color.toLowerCase() == "black") {
            this.color = false;
        }
    }
    
    //Getters
    public boolean getColor() {
        return color;
    } 
    
    //Setters
    public void setColor(String color) {
        
        if (color.toLowerCase() == "white") {
            this.color = true;
        }
        else if (color.toLowerCase() == "black") {
            this.color = false;
        }
    }
}
