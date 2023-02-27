package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Main2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
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
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 960);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 832, 98);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(832, 0, 432, 138);
		contentPane.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(20, 98, 812, 224);
		contentPane.add(panel3);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblDialogosHabituales.setBounds(30, 0, 230, 30);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnHambre.setBounds(30, 30, 361, 50);
		panel3.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo sed");
		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSed.setBounds(30, 90, 361, 50);
		panel3.add(btnSed);
		
		JButton btnSuenio = new JButton("Tengo sueño");
		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSuenio.setBounds(30, 150, 361, 50);
		panel3.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero lavarme los dientes");
		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnDientes.setBounds(421, 30, 361, 50);
		panel3.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al baño");
		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnBanio.setBounds(421, 90, 361, 50);
		panel3.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero bañarme");
		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnBaniar.setBounds(421, 150, 361, 50);
		panel3.add(btnBaniar);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(832, 138, 412, 70);
		contentPane.add(panel4);
		
		JButton btnNewButton = new JButton("Teclado en pantalla");
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnNewButton.setBounds(86, 10, 240, 50);
		panel4.add(btnNewButton);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(20, 322, 812, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(832, 208, 412, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBounds(20, 332, 812, 154);
		contentPane.add(panel7);
		
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblRespuestas.setBounds(30, 0, 153, 30);
		panel7.add(lblRespuestas);
		
		JButton btnSi = new JButton("Sí");
		btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSi.setBounds(41, 30, 130, 94);
		panel7.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnNo.setBounds(191, 30, 130, 94);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No sé");
		btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnNoSe.setBounds(341, 30, 130, 94);
		panel7.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal vez");
		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTalVez.setBounds(491, 30, 130, 94);
		panel7.add(btnTalVez);
		
		JButton btnGracias = new JButton("Gracias!");
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnGracias.setBounds(641, 30, 130, 94);
		panel7.add(btnGracias);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBounds(832, 218, 412, 268);
		contentPane.add(panel8);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblTemperatura.setBounds(24, 0, 150, 30);
		panel8.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo frio");
		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTengoFrio.setBounds(24, 30, 170, 94);
		panel8.add(btnTengoFrio);
		
		JButton btnTengoCalor = new JButton("Tengo calor");
		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTengoCalor.setBounds(218, 30, 170, 94);
		panel8.add(btnTengoCalor);
		
		JButton btnEstaFrio = new JButton("Está frio");
		btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEstaFrio.setBounds(24, 144, 170, 94);
		panel8.add(btnEstaFrio);
		
		JButton btnEstaCaliente = new JButton("Está caliente");
		btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEstaCaliente.setBounds(218, 144, 170, 94);
		panel8.add(btnEstaCaliente);
		
		JPanel panel9 = new JPanel();
		panel9.setBounds(20, 486, 1224, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBounds(20, 496, 1224, 265);
		contentPane.add(panel10);
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblOcio.setBounds(30, 0, 150, 30);
		panel10.add(lblOcio);
		
		JButton btnPaseo = new JButton("Quisiera dar un paseo");
		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnPaseo.setBounds(30, 30, 370, 45);
		panel10.add(btnPaseo);
		
		JButton btnTele = new JButton("Quisiera ver algo en la tele");
		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTele.setBounds(30, 85, 370, 45);
		panel10.add(btnTele);
		
		JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");
		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnComputadora.setBounds(30, 140, 370, 45);
		panel10.add(btnComputadora);
		
		JButton btnTablet = new JButton("Quisiera ver algo en la tablet");
		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTablet.setBounds(30, 195, 370, 45);
		panel10.add(btnTablet);
		
		JButton btnRadio = new JButton("Quisiera escuchar radio");
		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnRadio.setBounds(427, 30, 370, 45);
		panel10.add(btnRadio);
		
		JButton btnMusica = new JButton("Quisiera escuchar música");
		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnMusica.setBounds(427, 85, 370, 45);
		panel10.add(btnMusica);
		
		JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");
		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnAudiolibro.setBounds(427, 140, 370, 45);
		panel10.add(btnAudiolibro);
		
		JButton btnLibro = new JButton("Quisiera que me lean un libro");
		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnLibro.setBounds(427, 195, 370, 45);
		panel10.add(btnLibro);
		
		JButton btnRopa = new JButton("Quisiera cambiarme de ropa");
		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnRopa.setBounds(824, 30, 370, 45);
		panel10.add(btnRopa);
		
		JButton btnCine = new JButton("Quisiera ir al cine");
		btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnCine.setBounds(824, 86, 370, 45);
		panel10.add(btnCine);
		
		JButton btnSalirAComer = new JButton("Quisiera salir a comer");
		btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSalirAComer.setBounds(824, 140, 370, 45);
		panel10.add(btnSalirAComer);
		
		JButton btnJugar = new JButton("Quisiera jugar a algo");
		btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnJugar.setBounds(824, 195, 370, 45);
		panel10.add(btnJugar);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(20, 761, 1224, 10);
		contentPane.add(panel11);
		
		JPanel panel12 = new JPanel();
		panel12.setLayout(null);
		panel12.setBounds(20, 771, 602, 64);
		contentPane.add(panel12);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnConfiguracion.setBounds(131, 12, 340, 40);
		panel12.add(btnConfiguracion);
		
		JPanel panel13 = new JPanel();
		panel13.setBounds(622, 771, 20, 64);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setLayout(null);
		panel14.setBounds(642, 771, 602, 64);
		contentPane.add(panel14);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEmergencias.setBounds(131, 12, 340, 40);
		panel14.add(btnEmergencias);
		
		JPanel panel15 = new JPanel();
		panel15.setBounds(0, 98, 20, 747);
		contentPane.add(panel15);
		
		JPanel panel17 = new JPanel();
		panel17.setBounds(20, 835, 1224, 10);
		contentPane.add(panel17);
		
		JPanel panel16 = new JPanel();
		panel16.setBounds(1244, 128, 20, 717);
		contentPane.add(panel16);
	}
}
