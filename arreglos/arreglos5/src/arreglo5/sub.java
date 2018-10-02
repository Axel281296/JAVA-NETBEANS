/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo5;

/**
 *
 * @author User
 */
public class sub {
    public int []a;
    public int []b;
    public int []suma;
    public int dimension,mayor,temp;
    public double promedio;
    public void principal(){
    
    java.util.Scanner teclado;
    teclado = new java.util.Scanner(System.in);
    
    System.out.println("INGRESE LAS DIMENSION DE LOS ARREGLOS");
    this.dimension=teclado.nextInt();
    
    this.a= new int[dimension];
    this.b= new int[dimension];
    this.suma= new int[dimension];
    
    System.out.println("RELLENE EL PRIMER ARREGLO");
    for(int i=0;i<dimension;i++){
       a[i]=teclado.nextInt();
      }//fin for
    System.out.println("RELLENES EL SEUNDO ARREGLO");
     for(int i=0;i<dimension;i++){
      b[i]=teclado.nextInt();
     }//for 
    }// fin principal
    
    public void proceso(){

        for(int i=0;i<dimension;i++){
      
       if(a[i]>b[i]){
       this.mayor=a[i];
               }
       else {
       this.mayor=b[i];
       }
        this.suma[i]=a[i]+b[i];
       this.promedio=this.suma[i]/2;
       this.temp=temp+1;
      System.out.println("LA SUMA DEL"+" "+this.temp+"es:"+suma[i]);
      System.out.println("EL PROMEDIO DEL"+" "+this.temp+"es:"+promedio);
      System.out.println("EL MAYOR ES:"+" "+this.mayor);
        }
    
    }
    
}
