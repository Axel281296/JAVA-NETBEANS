/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author User
 */
public class registro {
     private java.util.ArrayList arrayautos; 
    //constructos
    public registro()
    {
        arrayautos = new java.util.ArrayList();
    }
    // metodos
    public void agregarauto()
    {
        System.out.println("Ingresar datos del auto");
        auto unauto = new auto();
        System.out.println("Digite marca");
        unauto.setMarca(  new java.util.Scanner(System.in).nextLine() );
        System.out.println("Digite modelo");
        unauto.setModelo( new java.util.Scanner(System.in).nextLine() );
        System.out.println("Digite año");
        unauto.setAnio(   new java.util.Scanner(System.in).nextInt() );
        System.out.println("Digite placa");
        unauto.setPlaca(  new java.util.Scanner(System.in).nextLine() );
        // adicionar al arreglo de autos
        arrayautos.add(unauto);
    }//fin metodo
    
    public void mostrarautos()
    {   System.out.println("tamanio del arreglo "+ arrayautos.size());
        for( int i=0; i < arrayautos.size(); i++)
        {
            auto auxauto= (auto)arrayautos.get(i);
            System.out.print(" Marca:  "+ auxauto.getMarca() );
            System.out.print(" Modelo: "+ auxauto.getModelo() );
            System.out.print(" Año: "+ auxauto.getAnio() );
            System.out.print(" Placa: "+ auxauto.getPlaca());
            System.out.println("");
        }//fin for
    }//fin metodo
    
    public void reemplazarauto( auto unauto, int indice)
    {
        arrayautos.set(indice, unauto);
    }//fin metodo
    
    public java.util.ArrayList getautos()
    {
        return arrayautos;
    }
    
    public void setautos( java.util.ArrayList arrayautos )
    {
        this.arrayautos = arrayautos;
    }
}
