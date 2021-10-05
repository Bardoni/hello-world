package cuentasBancarias;

public class CuentaAhorro {
	
	int cantExtracciones=0;
	private int saldo;

	public int depositar(int monto) {
		setSaldo(getSaldo() + monto);
		return getSaldo();

	}

	public int extraer(int monto) {
		if (getSaldo() >= monto) {
			setSaldo(-monto);
			cantExtracciones++;
			if(cantExtracciones>=5) {
				setSaldo(-6);

			}
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
