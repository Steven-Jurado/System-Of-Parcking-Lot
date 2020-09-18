
package Clases;

/**
 *
 * @author Steven
 */
public class Cliente extends Persona{
    
    private char Licencia;
    public Cliente(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    public char getLicencia() {
        return Licencia;
    }

    public void setLicencia(char Licencia) {
        this.Licencia = Licencia;
    }
    
}
