/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.topico4_Spring;

/**
 *
 * @author Tomas
 */
class BeanFactory {

   

    Carrito getInstance() {
        Producto producto = new Producto(1,"Ferrari F50",40000);
        Producto producto2 = new Producto(2,"Lamborgini Diablo",60000);
        
        Carrito carrito = new Carrito(producto,producto2);
        carrito.addProducto(producto);
        carrito.addProducto(producto2);
        
        return carrito;
        
        
    }
    
}
