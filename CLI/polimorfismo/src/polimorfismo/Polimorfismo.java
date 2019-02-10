/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import calculos.*;

/**
 *
 * @author User
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    circulo objeto1 = new circulo(5);
    objeto1.area();
    objeto1.circunferencia();
    
    cilindro objeto2 = new cilindro(5,6);
    objeto2.area();
    objeto2.circunferencia();
    
    cilindrohueco objeto3 = new cilindrohueco(4,8,3);
    objeto3.area();
    objeto3.circunferencia();
    }
    
}
