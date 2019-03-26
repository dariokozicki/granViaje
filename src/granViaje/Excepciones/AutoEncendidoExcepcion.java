package granViaje.Excepciones;

public class AutoEncendidoExcepcion extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AutoEncendidoExcepcion(String mensajeError) {
		super(mensajeError);
	}
}
