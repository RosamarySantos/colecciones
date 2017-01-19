package ejercicios;

import java.util.Arrays;

public class TestColecciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
		double[] numeros = new double[12];
		Arrays.fill(numeros, 0); //rellena de 0 el array numeros
		Colecciones1 c1 = new Colecciones1(numeros);
		System.out.println("Array inicial lleno de ceros " + c1);
		c1.getDatos()[c1.getDatos().length - 1] = 5;
		System.out.println("Arrays con el valor 5 en el último"
				+ "elemento " + c1);
		//añade la secuencia 3,6,12 ....
		for (int i = 0; i < c1.getDatos().length - 1; i++) {
			c1.getDatos()[i] = 3 * (i + 1); //hay que cambiarlo
		}
		System.out.println(c1);
		//sumamos los valores del array
		double suma = 0;
		for (double d : c1.getDatos()) {
			suma += d;  
		}
		System.out.printf("La suma de los valores del array "
				+ "vale %.2f%n",suma);
		//modificamos los 5 últimos valores
		for (int i = c1.getDatos().length - 5; i < c1.getDatos().length; i++) {
			c1.getDatos()[i] = c1.getDatos()[i] / 3.0;
		}
		System.out.println(c1);

		
		
		
	}

}
