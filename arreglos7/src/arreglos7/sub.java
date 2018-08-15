/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos7;

/**
 *
 * @author User
 */
public class sub {
    public String[]letras;
    public int cant;
    
    public void consulta(){
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
    
    System.out.println("DE CUANTAS LETRAS ES SU PALABRA");
    this.cant=teclado.nextInt()+1;
    
    this.letras= new String[cant];
    
    System.out.println("INGRESE LOS DIGITOS");
   
    for(int i=0;i<cant;i++)
    {
         letras[i]=teclado.nextLine(); 
         
       }    
    }
    
    
   public void proceso1(){
       System.out.println("INVERSA");
   for(int i=this.cant-1;i>=0;i--){
     System.out.print(this.letras[i]);
       
     }
   } 
   
   
   public void proceso2(){
       System.out.println("NORMAL");
   for(int i=0;i<cant;i++){
     System.out.print(this.letras[i]);
       }
   } 
   
    public void proceso3(){
       int n=0;
       int x=0;
        System.out.println("PARES E IMPARES");
         System.out.println("LOS PARES");
   for(int i=0;i<cant;i++){       
       if(n%2==0){
     System.out.print(this.letras[i]);
       }
         n=n+1;  
    }
   System.out.println("LOS IMPARES");
      for(int i=0;i<cant;i++){    
       if(x%2!=0){
       System.out.print(this.letras[i]);
       }
       x=x+1;
   }
   }

 public void proceso4(){
       System.out.println("CRUZADO");
   for(int i=0;i<cant;i++){
     System.out.print(this.letras[i]);
       }
   } 
}