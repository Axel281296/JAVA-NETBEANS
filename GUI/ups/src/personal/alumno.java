
package personal;

import java.util.Date;

public class alumno extends persona {
  private int id;
  private String sexo;
  private String padre;
  private String madre;
  private String carrera;

    public alumno() {
    }

    public alumno(int id, String sexo, String padre, String madre, String carrera, String cedula, String nombre, String apellido, int edad, Date fechadenacimiento) {
        super(cedula, nombre, apellido, edad, fechadenacimiento);
        this.id = id;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
}
