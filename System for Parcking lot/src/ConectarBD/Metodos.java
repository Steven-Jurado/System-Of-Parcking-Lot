/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectarBD;

import Clases.Carro;
import Clases.Moto;

/**
 *
 * @author Steven
 */
public interface Metodos {
    public void Insertar(Carro car , Moto mot);
    public void Remover();
    public void listar();
    public void Buscar();
}
