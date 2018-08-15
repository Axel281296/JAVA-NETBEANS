/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos20;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class sub {
   int [][]matrice= new int[9][5];
    int posax,posbx,posay,posby;
    public void marmen(){
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
        for(int i=0;i<9;i++){
    for(int j=0;j<5;j++){
     matrice[i][j]=teclado.nextInt();
       }
     }
         for(int i=0;i<9;i++){
        for( int j=0;j<5;j++){
     if(matrice[i][j]%2==0){
     this.posax=posax+1;
    
     }
     else if(matrice[i][j]%2!=0)
             {
                 this.posay=posay+1;
                
             }
     
     }
         }
         
           System.out.println("CANTIDAD DE PARES"+posax);
         
         System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                  System.out.print(matrice[i][j] + " ");              
            }            
        }
        
  
 
    }
}
