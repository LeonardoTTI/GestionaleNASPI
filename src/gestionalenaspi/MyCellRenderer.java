/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalenaspi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author deuco
 */
public class MyCellRenderer extends DefaultTableCellRenderer {   
    @Override
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(row%2==0){
            c.setBackground(Color.LIGHT_GRAY);
        }
        return c;
    }

    public MyCellRenderer() {
    }
    
}
