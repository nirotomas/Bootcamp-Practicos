package com.companyname.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceManager {

	@Autowired
	ServiceCart serviceCart;
	
	public ServiceManager() {
    }

    public ServiceCart getShoppingCartService() {
        return serviceCart;
    }

    public void setServiceCart(ServiceCart serviceCart) {
        this.serviceCart = serviceCart;
    }

	
}
