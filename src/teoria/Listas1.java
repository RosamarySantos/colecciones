package teoria;

import java.util.ArrayList;
import java.util.List;

public class Listas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos la lista vacía
		List<String> listaCadenas = new ArrayList<String>();
		System.out.printf("Tamaño de la lista %d%n", listaCadenas.size());
		listaCadenas.add("joaquin");
		listaCadenas.add("luis");
		listaCadenas.add("fernando");
		listaCadenas.add("wenceslao");
		System.out.printf("Tamaño de la lista %d%n", listaCadenas.size());
		System.out.printf("Primer elemento de la lista %s%n", listaCadenas.get(0));
		System.out.printf("Último elemento de la lista %s%n", listaCadenas.get(listaCadenas.size() - 1));
		System.out.printf("%s%n", listaCadenas);
		listaCadenas.add(0, "rodrigo");
		System.out.printf("%s%n", listaCadenas);
		listaCadenas.remove(0);
		System.out.printf("%s%n", listaCadenas);
		listaCadenas.remove("luis");
		System.out.printf("%s%n", listaCadenas);
		//recorremos la lista
		for (String cadena : listaCadenas) {
			System.out.println(cadena);
		}


	}

}
