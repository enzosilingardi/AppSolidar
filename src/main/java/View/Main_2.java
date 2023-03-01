package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_2 frame = new Main_2();
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
	public Main_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 994, 74);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(994, 0, 350, 130);
		contentPane.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 74, 994, 210);
		contentPane.add(panel3);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 18));
		lblDialogosHabituales.setBounds(30, 0, 230, 30);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnHambre.setBounds(30, 30, 458, 50);
		panel3.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo sed");
		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnSed.setBounds(30, 90, 458, 50);
		panel3.add(btnSed);
		
		JButton btnSuenio = new JButton("Tengo sueño");
		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnSuenio.setBounds(30, 150, 458, 50);
		panel3.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero lavarme los dientes");
		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnDientes.setBounds(508, 30, 458, 50);
		panel3.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al baño");
		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnBanio.setBounds(508, 90, 458, 50);
		panel3.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero bañarme");
		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnBaniar.setBounds(508, 150, 458, 50);
		panel3.add(btnBaniar);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(994, 130, 350, 60);
		contentPane.add(panel4);
		
		JButton btnNewButton = new JButton("Teclado en pantalla");
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 5, 330, 50);
		panel4.add(btnNewButton);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(0, 284, 994, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(994, 190, 350, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBounds(0, 294, 994, 120);
		contentPane.add(panel7);
		
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 18));
		lblRespuestas.setBounds(30, 0, 153, 30);
		panel7.add(lblRespuestas);
		
		JButton btnSi = new JButton("Sí");
		btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnSi.setBounds(92, 30, 130, 85);
		panel7.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnNo.setBounds(262, 30, 130, 85);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No sé");
		btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnNoSe.setBounds(432, 30, 130, 85);
		panel7.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal vez");
		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnTalVez.setBounds(602, 30, 130, 85);
		panel7.add(btnTalVez);
		
		JButton btnGracias = new JButton("Gracias!");
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnGracias.setBounds(772, 30, 130, 85);
		panel7.add(btnGracias);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBounds(994, 200, 350, 214);
		contentPane.add(panel8);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 18));
		lblTemperatura.setBounds(10, 0, 150, 30);
		panel8.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo frio");
		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnTengoFrio.setBounds(10, 30, 160, 80);
		panel8.add(btnTengoFrio);
		
		JButton btnTengoCalor = new JButton("Tengo calor");
		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnTengoCalor.setBounds(175, 30, 160, 80);
		panel8.add(btnTengoCalor);
		
		JButton btnEstaFrio = new JButton("Está frio");
		btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnEstaFrio.setBounds(10, 120, 160, 80);
		panel8.add(btnEstaFrio);
		
		JButton btnEstaCaliente = new JButton("Está caliente");
		btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnEstaCaliente.setBounds(175, 120, 160, 80);
		panel8.add(btnEstaCaliente);
		
		JPanel panel9 = new JPanel();
		panel9.setBounds(0, 413, 1344, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBounds(0, 423, 1344, 220);
		contentPane.add(panel10);
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 18));
		lblOcio.setBounds(30, 0, 150, 30);
		panel10.add(lblOcio);
		
		JButton btnPaseo = new JButton("Quisiera dar un paseo");
		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnPaseo.setBounds(31, 30, 414, 40);
		panel10.add(btnPaseo);
		
		JButton btnTele = new JButton("Quisiera ver algo en la tele");
		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnTele.setBounds(31, 75, 414, 40);
		panel10.add(btnTele);
		
		JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");
		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnComputadora.setBounds(31, 120, 414, 40);
		panel10.add(btnComputadora);
		
		JButton btnTablet = new JButton("Quisiera ver algo en la tablet");
		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnTablet.setBounds(31, 165, 414, 40);
		panel10.add(btnTablet);
		
		JButton btnRadio = new JButton("Quisiera escuchar radio");
		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnRadio.setBounds(465, 30, 414, 40);
		panel10.add(btnRadio);
		
		JButton btnMusica = new JButton("Quisiera escuchar música");
		btnMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnMusica.setBounds(465, 75, 414, 40);
		panel10.add(btnMusica);
		
		JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");
		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnAudiolibro.setBounds(465, 120, 414, 40);
		panel10.add(btnAudiolibro);
		
		JButton btnLibro = new JButton("Quisiera que me lean un libro");
		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnLibro.setBounds(465, 165, 414, 40);
		panel10.add(btnLibro);
		
		JButton btnRopa = new JButton("Quisiera cambiarme de ropa");
		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnRopa.setBounds(899, 30, 414, 40);
		panel10.add(btnRopa);
		
		JButton btnCine = new JButton("Quisiera ir al cine");
		btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnCine.setBounds(899, 75, 414, 40);
		panel10.add(btnCine);
		
		JButton btnSalirAComer = new JButton("Quisiera salir a comer");
		btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnSalirAComer.setBounds(899, 120, 414, 40);
		panel10.add(btnSalirAComer);
		
		JButton btnJugar = new JButton("Quisiera jugar a algo");
		btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnJugar.setBounds(899, 165, 414, 40);
		panel10.add(btnJugar);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(0, 719, 1344, 10);
		contentPane.add(panel11);
		
		JPanel panel12 = new JPanel();
		panel12.setLayout(null);
		panel12.setBounds(0, 653, 667, 66);
		contentPane.add(panel12);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnConfiguracion.setBounds(126, 13, 415, 40);
		panel12.add(btnConfiguracion);
		
		JPanel panel13 = new JPanel();
		panel13.setBounds(667, 653, 10, 66);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setLayout(null);
		panel14.setBounds(677, 653, 667, 66);
		contentPane.add(panel14);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		btnEmergencias.setBounds(126, 13, 415, 40);
		panel14.add(btnEmergencias);
		
		JPanel panel15 = new JPanel();
		panel15.setBounds(0, 643, 1344, 10);
		contentPane.add(panel15);
	}
}
