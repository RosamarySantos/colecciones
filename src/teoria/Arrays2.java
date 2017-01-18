package teoria;

public class Arrays2 {
	public static void main(String[] args) {
		//definimos un array bidimensiona de int
		final int TAMANO_FILAS = 3;
		final int TAMANO_COLUMNAS = 3;
		int[][] coleccionBidemensionalEnteros =
				new int[TAMANO_FILAS][TAMANO_COLUMNAS];
		//primera fila o fila 0
		coleccionBidemensionalEnteros[0][0] = 0;
		coleccionBidemensionalEnteros[0][1] = 1;
		coleccionBidemensionalEnteros[0][2] = 2;
		//segunda fila o fila 1
		coleccionBidemensionalEnteros[1][0] = 3;
		coleccionBidemensionalEnteros[1][1] = 4;
		coleccionBidemensionalEnteros[1][2] = 5;
		//tercera fila o fila 2
		coleccionBidemensionalEnteros[2][0] = 6;
		coleccionBidemensionalEnteros[2][1] = 7;
		coleccionBidemensionalEnteros[2][2] = 8;
		//recorremos el array
		for (int i = 0; i < coleccionBidemensionalEnteros.length; i++) {
			for (int j = 0; j < coleccionBidemensionalEnteros[i].length; j++)
			{
				System.out.println(coleccionBidemensionalEnteros[i][j]);
			}
		}
		System.out.println("_______________________________");
		//cambiamos el bucle
		for (int[] is : coleccionBidemensionalEnteros) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		System.out.println("_______________________________");
		System.out.println("_______________________________");
		//ahora creamos la coleccion bidemensional y la inicializamos
		int[][][] coleccionTridemensionalEnteros = {
				{ {1,2},  {3,4} },	
				{ {5,6},  {7,8} },
				{ {9,10}, {11, 12} }
		};
		//recorrer los elementos pares
		for (int[][] is : coleccionTridemensionalEnteros) {
			for (int[] is2 : is) {
				for (int i : is2) {
					if (i % 2 == 0)
						System.out.println(i);
				}
			}
		}
		
		

	}
}
