package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion frame = new Configuracion();
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
	public Configuracion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Configuración");
		lblTitulo.setBounds(172, 11, 111, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblTamanio = new JLabel("Tamaño");
		lblTamanio.setBounds(41, 54, 58, 14);
		contentPane.add(lblTamanio);
		
		JButton btnTamanio1 = new JButton("New button");
		btnTamanio1.setBounds(139, 50, 89, 23);
		contentPane.add(btnTamanio1);
		
		JButton btnTamanio2 = new JButton("New button");
		btnTamanio2.setBounds(238, 50, 89, 23);
		contentPane.add(btnTamanio2);
		
		JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setBounds(41, 104, 58, 14);
		contentPane.add(lblIdioma);
		
		JButton btnEspaniol = new JButton("Español");
		btnEspaniol.setBounds(139, 100, 89, 23);
		contentPane.add(btnEspaniol);
		
		JButton btnIngles = new JButton("Inglés");
		btnIngles.setBounds(238, 100, 89, 23);
		contentPane.add(btnIngles);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(335, 201, 89, 23);
		contentPane.add(btnVolver);
	}
}
