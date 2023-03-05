package com.mycompany.deliveryusac;
/**
 *
 * @author manuel
 */
public class Region_Precio {
    private String nombreRegion;
    private double precioEspecial;
    private double precioEstandar;
    private long contador=0;
    
    public String getnombreRegion() {
        return nombreRegion;
    }
    public double getprecioEspecial() {
        return precioEspecial;
    }
    public double getprecioEstandar() {
        return precioEstandar;
    }
    public long getcontador() {
        return contador;
    }    
    
    public void setnombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }
    public void setprecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }
    public void setprecioEstandar(double precioEstandar) {
        this.precioEstandar = precioEstandar;
    }
    public void setcontador(long contador) {
        this.contador = contador;
    }
}
