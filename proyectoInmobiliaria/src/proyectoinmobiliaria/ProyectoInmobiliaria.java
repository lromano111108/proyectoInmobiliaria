/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinmobiliaria;

import java.awt.Color;

/**
 *
 * @author Lucas
 */
public class ProyectoInmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VentanaInmobiliaria nuevaVentana = new VentanaInmobiliaria();
        nuevaVentana.show(true);
        nuevaVentana.setBackground(Color.RED);
    }
    
}
