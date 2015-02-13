package com.companyname.springapp.app;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.companyname.springapp.domain.Cart;
import com.companyname.springapp.domain.Product;
import com.companyname.springapp.service.ServiceCart;
import com.companyname.springapp.service.ServiceCartImp;
import com.companyname.springapp.service.ServiceManager;

public class Application {
	

    private static final Product p3 = new Product(3, "parlantes Samnsung",10000);
    
    public static void main(String[] args) {
    	System.out.println("****************************************************************************************");
        System.out.println("STARTING CART CRUD(create read update delete) OPERATION");
        System.out.println("****************************************************************************************");
        try {
        	
        	//this could be replace with IoC Spring, or using BeanFactory 
        	ServiceCartImp serviceCartImp = new ServiceCartImp();
        	ServiceManager service = new ServiceManager();
        	service.setServiceCart(serviceCartImp);
        	
        	System.out.println("\n Creating a cart using service: \n");
        	
        	service.getShoppingCartService().createCart();
        	service.getShoppingCartService().getProducts();
        	
        	System.out.println("\n Reading a cart using service; \n");
        	service.getShoppingCartService().getProducts();
        	
        	System.out.println("\nUpdating a cart using service: \t Adding a cart item (parlantes)\n");
        	service.getShoppingCartService().addProducts(p3);
        	service.getShoppingCartService().getProducts();

        	System.out.println("\n Updating a cart using service: \t Deleting a cart item (id 1)\n");
        	service.getShoppingCartService().removeProducts(1);
        	service.getShoppingCartService().getProducts();
        	
        	System.out.println("\nDeleting a cart using service: ");
        	service.getShoppingCartService().emptyCart();
        	System.out.println("You Deleted the cart\n");
        	
        	System.out.println("****************************************************************************************");
            System.out.println("END CART CRUD(create read update delete) OPERATION DEMO");
            System.out.println("****************************************************************************************");

            
            
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.exit(0);
    }
}