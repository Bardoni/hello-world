package dominio;

public class Circulo extends Figura {

	public int radio;

	@Override
	public int calcularArea() {
		int area = (int) ((radio * radio) * Math.PI);
		return area;
	}

	@Override
	public int calcularPerimetro() {
		int perimetro = (int) (radio * 2 * Math.PI);
		return perimetro;
	}

	public Circulo(String nombre, String color, int radio) {
		super(nombre, color);
		this.radio =radio;
	}
	
	
	
	

}
