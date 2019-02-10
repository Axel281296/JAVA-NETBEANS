/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author User
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
         public static void main(String[] args) {
        // TODO code application logic here
        String opcion="S";
        registro objmiregistro = new registro();
        while ( opcion.equals("S")  )
        {
            objmiregistro.agregarauto();
            System.out.println("continuar S o N ");
            opcion = new java.util.Scanner(System.in).nextLine();
        }
        
        objmiregistro.mostrarautos();
        //objmiregistro.
    }
        
    
    
}
