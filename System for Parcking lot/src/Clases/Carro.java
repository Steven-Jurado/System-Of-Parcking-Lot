
package Clases;


public  class Carro extends Vehiculo {
    private Integer NumeroPuertas; 

    
    public Carro( String placa, String propietarioVehiculo , String Marca) {
        super(placa.toUpperCase(), propietarioVehiculo.toUpperCase() ,Marca.toUpperCase());
        
    }

    public Integer getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(Integer NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
    
    
        
}
    
   
    
