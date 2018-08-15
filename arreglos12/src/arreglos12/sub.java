/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos12;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class sub {
      int []arreglo;
    public int dim;
    public void consulta(){
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS");
        this.dim=teclado.nextInt();
        arreglo= new int[this.dim];
        
for(int i=0;i<dim;i++){
    System.out.println("INGRESE LAS EDADES");
arreglo[i]=teclado.nextInt();
}        
        


Arrays.sort(arreglo); // nueva libreria 


 
System.out.println("\nLos numeros ingresados ORDENADOS  DESCENDENTEMENTE son: ");
for(int i =dim-1; i>=0; i--){
System.out.println(arreglo[i]);
}
    
    }
}
