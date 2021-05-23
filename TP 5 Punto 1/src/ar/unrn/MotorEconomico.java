package ar.unrn;

public class MotorEconomico extends Motores {
	private boolean isEncendido;

	public MotorEconomico() {
		super();
		this.isEncendido = false;
	}

	@Override
	public void encender() {
		System.out.println("\n --------------------------------------------------------------- \n "
				+ "Se enciende un Motor Economico....");
		this.isEncendido = true;
	}

	@Override
	public void acelerar() {
		if (this.estaEncendido())
			System.out.println("Se esta acelerando con un Motor Economico....");
		else
			System.out.println("No esta encendido");
	}

	@Override
	public void apagar() {
		if (this.estaEncendido())
			System.out.println("Se esta apagando un Motor Economico....");
		else
			System.out.println("No esta encendido");

	}

	private boolean estaEncendido() {
		return this.isEncendido;
	}

}
