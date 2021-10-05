package dominio;

public class Triangulo extends Figura {

	private int lado1;
	private int lado2;
	private int lado3;

	public Triangulo(String nombre, String color, int lado1, int lado2, int lado3) {
		super(nombre, color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public int calcularArea() {
		int altura = 0;
		int base = 0;
		base = Math.max(Math.max(lado1, lado2), lado3);
		// altura = ingrese formula de altura para triangulo escaleno, xq todas las que
		// aparecen en internet son en base al area y la formulas del area son en base a
		// la altura (:
		int area = ((base * altura) / 2);
		return area;
	}

	@Override
	public int calcularPerimetro() {
		int perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}

}
