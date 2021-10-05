package tema1;

public class Biblioteca {
	
	Libro libros [] = new Libro[1000];
	prestamos prestamosHistoricos[] = new prestamos[5000];
	
	public static void main(String[] args) {
		
	}
	
	public boolean prestar(Libro libro, estudiante estudiante) {
		if (estudiante.tomarPrestamo() && libro.isDisponible()) {
			libro.prestar();
			
			for (int i = 0; i < prestamosHistoricos.length; i++) {
				if (prestamosHistoricos[i]==null) {
					prestamos prestamo = new prestamos(estudiante.getDni(), libro.getCodigo());
					prestamosHistoricos[i]=prestamo;
				break;
				}
				
			}
			
			return true;
		}else return false;
		
	}
	
	public boolean imprimir(Libro libro) {
		if (!libro.isFotocopiable().startsWith("no")) {
			return true;
		}else return false;
	}
	
}
