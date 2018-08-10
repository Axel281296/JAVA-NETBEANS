/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarre;

/**
 *
 * @author User
 */
public class sub {
    
    public int n,p,fila,columna,mayor,i,j,posx,posy,posmx,posmy,menor;
    public int [][] arreglo;//nuevo
    
   //FILAS COLUMNAS 2
    public void relleno(){
    
    java.util.Scanner teclado;
    teclado = new java.util.Scanner(System.in);
    
    System.out.println("INGRESE EL NUMERO DE FILAS");
    this.n=teclado.nextInt();
    System.out.println("INGRESE EL NUMERO DE COLUMNAS");
    this.p=teclado.nextInt();
    this.arreglo=new int [n][p];//nuevo
   
    
     for(this.fila=0;fila<n;fila++){
              for(this.columna=0;columna<p;columna++){
              System.out.println("INGRESE EL VALOR");
              arreglo[columna][fila]=teclado.nextInt();//nuevo
               
              }
     }
    }//\]fin clase

public void mayor(){
for(this.i=0;i<this.n;i++){
 for(this.j=0;j<this.p;j++){
if(arreglo[i][j]> this.mayor)
  {
      this.mayor=arreglo[i][j];
      this.posx=i;
      this.posy=j;
  }
else //if(arreglo[i][j]< this.menor)
{
     this.menor=arreglo[i][j];
      this.posmx=i;
      this.posmy=j;
}
 }
  
}
 
 System.out.println("LA POSICION DEL MAYOR ES "+ this.posx+","+this.posy);
System.out.println("LA POSICION DEL MENOR ES "+ this.posmx+","+this.posmy);



}    

}
