package com.companyname.springapp.web;

import static org.junit.Assert.*;

import org.junit.Test;

import com.companyname.springapp.domain.Cart;
import com.companyname.springapp.domain.Photo;
import com.companyname.springapp.domain.Product;
import com.companyname.springapp.domain.User;
import com.companyname.springapp.service.ServiceCartImp;
import com.companyname.springapp.service.ServiceManager;
import com.companyname.springapp.service.ServiceUserImp;
import com.companyname.springapp.service.UserServiceManager;

public class LikePhotoAddFriend {

	@Test
	public void test() {
    	
		Cart carrito;
		User usr;
		Photo pic;
		pic = new Photo();
    	pic.setIdPhoto(1);
    	pic.setPathimage("/TigreEnLaMontaña.jpg");
		
		ServiceUserImp serviceUserImp = new ServiceUserImp();
    	UserServiceManager service = new UserServiceManager();
    	service.setServiceUser(serviceUserImp);
    	
    	//User its a Cart attribute, so I have to create one  
    	//and this is why Spring is so usefull.f my App worked with IoC Spring this would be much simple
    	ServiceCartImp serviceCartImp = new ServiceCartImp();
    	ServiceManager serviceC = new ServiceManager();
    	serviceC.setServiceCart(serviceCartImp);
    	carrito=serviceC.getShoppingCartService().createCart();
    	
    	usr=service.getServiceUser().createUser(carrito);
    	
    	service.getServiceUser().addFriend(usr,"Pedro");
    	
    	service.getServiceUser().likePhoto(usr,1);
    	
	}

}
