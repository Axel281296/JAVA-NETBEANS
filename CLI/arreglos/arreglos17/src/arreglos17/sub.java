/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos17;

/**
 *
 * @author User
 */
public class sub {
    int [][]arreglo= new int[5][5];
   
    
    public void suma(){
        for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
         arreglo[i][j]=i+j;  
        
         }
           }
        
    for(int i=0;i<5;i++){
        System.out.println("");
          for(int j=0;j<5;j++){
         System.out.print(arreglo[i][j]+"");
                 
        
         }
           
    }
    }
}


