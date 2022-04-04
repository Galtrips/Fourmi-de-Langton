/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmi.de.langton;
import java.util.Scanner;
/**
 *
 * 
 */
public class FourmiDeLangton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Grille jeu = new Grille(10,15);
       Fourmi Gege = new Fourmi(5,5);
       Gege.setOrientation(1);
       
       Gege.setGrille(jeu);
       jeu.setFourmi(Gege);
       jeu.setColor("Black");
       
       Gege.play(4);
       jeu.print();
       
    }
}
