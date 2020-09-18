/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author TaGCode
 */
public class Moto extends Vehiculo {

    public Moto(String placa, String propietarioVehiculo, String Marca) {
        super(placa.toUpperCase(), propietarioVehiculo.toUpperCase(), Marca.toUpperCase());
    }
    
}
