import java.util.Scanner;

import Empleados.Boss;
import Empleados.Junior;
import Empleados.Manager;
import Empleados.Mid;
import Empleados.SalarioIncorrecto;
import Empleados.Senior;
import Empleados.Volunteer;

public class M2App {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws SalarioIncorrecto {
		// Atributos
		String nombre, nivelTrabajo;
		double sueldoMensual;

		System.out.println("Nombre?");
		nombre = teclado.nextLine();
		System.out.println("Nivel laboral?");
		nivelTrabajo = teclado.nextLine().toLowerCase();
		System.out.println("Cuanto cobras mensualmente?");
		sueldoMensual = Double.parseDouble(teclado.nextLine());

		switch (nivelTrabajo) {
		case ("manager"):
			Manager manager = new Manager(nombre, sueldoMensual);
			manager.salarioPlus(sueldoMensual);
			System.out.println(manager);
			break;
		case ("boss"):
			Boss boss = new Boss(nombre, sueldoMensual);
			System.out.println(boss);
			break;
		case ("senior"):
			Senior senior = new Senior(nombre, sueldoMensual);
			System.out.println(senior);
			break;
		case ("mid"):
			Mid mid = new Mid(nombre, sueldoMensual);
			System.out.println(mid);
			break;
		case ("junior"):
			Junior junior = new Junior(nombre, sueldoMensual);
			System.out.println(junior);
			break;
		case ("volunteer"):
			System.out.println("Esta becao? ");
			boolean respuesta=teclado.nextBoolean();
			Volunteer volunteer = new Volunteer(nombre, sueldoMensual, respuesta);
			System.out.println(volunteer);
			break;
		default:
			System.out.println("No existe ese nivel laboral!!");
			break;
		}

	}

}
