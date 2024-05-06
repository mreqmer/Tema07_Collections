package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;



public class Ejercicio04 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombre = "";
		
		ArrayList<String> listado = new ArrayList<>();
		
		do {
		//pregunta por nombres hasta que la lista tenga tamaño 5
		System.out.println("Introduce un nombre: ");
		
		nombre = sc.nextLine();
		//comprueba que el listado no contenga ya ese nombre
		if(!listado.contains(nombre)) {
			listado.add(nombre);
		}
		}while(listado.size()<5);
		
		System.out.println(listado.toString());
		
	}

}
