/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author User
 */
public class cilindro extends figurasgeometricas {
    int altura;
    int radio;
    
    public cilindro (int al, int ra){
    this.altura=al;
    this.radio=ra;
    
    }
    
    @Override
    public void area() {
    double areal,areab,areat;
        areal=2*Math.PI*this.radio*altura;
    areab=Math.PI*Math.pow(this.radio,2);
    areat=areal+areab;
    System.out.println("EL AREA DEL CILINDRO ES:"+areat);
    }

    @Override
    public void circunferencia() {
     double cir;
     cir=2*Math.PI*this.radio;
     System.out.println("LA CIRCUNFERENCIA ES:"+" "+cir);
    }
    
}
