/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes_restaurante;

/**
 *
 * @author KATHERINE
 */
public class Bebida {
    int cantidad;
    String nombre;
    String descripción;
    float precio;

    public Bebida(int cantidad, String nombre, String descripción, float precio) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebida{" + "cantidad=" + cantidad + ", nombre=" + nombre + ", descripci\u00f3n=" + descripción + ", precio=" + precio + '}';
    }
    
    
    
    
   
    
}
