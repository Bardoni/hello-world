package cuentasBancarias;

public abstract class CuentaBase {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + saldo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBase other = (CuentaBase) obj;
		if (saldo != other.saldo)
			return false;
		return true;
	}

	private int saldo;

	public int depositar(int monto) {
		saldo += monto;
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
