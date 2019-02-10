/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos4;

/**
 *
 * @author User
 */
public class sub {
    // VARIABLE%2==0
    public int[] arreglo= new int[10];
    public double promediox,promedioy,sumap,sumam,sunx,suny;
    public void relleno(){
        java.util.Scanner teclado;
        teclado= new java.util.Scanner(System.in);
        
    for(int i=0;i<10;i++){
        this.arreglo[i]=teclado.nextInt();
        
    }
    
    }//fin relleno 
    
    public void proceso(){
    for(int i=0;i<10;i++){
        if(arreglo[i]%2==0)
        {
         this.sumap=sumap+arreglo[i];
         this.sunx=sunx+i;
        }
        else{
         this.sumam=sumam+arreglo[i];
         this.suny=suny+i;
        }
     }//fin for 
    this.promediox=sumap/10;
    this.promedioy=sumam/10;
    System.out.println("EL PROMEDIO DE LOS PARES ES:"+promediox);
    System.out.println("EL PROMEDIO DE LOS IMPARES ES:"+promedioy);
    System.out.println("LA SUMA DE LAS POSICIONES DE LOS PARES ES:"+sunx);
    System.out.println("LA SUMA DE LAS POSICIONES DE LOS IMPARES ES:"+suny);
    }// fin proceso 
}
