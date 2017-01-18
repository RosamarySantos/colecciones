package teoria;

import java.util.*;

public class Lista3 {
	public static void main(String[] args) {
		List<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.add(1);
		listaEnteros.add(2);
		listaEnteros.add(3);
		System.out.printf("Nº de elementos: %d%n", listaEnteros.size());
		System.out.printf("%s%n", listaEnteros);
		listaEnteros.remove(0);
		listaEnteros.add(1);
		listaEnteros.add(2);
		listaEnteros.add(3);
		System.out.printf("%s%n", listaEnteros);
		listaEnteros.remove((new Integer(3))); //elimina el primero 
		System.out.printf("%s%n", listaEnteros);
		
		for (Integer integer : listaEnteros) {
			System.out.println(integer);
		}
		
		int indice = 0;
		for (Integer integer : listaEnteros) {
			listaEnteros.set(indice, 
					(int) Math.pow(listaEnteros.get(indice),2));
			indice++;
		}
		System.out.printf("%s%n", listaEnteros);
		
		for (int i = 0; i < listaEnteros.size(); i++) {
			listaEnteros.set(i,(int) Math.pow(listaEnteros.get(i),2));
		}
		System.out.printf("%s%n", listaEnteros);

	}
}
