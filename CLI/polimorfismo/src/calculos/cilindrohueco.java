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
public class cilindrohueco extends figurasgeometricas {
    int rmayor,rmenor,altura; 
    public cilindrohueco (int a,int b,int c){
         this.rmayor=a;
         this.rmenor=b;
         this.altura=c;
}
    
    @Override
    public void area() {
    double areatg,arealg,areabg;
    double areatp,arealp,areabp;
    double areah;
    arealg=2*Math.PI*this.rmayor*altura;
    areabg=Math.PI*Math.pow(this.rmayor,2);
    areatg=arealg+areabg;
    
    arealp=2*Math.PI*this.rmenor*altura;
    areabp=Math.PI*Math.pow(this.rmenor,2);
    areatp=arealg+areabg;
    
    areah=areatg-areatp;
    System.out.println("EL AREA DEL CILINDRO HUECO ES:"+" "+areah);
    }

    @Override
    public void circunferencia() {
    double cir,cirma,cirme;
     cirme=2*Math.PI*this.rmenor;
     cirma=2*Math.PI*this.rmayor;
     cir=cirma=cirme;
     System.out.println("LA CIRCUNFERENCIA ES:"+" "+cir);
    
    }
    
}
