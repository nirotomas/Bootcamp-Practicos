/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tomas
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
   private Carrito carrito;
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Create")
    public String Create() {
        carrito=new BeanFactory().getInstance();
        return ""+carrito.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Read")
    public String Read(@WebParam(name = "idProducto") int id) {
        if(carrito.getProducto(id).toString()==null)
            System.out.println("Debe crear un carrito antes de buscar un producto en el mismo");
        return carrito.getProducto(id).toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Update")
    public String Update(@WebParam(name = "idProducto") int id,@WebParam(name = "cantidad") int cantidad) {
        carrito.getProducto(id).setCantidad(cantidad);
        return carrito.getProducto(id).toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Delete")
    public String Delete(@WebParam(name = "idProducto") int idProducto) {
        carrito.removeProducto(idProducto);
        return carrito.toString();
    }
    
    
    
}
