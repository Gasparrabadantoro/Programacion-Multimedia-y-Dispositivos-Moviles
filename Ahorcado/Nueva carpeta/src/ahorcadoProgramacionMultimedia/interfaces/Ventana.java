package ahorcadoProgramacionMultimedia.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private PantallaInicial pantallaInicial;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Juego del Ahorcado");
		pantallaInicial = new PantallaInicial(this);
		pantallaInicial.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(pantallaInicial);
		this.setVisible(true);
	}

}
