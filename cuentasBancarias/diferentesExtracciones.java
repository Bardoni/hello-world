package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class diferentesExtracciones {

	@Test
	public void saldocorecto() {
		
		 CuentaSueldo cuenta = new CuentaSueldo();
		 cuenta.depositar(10);
		 cuenta.extraer(5);
		 assertEquals(5, cuenta.getSaldo());
		
	}

}
