/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author User
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner teclado;
        teclado= new java.util.Scanner(System.in);
        sub llama= new sub();
        int ingreso,op;
        String ="S";
        do{
        System.out.println("Ingrese el tamano del arreglo:");
        ingreso=teclado.nextInt();       
        llama.metodo_llenar(ingreso);
        System.out.println("METODO BURBUJA");
        System.out.println("1.-METODO FOR ");
        System.out.println("2.-METODO WHILE");
        System.out.println("3.-METODO DO WHILE");
        System.out.println("Ingrese LA OPCION:");
        op=teclado.nextInt();
        switch(op){
            case 1:llama.metodo_for();
            break;
         case 2:llama.metodo_while();
            break;
             case 3:llama.metodo_dowhile();
            break;
        }
         System.out.println("SI DESEA CONTINUAR PRESIONE S/s");
        opc=teclado.next();
        }
        while(opc.equals("s") || opc.equals("S"));
    }
   
}
