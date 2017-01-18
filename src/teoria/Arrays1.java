package teoria;
//arrays de una dimensión
import java.util.Iterator;

public class Arrays1 {

	public static void main(String[] args) {
		//creo la colección de  números enteros
		int[] coleccionEnteros = new int[3];
		//añadimos elementos a la colección
		coleccionEnteros[0] = 1;
		coleccionEnteros[1] = 2;
		coleccionEnteros[2] = 3;
		//recorremos la colección
		for (int i = 0; i < coleccionEnteros.length; i++) {
			System.out.println(coleccionEnteros[i]);
		}
		//otra forma de recorrer la colección
		for (int j : coleccionEnteros) {
			System.out.println(j);
		}
		//colección de cadenas
		String[] coleccionCadenas = new String[4];
		coleccionCadenas[0] = "hola";
		coleccionCadenas[1] = " ";
  		coleccionCadenas[2] = "mundo";
  		coleccionCadenas[3] = "\n";
  		//recorremos la colección
  		for (String cadena : coleccionCadenas) {
			System.out.print(cadena);
		}
  		//crear una colección de double inicializada
  		double[] coleccionDouble = {1.2, 1.5, -23.65, 0.005, 7};
  		//recorremos el array de double
  		for (double d : coleccionDouble) {
			System.out.printf("%9.3f", d);
		}
		
		
		
		
		
		
	}

}
