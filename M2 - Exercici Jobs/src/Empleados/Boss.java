package Empleados;

public class Boss extends Empleado{
	//atributo
	private double plusBoss = 0.5;//50% mas a su salario mensual
	
	
	// Constructor
	public Boss(String nombre, double sueldoMensual) throws SalarioIncorrecto {
		super(nombre, sueldoMensual);
		
	}
	public void salarioPlus(double plusBoss) {
		double salarioPlus = plusBoss + super.getSueldoMensual();
		
		System.out.println("Salario con el plus del 50%: " + salarioPlus);
	}
	
	@Override
	public String toString() {
		return "Boss [" + super.toString() + " plusBoss=" + plusBoss + "]";
	}


	//gets y sets
	public double getPlusBoss() {
		return plusBoss;
	}


	public void setPlusBoss(double plusBoss) {
		this.plusBoss = plusBoss;
	}
	public boolean sueldoMinimo(double salario) throws SalarioIncorrecto {
		if (salario>=8000) {
			return true;
		}else {
			throw new SalarioIncorrecto(salario);
		}
	}
	public double comprobarirpf(double irpf) {
		return 0.26;
	}
	@Override
	public double comprobarirpf() {
		return 0.32;
	}
	@Override
	public void bonusSueldo() {
		this.sueldoaAnaulNeto=this.sueldoaAnaulNeto+(this.sueldoaAnaulNeto*0.10);
		
	}

	
}
