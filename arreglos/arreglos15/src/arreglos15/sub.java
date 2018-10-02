/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos15;

/**
 *
 * @author User
 */
public class sub {
    int [][]arreglo1;
    int [][]arreglo2;
    int [][]suma;
    
    int dim;
    public void sumar(){
        java.util.Scanner teclado;
        teclado= new java.util.Scanner(System.in);
    
        System.out.println("INGRESE LA DIMENSION DEL ARREGLO");
    dim=teclado.nextInt();
    arreglo1=new int[dim][dim];
    arreglo2=new int[dim][dim];
    suma=new int[dim][dim];
    
    System.out.println("INGRESE LA DIMENSION DEL PRIMER ARREGLO");
    for(int i=0;i<this.dim;i++){
        for(int j=0;j<this.dim;j++){
         arreglo1[i][j]=teclado.nextInt();
        }
}
   System.out.println("INGRESE LA DIMENSION DEL PRIMER ARREGLO");
    for(int i=0;i<this.dim;i++){
        for(int j=0;j<this.dim;j++){
         arreglo2[i][j]=teclado.nextInt();
        }
}
   
    for(int i=0;i<this.dim;i++){
        for(int j=0;j<this.dim;j++){
         suma[i][j]=arreglo1[i][j]+arreglo2[i][j];
        }
}
     System.out.println("LA SUMA DE LA MATRICES ES");
    for(int i=0;i<this.dim;i++){
        System.out.println();
        for(int j=0;j<this.dim;j++){
         System.out.print(suma[i][j]+" ");
        }
    }
   
    
    }
    }
