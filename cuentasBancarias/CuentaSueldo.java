package cuentasBancarias;

public class CuentaSueldo extends CuentaBase {

	public CuentaSueldo() {
		super();
	}

	public int extraer(int monto) {
		if (getSaldo() >= monto) {
			setSaldo(getSaldo() - monto);

		}
		return getSaldo();

	}

}
