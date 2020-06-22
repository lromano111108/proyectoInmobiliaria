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
public class Departamento extends Propiedad {

    float expensas;

    public Departamento(float expensas, String direccion, int cantHabitaciones, float precio, boolean usoComercial, int cantInquilinos) {
        super(direccion, cantHabitaciones, precio, usoComercial, cantInquilinos);
        this.expensas = expensas;
    }

    public float getExpensas() {
        return expensas;
    }
    

    @Override
    public float calculoAlquiler() {
        float alquiler = 0;
        if (isUsoComercial()) {
            alquiler = getPrecio() + 500 + expensas;
            setPrecio(alquiler);
        } else {
            alquiler = getPrecio() + expensas;
            setPrecio(alquiler);
        }

        return alquiler;

    }

    @Override
    public String toString() {
        return  "Departamento: " + getDireccion() + "- Precio $" + getPrecio();
    }
    
    

}
