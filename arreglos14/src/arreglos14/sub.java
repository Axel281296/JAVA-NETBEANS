/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos14;

/**
 *
 * @author User
 */
public class sub {
    int []arreglo;
    public int dim;
    public void cicclo(){
    java.util.Scanner teclado;
    teclado= new java.util.Scanner(System.in);
    System.out.println("DIMENSION DEL ARREGLO");
    dim=teclado.nextInt();
    arreglo=new int[dim];
    for(int i=0;i<dim;i++)
    {
    arreglo[i]=1;
    }
    for(int i=0;i<dim;i++)
    {
     System.out.println(arreglo[i]);
    }
    }
}
