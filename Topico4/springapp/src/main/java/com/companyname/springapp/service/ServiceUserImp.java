package com.companyname.springapp.service;

import org.springframework.stereotype.Service;

import com.companyname.springapp.domain.Cart;
import com.companyname.springapp.domain.Product;
import com.companyname.springapp.domain.User;

@Service
public class ServiceUserImp implements ServiceUser {

	public User createUser(Cart carrito) {
		
		carrito.getUser().toString();
		return carrito.getUser();
	
	}

	public void addFriend(User usr,String name) {
	
		usr.addFriend(name);
		for (String listaFriend : usr.getFriendList()) {
            System.out.println("" + listaFriend);
        }
        System.out.println(""+usr.toString());
	}

	public void likePhoto(User usr,int id) {
		
	}

	
	
}
