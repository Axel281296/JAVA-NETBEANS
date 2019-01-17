package data;

import java.util.ArrayList;
import personal.alumno;

public class dataAlumnos {
private ArrayList<alumno> datos= new ArrayList<alumno>();

public ArrayList<alumno> getDatos(){
return datos;
}

public void add(alumno prmRegAlumno){
 datos.add(prmRegAlumno);
 }
public boolean delete(alumno prmRegAlumno){
boolean estado =false;
    for(alumno reg:datos){
 if(reg.equals(prmRegAlumno))
 { 
     datos.remove(reg);
     estado=true;
  break;
  }
 }
    return estado;
 }  
}

