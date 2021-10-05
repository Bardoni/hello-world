package cuentasBancarias;

public class CuentaAhorro extends CuentaBase {

	int cantExtracciones = 0;

	public CuentaAhorro() {
		super();
	}

	public int extraer(int monto) {
		if (getSaldo() >= monto) {
			setSaldo(getSaldo() - monto);
			cantExtracciones++;
			if (cantExtracciones >= 5) {
				setSaldo(getSaldo() - 6);

			}
		}
		return getSaldo();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cantExtracciones;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaAhorro other = (CuentaAhorro) obj;
		if (cantExtracciones != other.cantExtracciones)
			return false;
		return true;
	}

}
