/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos26;

/**
 *
 * @author User
 */
public class sub {
    int []a= new int[5];
    int []ar= new int[5];
    int []mul= new int[5];
    public void mult(){
        java.util.Scanner teclado;
        teclado= new java.util.Scanner(System.in);
         for(int i=0;i<5;i++){
          System.out.println("INGRESE LOS VALORES");
        a[i]=teclado.nextInt();  
        
         
           }
        for(int i=0;i<5;i++){
          System.out.println("INGRESE LOS VALORES");
        ar[i]=teclado.nextInt();  
        
         
           }
        
        for(int i=0;i<5;i++){
          
         mul[i]=a[i]*ar[i];  
        
         
           }
        
    for(int i=0;i<5;i++){
        System.out.println("");
          for(int j=0;j<5;j++){
         System.out.print(mul[i]);
                 
        
         }
           
    }
    }
}
