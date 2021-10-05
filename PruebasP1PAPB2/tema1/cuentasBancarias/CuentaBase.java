package cuentasBancarias;

public abstract class CuentaBase {
	private int saldo;

	public int depositar(int monto) {
		setSaldo(getSaldo() + monto);
		return getSaldo();

	}

	public abstract int extraer(int monto);

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public CuentaBase() {
this.saldo = 0;
}
	
	
}
