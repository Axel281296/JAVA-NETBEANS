/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos21;

/**
 *
 * @author User
 */
public class sub {
      int [][]matrice;
    int posax,posbx,posay,posby;
    public int dim;
    
    public void ter(){
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
    
    System.out.println("INGRESE LAS DIMENSIONES");
    dim=teclado.nextInt();
    matrice= new int[dim][dim];
    for(int i=0;i<dim;i++){
    for(int j=0;j<dim;j++){
     matrice[i][j]=teclado.nextInt();
       }
     }
    
         for(int i=0;i<9;i++){
        for( int j=0;j<5;j++){
     if(matrice[i][j]%2==0){
     this.posax=posax+1;
    
     }
   }
         }
    this.posbx=dim+posax; 
    System.out.println("LOS PARES: "+posax);
    System.out.println("LOS PARES + ENTEROS: "+posbx);
    }
}
