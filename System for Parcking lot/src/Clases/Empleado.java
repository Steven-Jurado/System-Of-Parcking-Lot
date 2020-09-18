/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Steven
 */
public class Empleado extends Persona{
    private Double sueldo;

    public Empleado(Double sueldo, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.sueldo = sueldo;
    }
    
    
    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
