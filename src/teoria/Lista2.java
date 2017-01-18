package teoria;

import java.util.ArrayList;
import java.util.List;

//no parametrizamos las listas
//vemos que inconvenientes tendría
public class Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List listaCadenas = new ArrayList();
		//parametrizada sería
		//List<String> listaCanenas = new ArrayList<String>();
		listaCadenas.add("uno");
		listaCadenas.add("dos");
		listaCadenas.add("tres");
		System.out.println(listaCadenas);
		listaCadenas.clear();
		listaCadenas.add(1);
		listaCadenas.add(2);
		System.out.println(listaCadenas);
		//System.out.println(listaCadenas.get(0) + listaCadenas.get(1));
		

		

	}

}
