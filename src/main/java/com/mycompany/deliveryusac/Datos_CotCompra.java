package com.mycompany.deliveryusac;
/**
 *
 * @author manuel
 */
public class Datos_CotCompra {
    public String correo;
    public String codigoPaquete; 
    public String numeroFactura;
    public String tipoServicio;
    public String destinatario;
    public String origen;
    public String destino;
    public long nit; 
    public String tipoPago; 
    public long tamanoPaquete;
    public long numeroPaquete; 
    public String fechaEnvio; 
    public double totalPago;
    
    public String getcorreo() {
        return correo;
    }
    public String getcodigoPaquete() {
        return codigoPaquete;
    }
    public String getnumeroFactura() {
        return numeroFactura;
    }
    public String gettipoServicio() {
        return tipoServicio;
    }
    public String getdestinatario() {
        return destinatario;
    }
    public String getorigen() {
        return origen;
    }
    public String getdestino() {
        return destino;
    }
    public long getnit() {
        return nit;
    }
    public String gettipoPago() {
        return tipoPago;
    }
    public long gettamanoPaquete() {
        return tamanoPaquete;
    }
    public long getnumeroPaquete() {
        return numeroPaquete;
    }
    public String getfechaEnvio() {
        return fechaEnvio;
    }
    public double gettotalPago() {
        return totalPago;
    }
}
