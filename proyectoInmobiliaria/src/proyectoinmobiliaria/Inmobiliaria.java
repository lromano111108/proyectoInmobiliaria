/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
Calcular y mostrar el monto promedio de alquileres de las propiedades en donde vivan 2 inquilinos.
Calcular y mostrar la cantidad de casas de 3 habitaciones o más que posean garaje
 * and open the template in the editor.
 */
package proyectoinmobiliaria;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Inmobiliaria {

    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria() {
        this.propiedades = new ArrayList();
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void agregarPropiedad(Propiedad nuevaPropiedad) {
        propiedades.add(nuevaPropiedad);
    }

    public float promedioAlquileres2Inquilinos() {
        int contador = 0;
        float acumulador = 0;
        float promedio = 0;
        
        if (contador >0) {
            for (Propiedad propiedad : propiedades) {
            if (propiedad.getCantInquilinos() == 2) {
                acumulador += propiedad.getPrecio();
                contador++;
            }
            
        }
            promedio = acumulador / contador;
        }
        
        return promedio;
    }

//    public float promedioAlquileres2InquilinosConFuncion() {
//        int contador = 0;
//        float acumulador = 0;
//        float promedio = 0;
//
//        for (Propiedad propiedad : propiedades) {
//            if (propiedad.getCantInquilinos() == 2) {
//                acumulador += propiedad.calculoAlquiler();
//                contador++;
//            }
//        }
//        return promedio = acumulador / contador;
//    }

    public int cantidadCasas3OMasHab() {
        int contador = 0;
        for (Propiedad propiedad : propiedades) {
            if (propiedad instanceof Casa && propiedad.getCantHabitaciones() >= 3) {
                Casa c = (Casa) propiedad;
                if (c.isGarage()) {
                    contador++;
                }
            }

        }
        return contador;
    }
    
    

}
