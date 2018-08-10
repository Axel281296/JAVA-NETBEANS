/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author LABORATORIO 5
 */
public class sub {

     
    

 int arreglobidi[][] = new int[13][13];

    //metodo llenado

    public void llenar() {
    
        for (int fila = 0; fila <13; fila++) {
            for (int columna = 0; columna <13; columna++) {
                arreglobidi[fila][columna] = fila*columna;
            }//finfor
        }//finfor
    }//finmetodo

    public void presentar () {
        
        for (int fila=0; fila <13; fila++) {
            for (int columna = 0; columna <13; columna++) {
                System.out.print(arreglobidi[fila][columna] + "|");
            }//finfor
            System.out.println("");
        }//finfor    
    }//finmetodo

}//finclase