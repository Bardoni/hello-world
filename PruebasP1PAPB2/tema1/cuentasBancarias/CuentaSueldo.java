package cuentasBancarias;

public class CuentaSueldo {

	private int saldo;

	public int depositar(int monto) {
		setSaldo(getSaldo() + monto);
		return getSaldo();

	}

	public int extraer(int monto) {
		if (getSaldo() >= monto) {
			setSaldo(-monto);

		}
		return getSaldo();

	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
