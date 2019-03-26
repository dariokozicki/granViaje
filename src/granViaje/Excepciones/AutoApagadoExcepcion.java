package granViaje.Excepciones;

public class AutoApagadoExcepcion extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AutoApagadoExcepcion(String mensajeError) {
		super(mensajeError);
	}
}
