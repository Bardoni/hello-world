package dominio;

public abstract class Figura {

	String nombre;
	String color;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Figura(String nombre, String color) {

		this.nombre = nombre;
		this.color = color;
	}
	public String imprimirDatosBasicos() {
		String datos = "soy " + nombre + " de color "+ color;
		return datos;
	}
	
	public abstract int calcularArea();
	
	public abstract int calcularPerimetro();
	
}
