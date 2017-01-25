package ejercicios;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		//Producto p;
		Tienda tienda = new Tienda();
		// TODO Auto-generated method stub
		//refactorizamos código para simplificar
		//usamos el Scanner hasta que el identificador sea negativo
		System.out.println("Introduce productos. Para acabar usa identificador negativo");
		Scanner in = new Scanner(System.in);
		while(true){
			int identificador = in.nextInt();
			if (identificador < 0)
				break;
			String nombre = in.next();
			double precio = in.nextDouble();
		/*	p = new Producto(identificador, nombre, precio);
			tienda.insertarProducto(p);*/
			tienda.insertarProducto(
					new Producto(identificador, nombre, precio));
		}
		in.close();
	/*	int identificador1 = in.nextInt();
		String nombre1 = in.next();
		double precio1 = in.nextDouble();
		int identificador2 = in.nextInt();
		String nombre2 = in.next();
		double precio2 = in.nextDouble();
		int identificador3 = in.nextInt();
		String nombre3= in.next();
		double precio3 = in.nextDouble();
		Producto p1 = new Producto(identificador1, nombre1, precio1);
		Producto p2 = new Producto(identificador2, nombre2, precio2);
		Producto p3 = new Producto(identificador3, nombre3, precio3);
		//System.out.println(p1+"\n"+p2+"\n"+p3);
		Tienda tienda = new Tienda();
		tienda.insertarProducto(p1);
		tienda.insertarProducto(p2);
		tienda.insertarProducto(p3);*/
		System.out.println(tienda);
		//buscamos el producto mas barato, imprimimos la referencia
		System.out.println("Producto mas barato " + tienda.obtenerProductoMasBarato());
		//buscamos el producto mas caro, imprimimos el nombre y el precio
		Producto p = tienda.obtenerProductoMasCaro();
		System.out.printf("Producto mas caro, nombre %s, precio %.2f%n",
					p.getNombreProducto(),
					p.getPrecioProducto()
				);
		if (tienda.eliminarProducto(p)) //elimino el mas caro
			System.out.println("Eliminado producto " + p.getNombreProducto());
		System.out.println(tienda);
		//intentamos eliminar por el identificador del producto
		//debemos crear en Tienda un método de este tipo:
		// public Producto obtenerProductoPorIdentificador(int identidicador)
		
		
		
		

	}

}
