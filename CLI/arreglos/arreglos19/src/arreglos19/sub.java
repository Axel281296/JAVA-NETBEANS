/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos19;

/**
 *
 * @author User
 */
public class sub {
    int [][]matrice= new int[4][4];
    int posax,posbx,posay,posby;
    public void marmen(){
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
        for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
     matrice[i][j]=teclado.nextInt();
       }
     }
         for(int i=0;i<4;i++){
        for( int j=0;j<4;j++){
     if(matrice[i][j]%2==0){
     this.posax=i;
     this.posbx=j;
     }
     else if(matrice[i][j]%2!=0)
             {
                 this.posay=i;
                 this.posby=j;
             }
     
     }
         }
         
         System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                  System.out.print(matrice[i][j] + " ");              
            }            
        }
        
    System.out.println("EL MAYOR"+posax+posbx);
    System.out.println("EL MENOR"+posay+posby);
    }
}
