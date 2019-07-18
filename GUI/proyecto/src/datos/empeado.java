/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Kerly Moncerrate
 */
public class empeado {
     private String cedula;
    private String nombres;
    private String apellidos;
    private String edad;
    private String civil;
    private String telefono;
    private String sueldo;

    public String getCedula() {
        return cedula;
    }

    /**
     * @return the cedula
     * 
     */
    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {   
        this.cedula = cedula;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

 
     public String getCivil() {
        return civil;
    }

    /**
     * @param civil the civil to set
     */
    public void setCivil(String civil) {
        this.civil = civil;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

  
  
    
}
