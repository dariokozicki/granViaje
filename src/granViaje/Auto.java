package granViaje;
import granViaje.Estados.*;
import granViaje.Componentes.*;
public class Auto {
	Estado estado;
	Combustible combustible;
	Motor motor;
	double velocidad;
	public Auto(Estado estado, Combustible combustible, Motor motor) {
		this.estado = estado;
		this.combustible = combustible;
		this.motor = motor;
	}
	public void encenderse() {
		estado.encender(this);
	}
	public void apagarse() {
		estado.apagar(this);
	}
	public void acelerar(int cantidad) {
		estado.acelerar(this,cantidad);
	}
	public void detenerse() {
		alterarTemperatura(0.04*velocidad);
	}
	public boolean enReserva() {
		return estado.enReserva(this.combustible);
	}
	public boolean proximoAReserva() {
		return estado.proximoAReserva(this.combustible);
	}
	public double temperatura() {
		return motor.temperatura();
	}
	public void enfriarseCompletamente() {
		motor.enfriarseCompletamente();
	}
	public boolean estaCaliente() {
		return motor.estaCaliente();
	}
	public void recorrerKilometros(int kilometros) {
		combustible.consumirLitros(kilometros*0.113);
	}
	public void estado(Estado estado) {
		this.estado = estado;
	}
	public void alterarTemperatura(double cantidad) {
		motor.alterarTemperatura(cantidad);
	}
	public void velocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public void controlarTemperatura() {
		if (this.estaCaliente()) {
			ElectroVentilador.get().enfriar(motor);;
		}
	}
}
