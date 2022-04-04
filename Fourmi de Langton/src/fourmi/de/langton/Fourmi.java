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
public class Fourmi {
    
    private int x;
    private int y;
    private Orientation looking;
    private Grille grille;
    
    //Constructors
    public Fourmi() {
        
        this.x = 0;
        this.y = 0;
        this.looking = Orientation.South;
    }
    
    public Fourmi (int x, int y) {
    
        this.x = x;
        this.y = y;
    }
    
    //Getters
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Orientation getOrientation() {
        return looking;
    }

    public Grille getGrille() {
        return grille;
    }
    
    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setOrientation(int look) {
        Orientation tab[] = Orientation.values();
        this.looking = tab[look];
    }
    
    public void setGrille(Grille g) {
    
        this.grille = g;
    }
    
    //Fonctions
    
    
    public void avancer () {
    
        Case tab[][] = (this.getGrille()).getTab();
        
        switch  (this.looking) {
        
            case North:
                
                if (0 == this.y) {
                    return;
                }
                this.y -= 1; 
                
                if ((tab[this.x][this.y]).getColor() == true) {
                    this.setOrientation(3);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("Black");
                }
                else {
                    this.setOrientation(2);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("White");
                }
                
                break;
                
            case South:
                
                if ((this.getGrille()).getLargeur() == this.y ) {
                    return;
                }
                this.y += 1; 
                
                if ((tab[this.x][this.y]).getColor() == true) {
                    this.setOrientation(2);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("Black");
                }
                else {
                    this.setOrientation(3);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("White");
                }
                
                break;
                
            case East:
                
                if ((this.getGrille()).getLongueur() == this.x ) {
                    return;
                }
                this.x += 1; 
                
                if ((tab[this.x][this.y]).getColor() == true) {
                    this.setOrientation(0);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("Black");
                }
                else {
                    this.setOrientation(1);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("White");
                }
                
                break;
                
            case West:
                
                if (0 == this.x ) {
                    return;
                }
                this.x -= 1; 
                
                if ((tab[this.x][this.y]).getColor() == true) {
                    this.setOrientation(1);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("Black");
                }
                else {
                    this.setOrientation(0);
                    (((this.getGrille()).getTab())[this.x][this.y]).setColor("White");
                }
                
                break;             
        }   
        
    }
    
    public void play (int fin) {
        
        for (int i = 0; i < fin; i++) {
            
            
            this.avancer();
        
        }
    }
}
