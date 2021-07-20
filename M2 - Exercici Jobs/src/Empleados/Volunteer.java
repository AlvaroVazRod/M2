package Empleados;

public class Volunteer extends Empleado {
	private double ajut;
	public Volunteer(String nombre, double sueldoMensual, boolean ajut) throws SalarioIncorrecto {
		super(nombre, sueldoMensual);
		if (ajut) {
			this.ajut =300;
		}
	}

	public boolean sueldoMinimo(double salario) throws SalarioIncorrecto {
		if (salario <= 0) {
			return true;
		} else {
			throw new SalarioIncorrecto(salario);
		}
	}

	public double comprobarirpf() {
		return 0;
	}

	public void bonusSueldo() {
		System.out.println("ERE UN PRINGAO");
	}

	@Override
	public String toString() {
		return "Volunteer [ajut=" + ajut + ", nombre=" + nombre + ", sueldoMensual=" + sueldoMensual
				+ ", sueldoMensualNeto=" + sueldoMensualNeto + ", sueldoAnualBruto=" + sueldoAnualBruto
				+ ", sueldoaAnaulNeto=" + sueldoaAnaulNeto + "]";
	}

}
