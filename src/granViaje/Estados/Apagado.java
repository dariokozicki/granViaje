package granViaje.Estados;

import granViaje.Auto;
import granViaje.Componentes.*;
import granViaje.Excepciones.*;
public class Apagado implements Estado{
	private static final Apagado apagado = new Apagado();
	private Apagado() {}
	public static Apagado get() {
		return apagado;
	}
	public void acelerar(Auto auto,int cantidad) {
		throw new AutoApagadoExcepcion("No se puede acelerar, el auto esta apagado.");
	}
	public boolean enReserva(Combustible combustible) {
		throw new AutoApagadoExcepcion("No se puede saber la reserva, el auto esta apagado.");
	}
	public boolean proximoAReserva(Combustible combustible) {
		throw new AutoApagadoExcepcion("No se puede saber la reserva, el auto esta apagado.");
	}
	public void encender(Auto auto) {
		auto.alterarTemperatura(70);
		auto.estado(Encendido.get());
	}
	public void apagar(Auto auto) {
		throw new AutoApagadoExcepcion("El auto no se puede apagar, ya esta apagado.");
	}
}
