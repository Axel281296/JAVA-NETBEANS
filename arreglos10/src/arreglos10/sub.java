/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos10;

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
        System.out.println("INGRESE LA DIMENSION DE LOS ARREGLOS");
        this.dim=teclado.nextInt();
        arreglo= new int[this.dim];
        
for(int i=0;i<dim;i++){
    System.out.println("INGRESE EL VALOR");
arreglo[i]=teclado.nextInt();
}        
        
System.out.println("\nLos numeros ingresados SIN ORDENAR son: ");
for(int i = 0; i <dim; i++){
System.out.println(arreglo[i]);
}

        Arrays.sort(arreglo); // nueva libreria 

System.out.println("\nLos numeros ingresados ORDENADOS ASCENDENTEMENTE son: ");
for(int i = 0; i < dim; i++){
System.out.println(arreglo[i]);
}
 
System.out.println("\nLos numeros ingresados ORDENADOS  DESCENDENTEMENTE son: ");
for(int i =dim-1; i>=0; i--){
System.out.println(arreglo[i]);
}
    
    }
}
