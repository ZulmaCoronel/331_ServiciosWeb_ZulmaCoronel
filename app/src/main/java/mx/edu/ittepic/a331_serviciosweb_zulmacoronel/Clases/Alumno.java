package mx.edu.ittepic.a331_serviciosweb_zulmacoronel.Clases;

/**
 * Created by Zulma on 11/04/2018.
 */

public class Alumno {
    public String getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(String idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    String idalumno,nombre,direccion;

    public Alumno(String idalumno, String nombre, String direccion) {
        this.idalumno = idalumno;
        this.nombre = nombre;
        this.direccion = direccion;
    }
}

