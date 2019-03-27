package granViaje.Tests;

import granViaje.*;
import granViaje.Componentes.*;
import granViaje.Estados.*;
import granViaje.Excepciones.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Funcionalidad {


	@BeforeEach
	void setUp() throws Exception {
		}

	@Test
	void elAutoApagadoNoAcelera() {
		Auto auto = new Auto(Apagado.get(),new Combustible(1000,1000),new Motor(0));
		assertThrows(AutoApagadoExcepcion.class,()->{auto.acelerar(2);});
	}

}
