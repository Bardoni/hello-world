package interfaz;

import dominio.Circulo;
import dominio.Rectangulo;

public class PruebasBasicas {

	public static void main(String[] args) {

		Circulo circulito = new Circulo("round", "rojo", 3);
		System.out.println(circulito.imprimirDatosBasicos());
		System.out.println(circulito.calcularArea());

		Rectangulo rectangulito = new Rectangulo("bitch", "amarillo", 2, 1);
		System.out.println(rectangulito.imprimirDatosBasicos());
		System.out.println(rectangulito.calcularArea());
System.out.println(rectangulito.calcularPerimetro());


	}


}
