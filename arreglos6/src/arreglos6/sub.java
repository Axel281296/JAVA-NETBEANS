/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos6;

/**
 *
 * @author User
 */
public class sub {
    int []arreglo={1,2,3,5,6,12,33,42};
    public int ingreso,si,no,temp,contx;
    public int sumapar,sumaimpar,pospar,posimpar,prom1,prom2,prom3,prom4;
    public void relleno(){
    java.util.Scanner teclado;
    teclado = new java.util.Scanner(System.in);
        
    System.out.println("ARREGLOS");
    System.out.println("INGRESE SU NUMERO");
    this.ingreso=teclado.nextInt();
    
    for(int i=1;i<7;i++){
    if(arreglo[i]==this.ingreso){
       this.si=1;
       this.temp=i-1;
       this.contx=contx+1;
    }
    else{
        this.no=0;
      }
    }
    }
    

public void parimp(){
 for( int j=0;j<7;j++){
     if(arreglo[j]%2==0){
     this.sumapar=sumapar+arreglo[j];
     }
     else if(arreglo[j]%2!=0)
             {
                 this.sumaimpar=sumapar+arreglo[j];
             }
     
     }
 this.prom1=this.sumapar/7;
 this.prom2=this.sumaimpar/7;
 }


//primos

public void primo(){

  
    }
public void posiciones(){
 
 for( int j=0;j<7;j++){
     if(j%2==0){
     this.pospar=sumapar+arreglo[j];
     }
     else if(j%2!=0)
             {
                 this.posimpar=sumapar+arreglo[j];
             }
     
     }
 this.prom3=posimpar/7;
 this.prom4=pospar/7;
 
 }
public void presentar(){
System.out.println("RESULTADOS");
if(this.si==1){
    System.out.println("SI EXISTE EN LAS POSICION:"+" "+temp);
     }
    else{
        System.out.println("NO EXISTE");
      }
System.out.println("EL PROMEDIO DE LOS PARES ES:"+" "+this.prom1);
System.out.println("EL PROMEDIO DE LOS IMPARES ES:"+" "+this.prom2);
System.out.println("EL PROMEDIO DE LOS PARES ES:"+" "+"FALTA");
System.out.println("EL PROMEDIO DE LOS VALORES EN POSICIONES PARES ES:"+" "+this.prom3);
System.out.println("EL PROMEDIO DE LOS VALORES EN POSICIONES IMPARES ES:"+" "+this.prom4);
System.out.println("EL ARREGLO ES");
System.out.println("");
for(int i=0;i<7;i++){
     System.out.println(arreglo[i]);
       }
    }

}





