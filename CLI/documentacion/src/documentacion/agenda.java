/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentacion;

/**
 *
 * @author User
 */
public class agenda {
     private java.util.HashMap personas;
    //constructor
    public agenda()
    {
           personas = new java.util.HashMap();
    }
    //metodos
    public void agregarpersona()
    {
         System.out.println("Ingrese datos de la personas");
         persona auxpersona = new persona();
            System.out.println("Digite cedula:");
            auxpersona.setCedula( new java.util.Scanner(System.in).nextLine() );
            System.out.println("Digite nombre");
            auxpersona.setNombre( new java.util.Scanner(System.in).nextLine() );
            System.out.println("Digite telefono");
            auxpersona.setTelefono(new java.util.Scanner(System.in).nextLine() );
            System.out.println("Digite direccion");
            auxpersona.setDireccion(new java.util.Scanner(System.in).nextLine() );
            // adicionar al diccionario
            personas.put( auxpersona.getCedula(), auxpersona);
    }//finmetodo
    
    public void mostrarunapersona(String clave)
    {
            persona auxper;
            auxper = (persona)personas.get(clave);
            System.out.print( " Cedula: "+ auxper.getCedula() );
            System.out.print( " Nombre  "+ auxper.getNombre() +" ");
            System.out.print( " Fono: "+ auxper.getTelefono() +" ");
            System.out.print( " Dir: "+ auxper.getDireccion() +" ");
            System.out.println("");
    }//fin metodo
    
    public void mostrarpersonas()
    {
        java.util.Iterator it = personas.entrySet().iterator();
        while ( it.hasNext() )
        {
            java.util.Map.Entry e = (java.util.Map.Entry)it.next();
            persona auxper = (persona)e.getValue();
            System.out.print( " Cedula: "+ auxper.getCedula() );
            System.out.print( " Nombre  "+ auxper.getNombre() +" ");
            System.out.print( " Fono: "+ auxper.getTelefono() +" ");
            System.out.print( " Dir: "+ auxper.getDireccion() +" ");
            System.out.println("");
        }//fin while
    }//fin metodo
    
    public java.util.HashMap getpersonas()
    {
            return personas;
    }
    
    public void setpersonas( java.util.HashMap personas)
    {
           this.personas = personas;
    }
}
