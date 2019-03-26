package granViaje.Estados;

import granViaje.*;
import granViaje.Componentes.*;
import granViaje.Excepciones.AutoApagadoExcepcion;

public interface Estado {
	public void acelerar(Auto auto,int cantidad);
	public boolean proximoAReserva(Combustible combustible);
	public boolean enReserva(Combustible combustible);
	public void apagar(Auto auto) throws AutoApagadoExcepcion;
	public void encender(Auto auto);
}
