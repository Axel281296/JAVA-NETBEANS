/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos3;

/**
 *
 * @author User
 */
public class sub {
    public double []alumnos;
    public int nalum,nb,nsp,aprob,rprob;
    public double suma,promedio,nmayor,nmenor;
    public void consulta(){
     
     java.util.Scanner teclado;
     teclado= new java.util.Scanner(System.in);
     
     System.out.println("CANTIDAD DE ESTUDIANTES");
     this.nalum=teclado.nextInt();
     
     System.out.println("CUAL ES LA NOTA MINIMA PARA APROBAR");
     this.nb=teclado.nextInt();
     
     this.alumnos = new double [nalum];
    }//fin consulta
    
   public void relleno(){
   java.util.Scanner ingreso;
   ingreso= new java.util.Scanner(System.in);
   for(int i=0;i<this.nalum;i++)
   {
   int q=i+1;    
   System.out.println("INGRESE LA NOTA"+" "+q+":");
   double a=ingreso.nextDouble();
   this.suma=suma+a;
   
   this.alumnos[i]=a;
     }//final for 
   this.promedio=suma/nalum;
   } //fina relleno
   
   
   public void proceso(){
   for( int i=0;i<this.nalum;i++){
     if(this.alumnos[i]> this.nmayor)
      {
      this.nmayor=this.alumnos[i];
      }
      else 
      {
     this.nmenor=this.alumnos[i];     
      }
        }// final for
//   
   for( int i=0; i<this.nalum; i++)
   {
    if(alumnos[i]>promedio){
    this.nsp=nsp+1;
    }//fin if
}//fin for
   
   for(int i=0;i<this.nalum;i++){
    if(alumnos[i]>this.nb){
     this.aprob=aprob+1;
    }
    else{
    this.rprob=rprob+1;
    }//fin if else
   }//fin for

        }// final de proceso
   
///
   
   public void imprimir(){
   System.out.println("NOTAS");
       for(int i=0;i<this.nalum;i++)
   {
   System.out.println(alumnos[i]);
   }//fin for
   System.out.println("RESULTADOS");
   System.out.println("LA NOTA MAYOR ES:"+this.nmayor);
   System.out.println("LA NOTA MENOR ES:"+this.nmenor);
   System.out.println("EL PROMEDIO ES:"+this.promedio);
   System.out.println("EL NUMERO DE NOTAS MAYOR AL PROMEDIO ES:"+this.nsp);
   System.out.println("ALUMNOS APROBADOS:"+this.aprob);
   System.out.println("ALUMNOS REPOBRADOS:"+this.rprob);
   }// fin imprimir
   
   
}