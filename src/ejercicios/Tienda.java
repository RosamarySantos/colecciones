package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> listaProductos;
	
	//constructor genera una lista vacía
	public Tienda() {
		this.listaProductos = new ArrayList<Producto>();
	}
	public boolean insertarProducto(Producto p){
		return listaProductos.add(p);
	}
	public boolean eliminarProducto(Producto p){
		return listaProductos.remove(p);
	}
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public Producto obtenerProductoMasCaro(){
		Producto productoMasCaro = 
				listaProductos.get(0);
		for (Producto referenciaProductoLista : listaProductos) {
			if (referenciaProductoLista.getPrecioProducto() > 
				productoMasCaro.getPrecioProducto())
				productoMasCaro = referenciaProductoLista;
		}
		return productoMasCaro;
	}
	public Producto obtenerProductoMasBarato(){
		Producto productoMasBarato = 
				listaProductos.get(0);
		for (Producto referenciaProductoLista : listaProductos) {
			if (referenciaProductoLista.getPrecioProducto() < 
				productoMasBarato.getPrecioProducto())
				productoMasBarato = referenciaProductoLista;
		}
		return productoMasBarato;
	}
	@Override
	public String toString() {
		return "Tienda [listaProductos=" + listaProductos + "]";
	}
	
	
	
	
}
