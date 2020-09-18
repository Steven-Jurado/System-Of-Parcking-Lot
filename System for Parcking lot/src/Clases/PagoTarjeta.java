
package Clases;

/**
 *
 * @author Steven
 */
public class PagoTarjeta extends Pago{
    
    private Integer numeroTarjeta, cvc;
    private String propietario;
    
    public PagoTarjeta(Double subtotal, Double total, Double iva) {
        super(subtotal, total, iva);
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getCvc() {
        return cvc;
    }

    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
