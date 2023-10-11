package ahorcadoProgramacionMultimedia;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class AhorcadoProgramacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		/*
		 * Declaramos contador, para luego usar un condicional y poder terminar el juego
		 */
		int intentos = 6;
		boolean acaboJuego = false;
		boolean ganaste = false;
		boolean perdiste = false;
		boolean letraAcertada = false;
		boolean hasGanado=false;
		

		/* Declaramos la letra elegida (de la " a " a la " z ") */
		char letraElegida = '-';

		/*
		 * Hacemos un array de palabras,de las cuales luego haremos un Random, los
		 * cuales sortearemos todo ese array de palabras.
		 * 
		 * Luego igualamos ese random a la palabra
		 */
		String palabras[] = { "casa", "jamones", "pedrolo", "alma", "pirindolo", "estupida", "si" };
		String palabraElegida = "";
		int palabraSiguiente = r.nextInt(palabras.length);

		palabraElegida = palabras[palabraSiguiente];

		System.out.println("DEBUG ESTA ES LA PALABRA " + palabraElegida);

		int longitudPalabra = palabraElegida.length();

		char[] palabraGuion = new char[longitudPalabra];

		for (int i = 0; i < palabraGuion.length; i++) {

			palabraGuion[i] = '-';

		}

		do {

			System.out.println("Dame una letra para este jueguito del ahorcado");

			System.out.println("**********************************************");

			letraElegida = sc.next().charAt(0);

			for (int i = 0; i < palabraElegida.length(); i++) {

				if (palabraElegida.charAt(i) == letraElegida) {
					letraAcertada = true;
					palabraGuion[i] = letraElegida;

				}

			}

			System.out.println(palabraGuion);
			if (letraAcertada) {

				System.out.println("Tu palabra secreta contiene la letra " + letraElegida);
				
				if(!Metodo.hayGuion(palabraGuion)) {
					
					acaboJuego=true;
					
				}

			} else {
				System.out.println("No has acertado la letra secreta");
				Metodo.dibujoAhorcado(intentos);
				intentos--;
				
				if(intentos<0) {
					acaboJuego=true;
				}
			}
			
			letraAcertada = false;
			
			

		} while (!acaboJuego);
		
	if(intentos<0) {
		
		System.out.println("*******************************");
		
		System.out.println("Arturo Pérez Reverte te ha ahorcado porque no has adivinado la palabra ");
		
	}

	}

}
