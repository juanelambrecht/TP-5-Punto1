package ar.unrn;

public class MotorElectricoAdapter extends Motores {
	private MotorElectrico motorElectrico;

	public MotorElectricoAdapter() {
		this.motorElectrico = new MotorElectrico();
		
		System.out.println("\n --------------------------------------------------------------- \n "
				+ "Se esta creando un Motor Electrico en clase Adapter....");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo Motor Electrico en clase Adapter....");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando Motor electrico adapter...");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("Apagando Motor electrico adapter...");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}
}
