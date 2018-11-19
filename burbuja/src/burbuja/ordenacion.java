
package burbuja;

public class sub {
    public int arreglo[];
 
    public void burbuja_for(){
    int aux;

    for(int i=0;i<arreglo.length -1 ;i++){
       for(int j=0;j<arreglo.length -1;j++){
       if(arreglo[j]>arreglo[j+1]){
         aux=arreglo[j];
         arreglo[j]=arreglo[j+1];
          arreglo[j+1]=aux;
         }
      }
  } 
    presentar();
   }
    
  public void burbuja_while(){
  int aux;
  int i=1;

  while (i<arreglo.length){
    for(int j=0; j<arreglo.length-1;j++)
    {
     if(arreglo[j]>arreglo[j+1])
     {
        aux=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=aux;
         }
     }
   i++;
  }
  presentar(); 
  }

public void burbuja_dowhile(){
 int aux;
 int i=1;
do{ 
for(int j=0; j<arreglo.length-1;j++)
    if(arreglo[j]>arreglo[j+1]){
        aux=arreglo[j];
        arreglo[j]=arreglo[j+1];
        arreglo[j+1]=aux;
}
i++;
}
 while(i<arreglo.length); 
presentar(); 
}


public void metodo_llenar(int a){
 java.util.Scanner teclado;
 teclado=new java.util.Scanner(System.in);
    arreglo= new int [a];
 int b;
for(int i=0;i<a;i++){
    b=i+1;
 System.out.println("ingrese el valor de la posicion"+" "+b+":");
  arreglo[i]=teclado.nextInt(); 
   }
 System.out.println("Su arreglo esta lleno");
 }

public void presentar(){
 System.out.println("valores ordenados");
    for(int i=0;i<arreglo.length;i++){
 System.out.println(arreglo[i]);
   }
 }
}
