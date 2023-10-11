package ahorcadoProgramacionMultimedia;

public class Metodo {
	public static void dibujoAhorcado(int contadorNumero) {
		switch (contadorNumero) {
		case 6:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 5:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 4:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 3:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 2:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 1:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      /");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 0:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      / \\");
			System.out.println("|");
			System.out.println("|____");
			break;
		}
	}

}
