/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

public class circulo extends figurasgeometricas{
    
    int radio;
    
    public circulo (int r){
   
    this.radio=r;
    } 
    
    @Override
    public void area(){
    double area;
        area = Math.PI*(this.radio*this.radio);
    System.out.println("EL AREA DE UN CIRCULO ES:"+" "+area);
    }

    @Override
    public void circunferencia() {
     double cir;
     cir=2*Math.PI*this.radio;
     System.out.println("LA CIRCUNFERENCIA ES:"+" "+cir);
    } 
}
