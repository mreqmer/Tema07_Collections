package Tema07_Collections.ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio01 {

    public static void main(String[] args) {
        //Números que tendrá de máximo la lista
        final int LIMITE = 10;
        //Creación de la lista de int
        ArrayList<Integer> numeros = new ArrayList<>();

        //Añade números a la lista del 1-10
        for(int i = 1; i<=LIMITE ; i++){
            numeros.add(i);
        }
        //Recorre la lista para mostrarla
        for(int valor : numeros){
            System.out.print(valor + " ");
        }
        //Salto de línea
        System.out.println();
        //Método para desordenar los elementos de una lista
        Collections.shuffle(numeros);
        //Vuelve a mostrar la lista
        for(int valor : numeros){
            System.out.print(valor + " ");
        }
    }
}
