package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 47, 510, 144);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblDialogosHabituales.setBounds(10, 0, 160, 30);
		panel.add(lblDialogosHabituales);
		
		JButton btnNewButton = new JButton("Tengo Hambre");
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 32, 240, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tengo Sed");
		btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_1.setBounds(10, 68, 240, 30);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tengo Sueño");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 104, 240, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Quiero Lavarme los Dientes");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_3.setBounds(260, 32, 240, 30);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Quiero ir al Baño");
		btnNewButton_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(260, 68, 240, 30);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Quiero Bañarme");
		btnNewButton_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(260, 104, 240, 30);
		panel.add(btnNewButton_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 786, 47);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 47, 10, 516);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(776, 47, 10, 516);
		contentPane.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 553, 766, 10);
		contentPane.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(398, 508, 378, 44);
		contentPane.add(panel_5);
		
		JButton btnEmergencias = new JButton("Emergencias");
		panel_5.add(btnEmergencias);
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 325, 766, 172);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setBounds(10, 0, 153, 19);
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel_7.add(lblOcio);
		
		JButton btnNewButton_8 = new JButton("Quisiera Dar un Paseo");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_8.setBounds(10, 22, 240, 30);
		panel_7.add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("Quisiera Ver en la Tele...");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(10, 58, 240, 30);
		panel_7.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Quisiera Ver en la Computadora...");
		btnNewButton_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_2_2.setBounds(10, 94, 240, 30);
		panel_7.add(btnNewButton_2_2);
		
		JButton btnNewButton_9 = new JButton("Quisiera Ver en la Tablet...");
		btnNewButton_9.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_9.setBounds(10, 130, 240, 30);
		panel_7.add(btnNewButton_9);
		
		JButton btnNewButton_8_1 = new JButton("Quisiera Escuchar Radio");
		btnNewButton_8_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_8_1.setBounds(260, 22, 240, 30);
		panel_7.add(btnNewButton_8_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Quisiera Escuchar Música");
		btnNewButton_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_1_2_1.setBounds(260, 58, 240, 30);
		panel_7.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_2_1 = new JButton("Quisiera Escuchar un Audiolibro");
		btnNewButton_2_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_2_2_1.setBounds(260, 94, 240, 30);
		panel_7.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_9_1 = new JButton("Quisiera que Me Lean un Libro");
		btnNewButton_9_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_9_1.setBounds(260, 130, 240, 30);
		panel_7.add(btnNewButton_9_1);
		
		JButton btnNewButton_8_2 = new JButton("Quisiera Cambiarme de Ropa");
		btnNewButton_8_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_8_2.setBounds(510, 22, 240, 30);
		panel_7.add(btnNewButton_8_2);
		
		JButton btnNewButton_1_2_2 = new JButton("Tengo Sed");
		btnNewButton_1_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_1_2_2.setBounds(510, 58, 240, 30);
		panel_7.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_2_2_2 = new JButton("Tengo Sueño");
		btnNewButton_2_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_2_2_2.setBounds(510, 94, 240, 30);
		panel_7.add(btnNewButton_2_2_2);
		
		JButton btnNewButton_9_2 = new JButton("New button");
		btnNewButton_9_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_9_2.setBounds(510, 130, 240, 30);
		panel_7.add(btnNewButton_9_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(387, 508, 10, 44);
		contentPane.add(panel_8);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBounds(10, 192, 766, 10);
		contentPane.add(panel_6_1);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBounds(10, 314, 766, 10);
		contentPane.add(panel_6_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 508, 378, 44);
		contentPane.add(panel_4);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		panel_4.add(btnConfiguracion);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 498, 766, 10);
		contentPane.add(panel_6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 202, 510, 112);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setBounds(10, 0, 153, 19);
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel_9.add(lblRespuestas);
		
		JButton btnNewButton_4 = new JButton("Si");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_4.setBounds(13, 30, 89, 70);
		panel_9.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("No");
		btnNewButton_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_5.setBounds(112, 30, 89, 70);
		panel_9.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("No Se");
		btnNewButton_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_6.setBounds(211, 30, 89, 70);
		panel_9.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Tal Vez");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_7.setBounds(310, 30, 89, 70);
		panel_9.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Gracias!");
		btnNewButton_7_1.setBounds(409, 30, 89, 70);
		panel_9.add(btnNewButton_7_1);
		btnNewButton_7_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracion con = new Configuracion();
				con.setVisible(true);
				dispose();
			}
		});
		btnEmergencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Emergencias em = new Emergencias();
				em.setVisible(true);
				dispose();
			}
		});
	}
}
