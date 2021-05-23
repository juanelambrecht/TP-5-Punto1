package ar.unrn;

public class MotorComun extends Motores {
	
	private boolean isEncendido;

	public MotorComun() {
		super();
		System.out.println("\n --------------------------------------------------------------- \n Se esta trabajando con un Motor Comun....");
		this.isEncendido = false;
	}

	@Override
	public void encender() {
		System.out.println("Se enciende un Motor Comun....");
		this.isEncendido = true;
	}

	@Override
	public void acelerar() {
		if (this.estaEncendido())
			System.out.println("Se esta acelerando con un Motor Comun....");
		else
			System.out.println("No esta encendido");

	}

	@Override
	public void apagar() {
		if (this.estaEncendido())
			System.out.println("Se esta apagando un Motor Comun....");
		else
			System.out.println("No esta encendido");
	}

	private boolean estaEncendido() {
		return this.isEncendido;
	}

}
