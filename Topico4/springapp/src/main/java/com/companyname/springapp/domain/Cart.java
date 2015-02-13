package com.companyname.springapp.domain;
import java.util.ArrayList;
import java.util.List;

public class Cart {

	public List<Product> listaProductos=new ArrayList<Product>();   
    public double total=0;
    public User user;
    
    public Cart(Product p1,Product p2, User u1){
        agregarProducto(p1);
        agregarProducto(p2);
        setUser(u1);
    }
    
    public List<Product> getListaProductos() {
        return listaProductos;
    }
    
    public void setListaProductos(List<Product> lista) {
        listaProductos=lista;
    }
    
    public void agregarProducto(Product item) {
        listaProductos.add(item);
    }
    
    public void removeProducto(int id){
        this.listaProductos.remove(getIndexProducto(id));
    }
    
    public Product getProducto(int idProducto){
        Product producto;
        producto=listaProductos.get(getIndexProducto(idProducto));
        return producto;
    }
    
    /*public String Update(int idProducto,int cantidad){
       Product producto=listaProductos.get(getIndexProducto(idProducto));
       producto.setCantidad(cantidad);
       return producto.toString();
    }*/
    
    public void imprimirProductos() {

        for (Product listaProducto : this.listaProductos) {
            System.out.println("" + listaProducto);
        }
        System.out.println(""+user.toString());
    }

    private int getIndexProducto(int id){
        for (int i = 0; i < this.listaProductos.size(); i++) {
            //System.out.println("" + listaProductos.get(i).getIdProducto());
            if(listaProductos.get(i).getIdProducto()!=id) {
            } else {        
                return i;
            }        
        }
        System.out.println("No se encontro el producto");
        return -1;
    }
    
     public double getTotal() {
        for (Product listaProducto : this.listaProductos) {
            total += listaProducto.getPrice();
        }
        return total;
    }

     public User getUser() {
         return user;
     }

     public void setUser(User user) {
         this.user = user;
     }
     
    @Override
    public String toString() {
        String s="";
        
        for (Product listaProducto : this.listaProductos) {
            s+=""+listaProducto+"\n";
        }
        
        return "Carrito " + "listaProductos: \t" + s + ", \ntotal=" + getTotal() ;
    }
    
}
