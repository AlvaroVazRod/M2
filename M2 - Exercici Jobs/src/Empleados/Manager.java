package Empleados;

public class Manager extends Empleado {
	//atributo
	private double plusManager = 0.1; //10% mas a su salario mensual
	
	//Constructor
	public Manager(String nombre, double sueldoMensual) throws SalarioIncorrecto {
		super(nombre, sueldoMensual);

	}
	
	public void salarioPlus(double plusManager) {
		double salarioPlus = plusManager + super.getSueldoMensual();
		
		System.out.println("Salario con el plus del 10%: " + salarioPlus);
	}

	@Override
	public String toString() {
		return "Manager [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
				+ sueldoMensualNeto + ", sueldoAnualBruto=" + sueldoAnualBruto + ", sueldoaAnaulNeto="
				+ sueldoaAnaulNeto + "]";
	}

	//gets y sets
	public double getPlusManager() {
		return plusManager;
	}

	public void setPlusManager(double plusManager) {
		this.plusManager = plusManager;
	}
	public boolean sueldoMinimo(double salario) throws SalarioIncorrecto {
		if (salario>=3000&&salario<=5000) {
			return true;
		}else {
			throw new SalarioIncorrecto(salario);
		}
	}

	public double comprobarirpf() {
		return 0.26;
	}

	@Override
	public void bonusSueldo() {
		this.sueldoaAnaulNeto=this.sueldoaAnaulNeto+(this.sueldoaAnaulNeto*0.10);
		
	}

	
	
}
