package Empleados;

public class Junior extends Empleado{
	//atributo
		private double reduccionEmployee = 0.15; //reduccion del 15%
		
		// constructor
		public Junior(String nombre, double sueldoMensual) throws SalarioIncorrecto {
			super(nombre, sueldoMensual);
			
		}

		@Override
		public String toString() {
			return "Junior [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
					+ sueldoMensualNeto + ", sueldoAnualBruto=" + sueldoAnualBruto + ", sueldoaAnaulNeto="
					+ sueldoaAnaulNeto + "]";
		}

		//gest y sets
		public double getReduccionEmployee() {
			return reduccionEmployee;
		}

		public void setReduccionEmployee(double reduccionEmployee) {
			this.reduccionEmployee = reduccionEmployee;
		}
		public boolean sueldoMinimo(double salario) throws SalarioIncorrecto {
			if (salario>=900&&salario<=1600) {
				return true;
			}else {
				throw new SalarioIncorrecto(salario);
			}
		}
		public double comprobarirpf() {
			return 0.2;
		}
		public void bonusSueldo() {
			this.sueldoaAnaulNeto=this.sueldoaAnaulNeto+(this.sueldoaAnaulNeto*0.10);
			
		}
}
