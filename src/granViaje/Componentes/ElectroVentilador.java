package granViaje.Componentes;

public class ElectroVentilador {
	private static final ElectroVentilador ventilador = new ElectroVentilador();
	private ElectroVentilador() {}
	public static ElectroVentilador get() {
		return ventilador;
	}
	public void enfriar(Motor motor) {
		motor.alterarTemperatura(-15);
	}
}
