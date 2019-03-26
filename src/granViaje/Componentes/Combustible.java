package granViaje.Componentes;

public class Combustible {
	double cantidad;
	double capacidad;
	public Combustible(double cantidad,double capacidad) {
		this.cantidad = cantidad;
		this.capacidad = capacidad;
	}
	public boolean enReserva() {
		return cantidad <= capacidad*0.10;
	}
	public boolean proximoAReserva() {
		return cantidad <= capacidad*0.15;
	}
	public void consumirPorcentaje(double porcentaje) {
		cantidad *= ((100-porcentaje)/100);
	}
	public void consumirLitros(double litros) {
		cantidad -= litros;
	}
}
