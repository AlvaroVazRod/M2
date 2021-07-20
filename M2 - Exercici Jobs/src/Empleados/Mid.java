package Empleados;

public class Mid extends Empleado {
	//atributo
		private double reduccionEmployee = 0.10; //reduccion del 15%
		
		// constructor
		public Mid(String nombre, double sueldoMensual) throws SalarioIncorrecto {
			super(nombre, sueldoMensual);
			
		}

		@Override
		public String toString() {
			return "Mid [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + ", sueldoMensualNeto="
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
			if (salario>=1800&&salario<=2500) {
				return true;
			}else {
				throw new SalarioIncorrecto(salario);
			}
		}
		public double comprobarirpf() {
			return 0.15;
		}
		public void bonusSueldo() {
			this.sueldoaAnaulNeto=this.sueldoaAnaulNeto+(this.sueldoaAnaulNeto*0.10);
			
		}
}
