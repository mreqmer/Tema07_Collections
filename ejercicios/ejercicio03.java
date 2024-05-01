package Tema07_Collections.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class ejercicio03 {

    public static void main(String[] args) {
        
        //texto usado para contar cada caracter
        String texto = "En un agujero en el suelo, vivía un hobbit." 
                        + "No un agujero húmedo, sucio, repugnante, con restos" 
                        + " de gusanos y olor a fango, ni tampoco un agujero, seco,"
                        + " desnudo y arenoso, sin nada en que sentarse o que comer:"
                        + " era un agujero-hobbit, y eso significa comodidad";

        
        //declaración del HashMap
        HashMap<Character, Integer> frecuencia = new HashMap<>();

        //Recorre el texto como un Array de chars
        for(char letra : texto.toCharArray()){
            //Si la posición del array tiene un caracter (no espacios ni simbolos), entonces lo pasa a minuscula y añade al Map la letra como clave y el número de veces que aparece como valor
            if(Character.isLetter(letra)){
                letra = Character.toLowerCase(letra);
                //getOrDefault hace que cuando se ha encontrado por primera vez un elemento, este caso un nuevo caracter, se ponga un valor default, en este caso 0. El +1 nos añade 1 siempre que encuentra la letra, así cuando la encuentra pone el valor 0+1 y si la vuelve a encontrar 1+1 y así sucesivamente.
                frecuencia.put(letra, frecuencia.getOrDefault(letra, 0) + 1);
            }
        }

        //Recorre el mapa
        for(Map.Entry<Character, Integer> entry : frecuencia.entrySet()){
            //.getKey nos da el valor de la clave del mapa " : " el separador estético y .getValue nos da el valor del mapa
            System.out.println(entry.getKey() + " : " + entry.getValue());
        } 

    }

}
