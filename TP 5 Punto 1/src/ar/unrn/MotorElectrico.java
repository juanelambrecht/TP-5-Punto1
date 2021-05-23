package ar.unrn;

public class MotorElectrico {
	private boolean isConectado;
	private boolean isActivado;

	public MotorElectrico() {
		System.out.println("\n --------------------------------------------------------------- \n "
				+ "Se esta creando motor electrico...");
		this.isActivado = false;
		this.isConectado = false;
	}

	public void conectar() {
		if (!estaConectadoElMotor()) {
			System.out.println("Se esta conectando motor electrico....");
			this.isConectado = true;
		} else {
			System.out.println("El motor electrico ya se encuentra conectado....");
		}
	}

	public void activar() {
		if (estaConectadoElMotor()) {
			System.out.println("Activando motor electrico....");
			this.isActivado = true;
		} else {
			System.out.println("El motor electrico no se encuentra conectado....");
		}
	}

	public void moverMasRapido() {
		if (estaActivadoElMotor()) {
			System.out.println("Moviendo mas rapido...aumentando voltaje");
		} else {
			System.out.println("El motor electrico no se encuentra conectado....");
		}
	}

	public void detener() {
		if (estaActivadoElMotor()) {
			System.out.println("Deteniendo motor electrico");
		} else
			System.out.println("El motor electrico no se encuentra activado....");

	}

	public void desconectar() {
		if (estaActivadoElMotor()) {
			System.out.println("Desconectando motor electrico...");
		} else {
			System.out.println("El motor electrico no se encuentra activado....");
		}
	}

	private boolean estaActivadoElMotor() {
		return this.isActivado;
	}

	private boolean estaConectadoElMotor() {
		return this.isConectado;
	}
}
