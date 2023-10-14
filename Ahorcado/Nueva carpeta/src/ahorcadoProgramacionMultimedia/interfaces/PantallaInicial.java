package ahorcadoProgramacionMultimedia.interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import ahorcadoProgramacionMultimedia.Metodo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PantallaInicial extends JPanel {

	private Ventana ventana;
	private JTextField campoLetraIntroducida;
	private boolean letraAcertada;
	private char letraElegida;
	private int intentos;
	private boolean acaboJuego;
	private boolean ganaste;
	private boolean perdiste;
	private boolean hasGanado;
	private String palabraElegida;

	/**
	 * Create the panel.
	 */
	public PantallaInicial(Ventana v) {
		this.ventana = v;
		setLayout(null);

		Random r = new Random();

		/*
		 * Declaramos contador, para luego usar un condicional y poder terminar el juego
		 */
		intentos = 6;
		acaboJuego = false;
		ganaste = false;
		perdiste = false;
		letraAcertada = false;
		hasGanado = false;

		/* Declaramos la letra elegida (de la "a" a la "z") */
		letraElegida = '-';

		/*
		 * Hacemos un array de palabras,de las cuales luego haremos un Random, los
		 * cuales sortearemos todo ese array de palabras.
		 * 
		 * Luego igualamos ese random a la palabra
		 */
		String palabras[] = { "casa", "jamones", "pedrolo", "alma", "pirindolo", "estupida", "si" };
		palabraElegida = "";
		int palabraSiguiente = r.nextInt(palabras.length);

		palabraElegida = palabras[palabraSiguiente];

		int longitudPalabra = palabraElegida.length();

		char[] palabraGuion = new char[longitudPalabra];

		for (int i = 0; i < palabraGuion.length; i++) {

			palabraGuion[i] = '-';

		}

		JLabel lblTextoAhorcado = new JLabel("¡Bienvenido al juego del Ahorcado! Introduce una letra:");
		lblTextoAhorcado.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoAhorcado.setBounds(0, 30, 546, 13);
		add(lblTextoAhorcado);

		campoLetraIntroducida = new JTextField();
		campoLetraIntroducida.setBounds(85, 118, 388, 38);
		add(campoLetraIntroducida);
		campoLetraIntroducida.setColumns(10);

		JLabel lblAciertoError = new JLabel("");
		lblAciertoError.setHorizontalAlignment(SwingConstants.CENTER);
		lblAciertoError.setBounds(45, 211, 469, 13);
		add(lblAciertoError);

		JLabel lblAhorcado = new JLabel("");
		lblAhorcado.setBounds(191, 234, 146, 203);
		add(lblAhorcado);

		JLabel lblPalabraElegida = new JLabel("");
		lblPalabraElegida.setText(String.valueOf(palabraGuion));
		lblPalabraElegida.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabraElegida.setBounds(217, 75, 120, 13);
		add(lblPalabraElegida);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				letraElegida = campoLetraIntroducida.getText().charAt(0);

				for (int i = 0; i < palabraElegida.length(); i++) {

					if (palabraElegida.charAt(i) == letraElegida) {
						letraAcertada = true;
						palabraGuion[i] = letraElegida;

					}

				}

				lblPalabraElegida.setText(String.valueOf(palabraGuion));
				if (letraAcertada) {

					lblAciertoError.setText("Tu palabra secreta contiene la letra " + letraElegida);
					campoLetraIntroducida.setText("");
					if (!Metodo.hayGuion(palabraGuion)) {

						acaboJuego = true;

					}

				} else {
					lblAciertoError.setText("No has acertado la letra secreta");
					campoLetraIntroducida.setText("");
					Metodo.dibujoAhorcado(intentos, lblAhorcado);
					intentos--;

					if (intentos < 0) {
						acaboJuego = true;
					}
				}

				letraAcertada = false;

				if (intentos < 0 && acaboJuego) {

					lblAciertoError.setText("Arturo Pérez Reverte te ha ahorcado porque no has adivinado la palabra");

				} else if (intentos > 0 && acaboJuego) {
					lblAciertoError.setText("! Has ganado ¡");
				}
			}
		});
		btnAceptar.setBounds(191, 180, 168, 21);
		add(btnAceptar);

	}
}
