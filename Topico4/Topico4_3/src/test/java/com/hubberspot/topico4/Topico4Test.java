/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.topico4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomas
 */
public class Topico4Test {
    
    public Topico4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        
        Producto producto = new Producto(1,"auto",40000);
        Producto producto2 = new Producto(2,"auto2",60000);
        Carrito carrito = new Carrito();
        
        carrito.addProducto(producto);
        carrito.addProducto(producto2);
        
    }
    
    @Test
    public void testSomeMethod2() {
        
        Producto producto = new Producto(1,"auto",40000);
        Producto producto2 = new Producto(2,"auto2",60000);
        Carrito carrito = new Carrito();
        
        carrito.addProducto(producto);
        carrito.addProducto(producto2);
        carrito.imprimirProductos();
    }
    
    @Test
    public void testSomeMethod3() {
        
        Producto producto = new Producto(1,"auto",40000);
        Producto producto2 = new Producto(2,"auto2",60000);
        Carrito carrito = new Carrito();
        
        carrito.addProducto(producto);
        carrito.addProducto(producto2);
        carrito.imprimirProductos();
        carrito.removeProducto(1);
        carrito.imprimirProductos();
    }
    
    @Test
    public void testSomeMethod4() {
        
        Producto producto = new Producto(1,"auto",40000);
        Producto producto2 = new Producto(2,"auto2",60000);
        Carrito carrito = new Carrito();
        
        carrito.addProducto(producto);
        carrito.addProducto(producto2);
        carrito.imprimirProductos();
        //carrito.removeProducto("auto");
        //carrito.imprimirProductos();
        assertEquals("100000.0", ""+carrito.getTotal());
    }
    
}
