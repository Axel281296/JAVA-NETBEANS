/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos22;

/**
 *
 * @author User
 */
public class sub {
    int [][]arreglo=new int[4][4];
    public int suma,sumab;
    public double promedio;
    public void term()
    {
        java.util.Scanner teclado;
         teclado = new java.util.Scanner(System.in);
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
        System.out.println("INGRESE LOS VALORES");
        arreglo[i][j]=teclado.nextInt();
    }  
    }

 //for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
      //  System.out.println("INGRESE LOS VALORES");
        this.suma=suma+this.arreglo[3][j];
    }  
   
    for(int i=0;i<4;i++){
      //  System.out.println("INGRESE LOS VALORES");
        this.sumab=suma+this.arreglo[3][i];
    }  
    
        this.promedio=this.suma/4;
        System.out.println("EL PROMEDIO DE LA CUARTA FILA ES:"+promedio);
        System.out.println("INGRESE LOS VALORES"+sumab);
    }
}
