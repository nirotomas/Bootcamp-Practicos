/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.topico4_BeanFactory;

import java.util.ArrayList;
import java.util.List;
import com.hubberspot.topico4_BeanFactory.Producto;

/**
 *
 * @author Tomas
 */
class Carrito {
    public List<Producto> listaProductos=new ArrayList<>();   
    public double total=0;

    public void addProducto(Producto item) {
        listaProductos.add(item);
    }
    
    public void removeProducto(int id){
        this.listaProductos.remove(getIndexProducto(id));
    }
    
    public void imprimirProductos() {

        for (Producto listaProducto : this.listaProductos) {
            System.out.println("" + listaProducto);
        }
        
    }

    private int getIndexProducto(int id){
        for (int i = 0; i < this.listaProductos.size(); i++) {
            System.out.println("" + listaProductos.get(i).getIdProducto());
            if(listaProductos.get(i).getIdProducto()!=id) {
            } else {        
                return i;
            }        
        }
        System.out.println("No se encontro el producto");
        return -1;
    }
    
     public double getTotal() {
        for (Producto listaProducto : this.listaProductos) {
            total += listaProducto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        String s="";
        
        for (Producto listaProducto : this.listaProductos) {
            s+=""+listaProducto+"\n";
        }
        
        return "Carrito " + "listaProductos: \t" + s + ", \ntotal=" + getTotal() ;
    }
     
     

}
