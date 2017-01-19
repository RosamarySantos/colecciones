package ejercicios;

import java.util.Arrays;

public class Colecciones1 {
	//atributo
	private double[] datos;

	public Colecciones1(double[] datos) {
		this.datos = datos;
	}
	
	public double[] getDatos() {
		return datos;
	}

	@Override
	public String toString() {
		return  Arrays.toString(datos);
	}

	
	
	
}
