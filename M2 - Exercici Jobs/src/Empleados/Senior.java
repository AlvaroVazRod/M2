package Empleados;

public class Senior extends Empleado {
	// atributo
	private double reduccionEmployee = 0.05; // reduccion del 15%

	// constructor
	public Senior(String nombre, double sueldoMensual) throws SalarioIncorrecto {
		super(nombre, sueldoMensual);

	}

	@Override
	public String toString() {
		return "Senior [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
				+ sueldoMensualNeto + ", sueldoAnualBruto=" + sueldoAnualBruto + ", sueldoaAnaulNeto="
				+ sueldoaAnaulNeto + "]";
	}

	// gest y sets
	public double getReduccionEmployee() {
		return reduccionEmployee;
	}

	public void setReduccionEmployee(double reduccionEmployee) {
		this.reduccionEmployee = reduccionEmployee;
	}

	public boolean sueldoMinimo(double salario) throws SalarioIncorrecto {
		if (salario >= 2700 && salario <= 4000) {
			return true;
		} else {
			throw new SalarioIncorrecto(salario);
		}
	}

	public double comprobarirpf() {
		return 0.24;
	}

	public void bonusSueldo() {
		this.sueldoaAnaulNeto = this.sueldoaAnaulNeto + (this.sueldoaAnaulNeto * 0.10);

	}

}
