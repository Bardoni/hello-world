package tema1;

public class Libro {
	private TipoLibro tipo;
	private int codigo;
	private String nombre;
	private String autor;
	private static int contadorCodigos = 0;
	private boolean prestado = false;
	private boolean fotocopiable;
private boolean disponible = true;
	public Libro(TipoLibro tipo, String nombre, String autor) {

		this.tipo = tipo;
		this.codigo = ++contadorCodigos;
		this.nombre = nombre;
		this.autor = autor;
		if (tipo == TipoLibro.Geografia || tipo == TipoLibro.Historia) {
			this.fotocopiable = true;
		} else
			this.fotocopiable = false;
	}

	public String isFotocopiable() {
		if(fotocopiable == true) {
			return "se puede fotocopiar";
		}else return "no es fotocopiable";

	}

	public TipoLibro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLibro tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void prestar() {
		if (prestado == false && disponible == true) {
			prestado = true;
			disponible = false;
		}
	}
	
	public boolean isDisponible() {
		return disponible;
	}

	public void devolver() {
		if (prestado == true && disponible == false) {
			prestado = false;
			disponible = true;
			
		}
	}

}
