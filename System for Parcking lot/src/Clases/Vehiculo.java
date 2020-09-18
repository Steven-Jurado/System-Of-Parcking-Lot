
package Clases;
         
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public abstract class Vehiculo {
    private String placa, modelo, marca, propietarioVehiculo, Drescripcion ;
    private Integer capacidadPasajero;
    
    
    Date Fecha_Entrada = new Date();
    Date Hora_Entrada = new Date();
    SimpleDateFormat Español = new SimpleDateFormat("dd/MMMM/YYYY",new Locale("es"));
    SimpleDateFormat Hora = new SimpleDateFormat("HH:mm:ss", new Locale("es"));
    
    
    
    
    public Vehiculo(String placa, String propietarioVehiculo , String Marca) {
        this.placa = placa.toUpperCase();
        this.propietarioVehiculo = propietarioVehiculo.toUpperCase();
        this.marca = Marca.toUpperCase();
    }

    public String getHora() {
        return Hora.format(Hora_Entrada);
    }
    
    public String getFechaEntrada() {
        return Español.format(Fecha_Entrada);
    }

    public String getDrescripcion() {
        return Drescripcion;
    }

    public void setDrescripcion(String Drescripcion) {
        this.Drescripcion = Drescripcion;
    }

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietarioVehiculo() {
        return propietarioVehiculo;
    }

    public void setPropietarioVehiculo(String propietarioVehiculo) {
        this.propietarioVehiculo = propietarioVehiculo;
    }

    public Integer getCapacidadPasajero() {
        return capacidadPasajero;
    }

    public void setCapacidadPasajero(Integer capacidadPasajero) {
        this.capacidadPasajero = capacidadPasajero;
    }
    
    public void AgregarVehiculo (String Placa, String Propietario){
        this.placa = Placa.toUpperCase();
        this.propietarioVehiculo = Propietario.toUpperCase();
    }  

    public void BuscarCarro (String Placa, String Propietario){
        this.placa = Placa.toUpperCase();
        this.propietarioVehiculo = Propietario.toUpperCase();
    }
    
    public void QuitarVehiculo (String Placa, String Marca){
        if (this.placa.equals(Placa.toUpperCase())) {
            System.out.println("Placa Encontrada " + getPlaca());
        }
        else
            JOptionPane.showMessageDialog(null, "Vehiculo No Registrado");
    }
    
    public void ModificarVehiculo(String Placa, String Propietario){
        this.placa = Placa.toUpperCase();
        this.propietarioVehiculo = Propietario.toUpperCase();
    }
}
