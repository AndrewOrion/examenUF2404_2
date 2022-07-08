package modelo;

public class CuentaJoven extends Cuenta{
	private double bonificacion;
	private boolean estudiante;
	protected static final double bonoJoven=0.07;
	
	
	
	public CuentaJoven(Persona titular, double saldo, double bonificacion, boolean estudiante) {
		super(titular, saldo);
		if (titular.getEdad()<26) {
			this.bonificacion=bonificacion;
			this.estudiante= estudiante;
		} else {
			this.bonificacion=0;
			this.estudiante=false;
		}
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	public boolean isEstudiante() {
		return estudiante;
	}

	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "CuentaJoven [bonificacion=" + bonificacion + ", estudiante=" + isEstudiante() + "\ngetTitular()="
				+ getTitular() + "\ngetSaldo()=" + getSaldo() +"]";
	}

	@Override
	public double calculaIntereses() {
		if (isEstudiante()) {
			double interes=getBonificacion()+bonoJoven;
			return interes*super.calculaIntereses();
		}else {
			return getBonificacion()*super.calculaIntereses();
		}
	}
		
	@Override
	public boolean transferir(Cuenta cDestino, double cantidad) {
		if (super.transferir(cDestino, cantidad)) {
			this.ingresar(Cuenta.comision);
			return true;
		}else {
			return false;
		}
	}

	

	
	
	
	
	
	
}
