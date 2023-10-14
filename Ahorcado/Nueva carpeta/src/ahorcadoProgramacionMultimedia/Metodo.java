package ahorcadoProgramacionMultimedia;

import javax.swing.JLabel;

public class Metodo {
	public static void dibujoAhorcado(int contadorNumero, JLabel ahorcado) {
		switch (contadorNumero) {
		case 6:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		case 5:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		case 4:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		case 3:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/|<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		case 2:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/|\\<br>"
					+ "|<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		case 1:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/|\\<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      /");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		case 0:
			ahorcado.setText("<html><body>&nbsp;____ <br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/|\\<br>"
					+ "|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;<\\<br>"
					+ "|<br>"
					+ "|____"
					+ "</body></html>");
			/*System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      / \\");
			System.out.println("|");
			System.out.println("|____");*/
			break;
		}
	}
	
	public static boolean hayGuion(char array[]) {
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]=='-')return true;
			
		}
		
		return false;
	}

}
