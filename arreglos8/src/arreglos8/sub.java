/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos8;

/**
 *
 * @author User
 */
public class sub {
   String[] profesor={"alumno","maestra","condominio","portero"};
   String[] alumno= new String[4];
   public int gana,pierde;
   public void rellenar(){
   java.util.Scanner teclado;
   teclado= new java.util.Scanner(System.in);
 
       for(int i=0;i<4;i++){
             System.out.println("INGRESE LA PALABARA"+" "+i+":");
       alumno[i]=teclado.nextLine();
   }
   
   }
   
   
   public void comparar(){
   
       for(int i=0;i<4;i++){
    if(profesor[i].equals(alumno[i])){
    //System.out.println("gana");
    this.gana=gana+1;
    }else
    {
        this.pierde=pierde+1;
      //  System.out.println("Pierde");
    }
     }
   System.out.println("SCORE GANADOS:"+" "+gana);    
   System.out.println("SCORE PERDIDOS:"+" "+pierde);
   }

    
}
