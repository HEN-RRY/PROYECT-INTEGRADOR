package mx.pi1.com.elitew;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String constrasenia;
    private String correo;
    private Date fechaIngreso;

    public Persona(
            String nombre, 
            String apellido, 
            String constrasenia, 
            String correo, 
            Date fechaIngreso
           ) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.constrasenia = constrasenia;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getConstrasenia() {
        return constrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    
    public void setHoraSesión(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    
    
    
}