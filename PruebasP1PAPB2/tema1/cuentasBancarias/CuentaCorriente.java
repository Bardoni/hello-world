package cuentasBancarias;

public class CuentaCorriente  extends CuentaBase{

	private int descubierto;

	
	@Override
	public int extraer(int monto) {
		if ((getSaldo()+descubierto) >= monto) {
			setSaldo(-monto);
			if(getSaldo()<0) {
				int comision = (int) (getSaldo()*0.05);
				setSaldo(-comision);
			}
			
			
			
		}
		
		return getSaldo();
	}

	public CuentaCorriente(int descubierto) {
		super();
		this.descubierto=descubierto;
	}
	
	
	
}
