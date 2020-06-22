/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinmobiliaria;

/**
 *
 * @author Lucas
 */
public class Casa extends Propiedad {

    private boolean garage;

    public Casa(boolean garage, String direccion, int cantHabitaciones, float precio, boolean usoComercial, int cantInquilinos) {
        super(direccion, cantHabitaciones, precio, usoComercial, cantInquilinos);
        this.garage = garage;
    }

    public boolean isGarage() {
        return garage;
    }
    
    

    public float calculoAlquiler() {
         float alquiler = 0;
        if (isUsoComercial()) {
            alquiler = getPrecio() + 1000;
            setPrecio(alquiler);
        } else {
            alquiler = getPrecio();
            setPrecio(alquiler);
        }

        return alquiler;
    }

    @Override
    public String toString() {
        return "Casa: " + getDireccion() + "- Precio $" + getPrecio();
    }
    

}
