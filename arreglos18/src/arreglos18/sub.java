/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos18;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class sub {
    int [][]arreglo= new int[9][5];
   int mayor,menor;
    
    public void mame(){
      
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
       
        
for(int i=0;i<9;i++)
{
    for(int j=0;j<9;j++)
{
    System.out.println("INGRESE EL VALOR");
arreglo[i][j]=teclado.nextInt();
}        
}    

System.out.println("\nLos numeros ingresados SIN ORDENAR son: ");
for(int i = 0; i <9; i++)
for(int j = 0; j <5; j++)
{
System.out.println(arreglo[i][j]);
}

        Arrays.sort(arreglo); // nueva libreria 

System.out.println("MAYOR");

for(int i = 0; i < 9; i++){
for(int j = 0; j < 5; j++){
  this.mayor=arreglo[i][j];    
}
 //   System.out.println(arreglo[i]);
}

for(int i = 8; i >= 0; i--){
for(int j = 4; j >=0; j--){
  this.menor=arreglo[i][j];    
}
 
}
    }
}
