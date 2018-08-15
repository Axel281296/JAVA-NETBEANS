/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos27;
/**
 *
 * @author User
 */
public class sub {
    int [][]matrice;
    public int dim;
    public int re,ren,sumas;
    int []sumax;
    int []sumay;
    public int run,res,gana,pierde;
    
    
    public void consulta(){
    java.util.Scanner teclado;
    teclado = new java.util.Scanner(System.in);
    
        System.out.println("ALGORTIMO");
      System.out.println("");
        System.out.println("DE CUANTO SERA SU MATRIZ");
        dim=teclado.nextInt();
        
        matrice=new int [dim][dim];   
        sumax=new int[dim];  
          sumay=new int[dim];
        
    }
    
    public void llenar(){
    java.util.Scanner entrada;
    entrada= new java.util.Scanner(System.in);
    System.out.println("RELLENE");    
    int tempx;
    int tempy;
    for(int i=0;i<dim;i++){
       for(int j=0;j<dim;j++)
       {
           tempx=i+1;
           tempy=j+1;
     System.out.println("VALOR DE LA POSICION"+" "+tempx+","+tempy);  
      matrice [i][j]=entrada.nextInt();
      
        }   
    }
    }
    
    public void repetir(){
    int temp;
    int lo;
    
    for(int i=0;i<dim;i++){
        for(int j=0;j<dim;j++){
            temp=matrice[i][j];
      for(int ix=0;ix<dim;ix++)
          for(int jy=0;jy<dim;jy++){
       {
       if(temp==matrice[ix][jy]){
        this.re=re+1;
        }   
       else
        {
        this.ren=0;
       }
        }
      }
     }
    }
   
    lo=(dim*dim)/this.re;
    if(lo!=0){
       // System.out.println("GANA");
       this.res=0;
               }
   else{
        
              this.res=1;
          //  System.out.println("PIERDE");
       
    
    }    
    System.out.println(this.res);
    }   
    
    public void marcador(){
     int potencia; 
     int n=1;
     potencia=this.dim*this.dim;
     while(n<=potencia){
     this.run=run+n;
     n=n+1;
     }
     this.run=this.run/dim;
     //System.out.println("resultado es:"+run); 
     }
       
    

  public void sumas(){
       
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < dim; i++) {
            System.out.println();
            for (int j = 0; j < dim; j++) {
                  System.out.print(matrice[i][j] + " ");              
            }            
        }
        
       // System.out.println("\nSuma Fila.");
      
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                  this.sumax[i] += matrice[i][j];              
            }
            //System.out.println("Fila " + i + " =" + sumax[i]);
         
        }
        //System.out.println("\nSuma Columna");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                  this.sumay [i]+= matrice[j][i];              
            }
           // System.out.println("Columna " + i + " =" + sumay[i]);
         
        }
  }
  
  public void terminar(){
      
      
      for(int i=0;i<dim;i++){
   if(this.res!=0 || this.sumax[i]!=this.run ){
    //System.out.println("PIERDES");
    this.pierde=pierde+1;
   }
   else
   {
    this.gana=gana+1;   
//System.out.println("GANA");
   }
      }
    for(int i=0;i<dim;i++){
   if(this.res!=0 || this.sumay[i]!=this.run ){
    //System.out.println("PIERDES");
     this.pierde=pierde+1;
   }
   else
   {
   //System.out.println("GANA");
       this.gana=gana+1; 
   }
      }
    int fgana;
    fgana=(this.dim*2)/gana;
    if(fgana==1){
     System.out.println("HAS GANADO");
    }
    else{
    System.out.println("TU ACABAS DE PERDER");
    }
  }  
  
  }
    
       


