package com.companyname.springapp.domain;

public class BeanFactory {
	
public  Cart getInstance() {

		Product producto = new Product(1,"Ferrari F50",40000);
        Product producto2 = new Product(2,"Lamborgini Diablo",60000);
        User u1 = new User(1,"Tomas Niro","nirotomas@gmail.com");
        
        Cart carrito = new Cart(producto,producto2,u1);
        /*carrito.agregarProducto(producto);
        carrito.agregarProducto(producto2);*/
        
        return carrito;
        
    }	
	
}
