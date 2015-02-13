package com.companyname.springapp.service;

import com.companyname.springapp.domain.Cart;
import com.companyname.springapp.domain.User;

public interface ServiceUser {

	public User createUser(Cart carrito);
	
	public void addFriend(User usr, String name);
	
	public void likePhoto(User usr,int id) ;
	
}
