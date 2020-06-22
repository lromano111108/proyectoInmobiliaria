/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinmobiliaria;

/**
 *dirección, cantidad de habitaciones, precio base de alquiler,
 * @author Lucas
 */
public abstract class Propiedad {
    private String direccion;
    private int cantHabitaciones;
    private float precio;
    private boolean usoComercial;
    private int cantInquilinos;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public void setUsoComercial(boolean usoComercial) {
        this.usoComercial = usoComercial;
    }

    public int getCantInquilinos() {
        return cantInquilinos;
    }

    public void setCantInquilinos(int cantInquilinos) {
        this.cantInquilinos = cantInquilinos;
    }

    public Propiedad(String direccion, int cantHabitaciones, float precioBase, boolean usoComercial, int cantInquilinos) {
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.precio = precioBase;
        this.usoComercial = usoComercial;
        this.cantInquilinos = cantInquilinos;
    }
    
    public  abstract float calculoAlquiler();
}
