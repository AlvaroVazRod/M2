package Empleados;

public abstract class Empleado {
	// Atributos
	protected String nombre;
	protected double sueldoMensual;
	protected double sueldoMensualNeto;
	protected double sueldoAnualBruto;
	protected double sueldoaAnaulNeto;

	// Constructor
	public Empleado(String nombre, double sueldoMensual) throws SalarioIncorrecto {
		if (sueldoMinimo(sueldoMensual) == true) {
			this.nombre = nombre;
			this.sueldoMensual = sueldoMensual;
			this.sueldoMensualNeto = sueldoMensual-(sueldoMensual * comprobarirpf());
			this.sueldoAnualBruto = sueldoMensual * 12;
			this.sueldoaAnaulNeto = this.sueldoMensualNeto * 12;
		} else {
			throw new SalarioIncorrecto(sueldoMensual);
		}

	}

	// toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + "]";
	}

	// gets y sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public abstract boolean sueldoMinimo(double sueldo) throws SalarioIncorrecto;

	public abstract double comprobarirpf();

	public abstract void bonusSueldo();
}
