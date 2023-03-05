package com.mycompany.deliveryusac;
import javax.swing.ImageIcon;
/**
 *
 * @author manuel
 */
public class Usuario {
    public String correo;
    public String nombre;
    public String apellido;
    public String password;
    public long dpi;
    public String fechaNacimiento;
    public String genero;
    public String nacionalidad;
    public String sobrenombre;
    public long telefono;
    public String rol;
    public long contadorPaquete=0;
    public ImageIcon foto;

    public String getcorreo() {
        return correo;
    }
    public String getnombre() {
        return nombre;
    }
    public String getapellido() {
        return apellido;
    }
    public String getpassword() {
        return password;
    }
    public long getDPI() {
        return dpi;
    }
    public String getfechaNacimiento() {
        return fechaNacimiento;
    }
    public String getgenero() {
        return genero;
    }
    public String getnacionalidad() {
        return nacionalidad;
    }
    public String getsobrenombre() {
        return sobrenombre;
    }
    public long gettelefono() {
        return telefono;
    }
    public String getrol() {
        return rol;
    }
    public long getcontadorPaquete() {
        return contadorPaquete;
    }
    public ImageIcon getfoto() {
        return foto;
    }
    public void setcontadorPaquete(long contadorPaquete) {
        this.contadorPaquete=contadorPaquete;
    }
}
