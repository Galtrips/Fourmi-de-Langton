/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmi.de.langton;

/**
 *
 * @author p2103678
 */
public class Grille {
    
    private int largeur;
    private int longueur;
    private Case tab[][];
    private Fourmi f;

    public Grille(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
        
        tab = new Case[longueur][largeur];
        
        for (int i = 0; i < longueur ; i++ ) {
            for (int j = 0; j < largeur; j++) {
      
                tab[i][j] = new Case("noir");
            }
        }
    }

    //Getters
    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public Case[][] getTab() {
        return tab;
    }

    public Fourmi getFourmi() {
        return f;
    }
    
    //Setters
    public void setColor(String color) {
        for (int i = 0; i < longueur ; i++ ) {
            for (int j = 0; j < largeur; j++) {
      
                tab[i][j].setColor(color);
            }
        }
    }
    
    public void setFourmi(Fourmi f) {
        this.f = f;
    }
    
    public void print() {
    
        for (int i = 0; i < largeur ; i++ ) {
            for (int j = 0; j < longueur; j++) {
      
                if ((this.getFourmi()).getX() == j && (this.getFourmi()).getY() == i) {
                    System.out.print("F");
                }
                else if (tab[j][i].getColor() == true) {
                    System.out.print("B");
                }
                else {
                    System.out.print("N");
                }
            }
            System.out.println("");
        }
        
    }
    
    
}
