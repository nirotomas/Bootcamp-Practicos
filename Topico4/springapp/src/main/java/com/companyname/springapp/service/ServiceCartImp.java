package com.companyname.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.domain.Cart;
import com.companyname.springapp.domain.Product;
import com.companyname.springapp.domain.BeanFactory;

@Service
public class ServiceCartImp implements ServiceCart {

	@Autowired
	private Cart carrito;
	
    public Cart createCart(){
		
		return carrito=new BeanFactory().getInstance();
		
	}
	
    public Cart getCart(){
    	return carrito;
    }
    
    public void getCart(Cart cart){
    	carrito=cart;
    }
    
    public void getProducts(){
    	
    	carrito.imprimirProductos();
    	
    }

	public Product readProduct(int id){
		return carrito.getProducto(id);

	}
	
	public void removeProducts(int id){
		carrito.removeProducto(id);
	}

	public void addProducts(Product item) {
		carrito.agregarProducto(item);
	}

	public Cart emptyCart() {
		if(this.carrito==null){
			throw new RuntimeException("No shopping cart initialized");
	      }
	    this.carrito.getListaProductos().clear();
	    this.carrito.user=null;
	    return carrito;
	}


}
