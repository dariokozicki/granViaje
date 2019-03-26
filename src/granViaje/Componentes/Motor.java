package granViaje.Componentes;

public class Motor {
	double temperatura;
	public Motor(double temp) {
		temperatura = temp;
	}
	public boolean estaCaliente() {
		return temperatura>=95;
	}
	public void alterarTemperatura(double cantidad) {
		temperatura+=cantidad;
	}
	public void enfriarseCompletamente() {
		temperatura = 0;
	}
	public double temperatura() {
		return temperatura;
	}
}
