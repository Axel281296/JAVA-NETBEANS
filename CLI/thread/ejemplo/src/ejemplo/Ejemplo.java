/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author User
 */
public class Ejemplo extends Thread{

 public Ejemplo(String srm){
 super(srm);
 }
 
 public void run(){
     for(int i=0;i<=10;i++)
 System.out.println(getName()+" "+i);
 }
    
    public static void main(String[] args) {
        new Ejemplo("pepe").start();
        new Ejemplo("paul").start();
    System.out.println("termino");
    }
    
}
