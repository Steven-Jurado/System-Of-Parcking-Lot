/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Steven
 */
public class ModeloTabla extends DefaultTableCellRenderer{
    
    public static void main(String[] args) {
        
    }

    Color  color = new Color(60,141,168);
    Component Componente ;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        if (Par(row)) {
            Componente.setBackground(color);
            Componente.setForeground(Color.BLACK);
        }
        else{
            Componente.setBackground(Color.WHITE);
            Componente.setForeground(Color.BLACK);
        }
        return  Componente;
                
    }
    
    public boolean Par ( int Numero){
        return (Numero % 2 == 0);
    }
    
    
}
