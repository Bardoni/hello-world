package dominio;

public class Rectangulo extends Figura{

	private int base;
	private int altura;
	public Rectangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	

	@Override
	public int calcularArea() {
		int area = base*altura;
		return area;
	}

	@Override
	public int calcularPerimetro() {
		int perimetro = ((base*2)+(altura*2));
		return perimetro;
	}

}
