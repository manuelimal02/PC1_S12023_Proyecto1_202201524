package com.mycompany.deliveryusac;
/**
 *
 * @author manuel
 */
public class Tarjeta {
    public String correo;
    public String nombre;
    public long numero;
    public String fecha;
    
    public String getcorreo() {
        return correo;
    }
    public String getnombre() {
        return nombre;
    }   
    public long getnumero() {
        return numero;
    }
    public String getfecha() {
        return fecha;
    }
    public void setnumero(long numero) {
       this.numero=numero;
    }
    public void setfecha(String fecha) {
       this.fecha=fecha;
    }
}
