package ar.unrn.main;

import ar.unrn.MotorComun;
import ar.unrn.MotorEconomico;
import ar.unrn.MotorElectricoAdapter;
import ar.unrn.Motores;

public class Main {

	public static void main(String[] args) {
		Motores motorComun = new MotorComun();
		motorComun.encender();
		motorComun.acelerar();
		motorComun.apagar();
		
		Motores motorEconomico = new MotorEconomico();
		motorEconomico.encender();
		motorEconomico.acelerar();
		motorEconomico.apagar();
		
		Motores motorElectrico = new MotorElectricoAdapter();
		motorElectrico.encender();
		motorElectrico.acelerar();
		motorElectrico.apagar();
		
	}

}
