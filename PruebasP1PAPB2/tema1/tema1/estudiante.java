package tema1;

public class estudiante {
	private int dni;
	private String apellido;
	private String nombre;
	private short poseeLibros;

	public estudiante(int dni, String apellido, String nombre) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean tomarPrestamo() {
		if (poseeLibros < 2) {
			poseeLibros++;
			return true;
		}else return false;
	}

	public boolean devolver() {
		if (poseeLibros > 0) {
			poseeLibros--;
			return true;
		}else return false;
	}

}
