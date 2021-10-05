package cuentasBancarias;

public class CuentaAhorro  extends CuentaBase{
	
	int cantExtracciones=0;
	

	

	public CuentaAhorro() {
		super();
	}




	public int extraer(int monto) {
		if (getSaldo() >= monto) {
			setSaldo(getSaldo()-monto);
			cantExtracciones++;
			if(cantExtracciones>=5) {
				setSaldo(getSaldo()-6);

			}
		}
		return getSaldo();

	}

	

	
}
