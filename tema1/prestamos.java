package tema1;

public class prestamos {
private int codigo;
private int contador=0;
	int dniEstudiante;
	int codLibro;
	public int getDniEstudiante() {
		return dniEstudiante;
	}
	public int getCodLibro() {
		return codLibro;
	}
	public prestamos(int dniEstudiante, int codLibro) {
		this.codigo = ++ contador;
		this.dniEstudiante = dniEstudiante;
		this.codLibro = codLibro;
	}
	public int getCodigo() {
		return codigo;
	}
}
