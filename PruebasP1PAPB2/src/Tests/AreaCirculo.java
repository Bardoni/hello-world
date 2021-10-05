package Tests;

import org.junit.Assert;
import org.junit.Test;

import dominio.Circulo;

public class AreaCirculo {

	@Test
	public void test() {
		Circulo circulito = new Circulo("round", "rojo", 3);
		int valorEsperado=28;
		Assert.assertEquals(valorEsperado, circulito.calcularArea());
	}

}
 