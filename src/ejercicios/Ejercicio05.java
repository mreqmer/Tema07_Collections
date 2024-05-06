package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio05 {

	static Scanner sc = new Scanner(System.in);

	static Map<String, Double> series = new HashMap<>();

	public static void main(String[] args) {

		String nombre;

		double puntuacion;

		int opc = -1;

		menu();
		opc = sc.nextInt();
		sc.nextLine();

		do {
			switch (opc) {
			case 1 -> {
				
				System.out.println("Nombre de la serie: ");
				nombre = sc.nextLine();
				
				if(series.containsKey(nombre)) {
				System.out.println();
				
				System.out.println(nombre + " : " + series.get(nombre));
				}else {
					System.out.println("Esa serie no existe.");
				}
				
				System.out.println();
				
			}
			case 2 -> {
				
				System.out.println("Nombre de la serie: ");

				nombre = sc.nextLine();
				
				if (!series.containsKey(nombre)) {
					System.out.println("Puntuación: ");
					puntuacion = sc.nextInt();
					sc.nextLine();
					series.put(nombre, puntuacion);
				} else {
					System.out.println("Esta serie ya existe.");
				}

				System.out.println();

			}
			case 3 -> {
				
				System.out.println("Nombre de la serie: ");

				nombre = sc.nextLine();
				
				if(series.containsKey(nombre)) {
					series.remove(nombre);
					System.out.println("Eliminada correctamente");
				}else {
					System.out.println("Esa serie no existe.");
				}
			}
			default -> {
				System.out.println("Introduce un número válido");
			}
			}
			
			System.out.println();

			menu();
			opc = sc.nextInt();
			sc.nextLine();
		} while (opc != 0);

	}

	public static void menu() {
		System.out.println("1.Buscar serie");
		System.out.println("2.Agregar serie");
		System.out.println("3.Eliminar serie");
		System.out.println("0.Salir serie");
		System.out.println("Elija una opción:");
	}

}
