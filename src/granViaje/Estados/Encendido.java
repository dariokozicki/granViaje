package granViaje.Estados;
import granViaje.*;
import granViaje.Componentes.*;
import granViaje.Excepciones.*;

public class Encendido implements Estado{
	private static final Encendido encendido = new Encendido();
	private Encendido() {}
	public static Encendido get() {
		return encendido;
	}
	
	public void acelerar(Auto auto,int cantidad) {
		auto.velocidad(cantidad);
		auto.alterarTemperatura(0.2*cantidad);
	}
	public boolean enReserva(Combustible combustible) {
		return combustible.enReserva();
	}
	public boolean proximoAReserva(Combustible combustible) {
		return combustible.proximoAReserva();
	}
	public void apagar(Auto auto) {
		auto.enfriarseCompletamente();
		auto.estado(Apagado.get());
	}
	public void encender(Auto auto){
		throw new AutoEncendidoExcepcion("No se puede prender el auto, ya esta prendido.");
	}
}
