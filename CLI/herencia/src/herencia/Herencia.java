/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import java.io.*; 
import java.util.* ;
/**
 *
 * 
 * @author User
 */
class persona{
    protected int codigo;
    protected String nombre;
    protected String apellido;
public persona (int codigo,String nombre,String apellido){
  this.codigo=codigo;
  this.nombre=nombre;
  this.apellido=apellido;
  
 }
public String datos(){
return this.apellido+" "+this.nombre+" "+this.codigo;
}
public String verificacion(){
    return this.datos();
}
}
 class empleado extends persona{
    protected String cargo;
    public empleado(int codigo, String nombre, String apellido,String cargo) {
        super(codigo, nombre, apellido);
        this.cargo=cargo;
    }
 public String asignacion(){
 return super.verificacion() + ", cargo: " + this.cargo;
 }
}

class cliente extends persona{
protected String tipocliente;
    public cliente(int codigo, String nombre, String apellido,String tipocliente) {
        super(codigo, nombre, apellido);
        this.tipocliente=tipocliente;
    }
        
}

public class Herencia {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        persona a = new persona(1,"axel","salazar");
        empleado objeto1 = new empleado(1,"axel","salazar","cargo");
        cliente obj2 = new cliente(1,"usuario","apellidodeu","frecuente");
        
        
        System.out.println("Verificacion a: " + objeto1.datos()); 
        System.out.println("verificacion b: " + objeto1.asignacion()); 
        System.out.println("Verificacion c: " + obj2.tipocliente ); 
    }
}
