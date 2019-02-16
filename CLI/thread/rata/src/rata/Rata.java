
package rata;

public class Rata extends Thread{
    public static int dist;
    public static String gan;
    public static int temp=0;
    
    public Rata(String nombre){
    super(nombre); 
    }
    
    
    public void run(){
       
        
        for(int i=0;i<=dist;i++){
       
        System.out.println(getName()+" "+i);
        if(i==dist && temp==0){
             temp=temp+1;
             System.out.println(getName()+" "+"gano");
            
         }
            }
         
    }
    
    public static void main(String[] args) {
     java.util.Scanner teclado;
     teclado = new java.util.Scanner(System.in);
     
     String nrat[];
     int rat;
    
     
     System.out.println("BIENVENIDOS");
     
     System.out.println("INGRESE EL NUMERO DE RATAS");
     rat=teclado.nextInt();
     
     nrat=new String[rat];
     
     System.out.println("INGRESE LA DISTANCIA EN METROS");
     dist=teclado.nextInt();
     
     
        for(int i=0;i<rat;i++){
        int con=i+1;    
        System.out.println("INGRESE EL NOMBRE DE LA RATA"+" "+con);
        nrat[i]=teclado.next();
         }
        
        System.out.println("COMENCEMOS");
        System.out.println("  ");
        for(int i=0;i<rat;i++){
         new Rata(nrat[i]).start();
        }
    }
    
}
