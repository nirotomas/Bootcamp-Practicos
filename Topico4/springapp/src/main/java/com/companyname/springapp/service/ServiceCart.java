package com.companyname.springapp.service;
import com.companyname.springapp.domain.Cart;

//import java.util.List;

import com.companyname.springapp.domain.Product;

public interface ServiceCart {

	public Cart createCart();
	
    public void getProducts();

	public void addProducts(Product item);
	
	public Product readProduct(int id);
	
	public void removeProducts(int id);
	
	public Cart emptyCart();

    
}
