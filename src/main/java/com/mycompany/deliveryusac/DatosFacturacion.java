package com.mycompany.deliveryusac;
/**
 *
 * @author manuel
 */
public class DatosFacturacion {
    public String correo;
    public String nombreCompleto;
    public String direccion;
    public String nit;
    
    public String getcorreo() {
        return correo;
    }
    public String getnombreCompleto() {
        return nombreCompleto;
    }
    public String getdireccion() {
        return direccion;
    }
    public String getnit() {
        return nit;
    } 
    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto=nombreCompleto;
    }
    public void setdireccion(String direccion) {
        this.direccion=direccion;
    }
    public void setnit(String nit) {
        this.nit=nit;
    }
}
