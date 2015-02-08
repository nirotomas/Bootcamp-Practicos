/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myservice;

/**
 *
 * @author Tomas
 */
class Producto {
      
    private int idProducto;
    private String nombre;
    private double precio;
    private int cantidad=1;
    
    public Producto(int idProducto, String nombre, double precio)
    {
        this.idProducto=idProducto;
        this.nombre=nombre;
        this.precio=precio;
    }

    public void setIdProducto(int idProducto) {
       this.idProducto = idProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setString(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getString() {
        return this.nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
   
    
    
   @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad +'}';
    }
}
