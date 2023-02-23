package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 416, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracion con = new Configuracion();
				con.setVisible(true);
				dispose();
			}
		});
		btnConfiguracion.setBounds(135, 50, 140, 30);
		panel.add(btnConfiguracion);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emergencias em = new Emergencias();
				em.setVisible(true);
				dispose();
			}
		});
		btnEmergencias.setBounds(135, 90, 140, 30);
		panel.add(btnEmergencias);
		
		JButton btnComandos = new JButton("Comandos");
		btnComandos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comandos com = new Comandos();
				com.setVisible(true);
				dispose();
			}
		});
		btnComandos.setBounds(135, 10, 140, 30);
		panel.add(btnComandos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 436, 49);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 48, 10, 203);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(426, 48, 10, 203);
		contentPane.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 241, 416, 10);
		contentPane.add(panel_3);
	}
}
