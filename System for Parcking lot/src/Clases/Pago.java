/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class Pago {
    private Double subtotal, total, iva ;
    private Date Hora;
    private float HoraSalida;
    private final float ValorPorMinuto = (float) 1.70;

    public Pago(Double subtotal, Double total, Double iva) {
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }
    // corregir 
    public void CalcularPago(){
        String HoraString = Hora.toString();
        float Horas =Float.parseFloat(HoraString);
        //float Pago = (Math.round(Horas)) * ValorPorMinuto ;
        float Pago = ((HoraSalida) - Horas ) * ValorPorMinuto ;
        JOptionPane.showMessageDialog(null, "Su Pago sera de " + Math.round(Pago));
    }
    
    
}
