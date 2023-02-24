package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Comandos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comandos frame = new Comandos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Comandos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblComandos = new JLabel("COMANDOS");
		lblComandos.setHorizontalAlignment(SwingConstants.CENTER);
		lblComandos.setBounds(133, 31, 170, 30);
		panel.add(lblComandos);
		
		JButton btnHigiene = new JButton("Higiene");
		btnHigiene.setBounds(133, 72, 170, 30);
		panel.add(btnHigiene);
		
		JButton btnAlimentacion = new JButton("Alimentación");
		btnAlimentacion.setBounds(133, 113, 170, 30);
		panel.add(btnAlimentacion);
		
		JButton btnAcciones = new JButton("Acciones");
		btnAcciones.setBounds(133, 153, 170, 30);
		panel.add(btnAcciones);
		
		JButton btnRespuestas = new JButton("Respuestas");
		btnRespuestas.setBounds(133, 194, 170, 30);
		panel.add(btnRespuestas);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(337, 229, 89, 23);
		panel.add(btnVolver);
	}

}
