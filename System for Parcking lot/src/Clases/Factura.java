/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Steven
 */
public class Factura {
    private String ruc, fechafacturada;

    public Factura( String ruc, String fechafacturada) {
        this.ruc = ruc;
        this.fechafacturada = fechafacturada;
    }


    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getFechafacturada() {
        return fechafacturada;
    }

    public void setFechafacturada(String fechafacturada) {
        this.fechafacturada = fechafacturada;
    }

  
    
    public static class DetalleFactura{
        private Integer codigofactura;
        private String servicio, descripcion;

        public DetalleFactura(Integer codigofactura, String servicio, String descripcion) {
            this.codigofactura = codigofactura;
            this.servicio = servicio;
            this.descripcion = descripcion;
        }

        public Integer getCodigofactura() {
            return codigofactura;
        }

        public void setCodigofactura(Integer codigofactura) {
            this.codigofactura = codigofactura;
        }

        public String getServicio() {
            return servicio;
        }

        public void setServicio(String servicio) {
            this.servicio = servicio;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        
               
    }
    
}
