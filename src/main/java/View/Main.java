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

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

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
		
		JButton btnHambre = new JButton("Tengo Hambre");
		btnHambre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("tehng-goh ahm-breh");
		        voice.deallocate();
			}
		});
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnHambre.setBounds(10, 32, 240, 30);
		panel.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo Sed");
		btnSed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("tehng-goh sehd");
		        voice.deallocate();
			}
		});
		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSed.setBounds(10, 68, 240, 30);
		panel.add(btnSed);
		
		JButton btnSuenio = new JButton("Tengo Sueño");
		btnSuenio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("tehng-goh sweh-nyoh");
		        voice.deallocate();
			}
		});
		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSuenio.setBounds(10, 104, 240, 30);
		panel.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero Lavarme los Dientes");
		btnDientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-eh-roh lah-bah-ahr-meh lohs dee-ehn-tehs");
		        voice.deallocate();
			}
		});
		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnDientes.setBounds(260, 32, 240, 30);
		panel.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al Baño");
		btnBanio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-eh-roh eer ahl bah-nee-oh");
		        voice.deallocate();
			}
		});
		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBanio.setBounds(260, 68, 240, 30);
		panel.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero Bañarme");
		btnBaniar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-eh-roh bah-nee-ahr-meh");
		        voice.deallocate();
			}
		});
		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBaniar.setBounds(260, 104, 240, 30);
		panel.add(btnBaniar);
		
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
		panel_5.setLayout(null);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setBounds(118, 8, 140, 30);
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
		
		JButton btnPaseo = new JButton("Quisiera Dar un Paseo");
		btnPaseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah dahr oon pah-seh-oh");
		        voice.deallocate();
			}
		});
		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnPaseo.setBounds(14, 23, 240, 30);
		panel_7.add(btnPaseo);
		
		JButton btnTele = new JButton("Quisiera Ver en la Tele...");
		btnTele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah behr ehn lah teh-leh");
		        voice.deallocate();

			}
		});
		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTele.setBounds(14, 59, 240, 30);
		panel_7.add(btnTele);
		
		JButton btnComputadora = new JButton("Quisiera Ver en la Computadora...");
		btnComputadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah behr ehn lah kohm-poo-tah-doh-rah");
		        voice.deallocate();

			}
		});
		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnComputadora.setBounds(14, 95, 240, 30);
		panel_7.add(btnComputadora);
		
		JButton btnTablet = new JButton("Quisiera Ver en la Tablet...");
		btnTablet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah behr ehn lah tahb-liht");
		        voice.deallocate();
			}
		});
		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTablet.setBounds(14, 131, 240, 30);
		panel_7.add(btnTablet);
		
		JButton btnRadio = new JButton("Quisiera Escuchar Radio");
		btnRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah ehs-koo-chahr rrah-dyoh");
		        voice.deallocate();
			}
		});
		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnRadio.setBounds(264, 23, 240, 30);
		panel_7.add(btnRadio);
		
		JButton btnMusica = new JButton("Quisiera Escuchar Música");
		btnMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah ehs-koo-chahr moo-see-kah");
		        voice.deallocate();
			}
		});
		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnMusica.setBounds(264, 59, 240, 30);
		panel_7.add(btnMusica);
		
		JButton btnAudiolibro = new JButton("Quisiera Escuchar un Audiolibro");
		btnAudiolibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah ehs-koo-chahr oon ow-dyoh-lee-broh");
		        voice.deallocate();
			}
		});
		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnAudiolibro.setBounds(264, 95, 240, 30);
		panel_7.add(btnAudiolibro);
		
		JButton btnLibro = new JButton("Quisiera que me Lean un Libro");
		btnLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah keh meh leh-ahn oon lee-broh");
		        voice.deallocate();
			}
		});
		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnLibro.setBounds(264, 131, 240, 30);
		panel_7.add(btnLibro);
		
		JButton btnRopa = new JButton("Quisiera Cambiarme de Ropa");
		btnRopa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah kahm-bee-ahr-meh deh-eh rroh-pah");
		        voice.deallocate();
			}
		});
		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnRopa.setBounds(514, 23, 240, 30);
		panel_7.add(btnRopa);
		
		JButton btnNewButton_1_2_2 = new JButton("Quisiera ir al Cine");
		btnNewButton_1_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_1_2_2.setBounds(514, 59, 240, 30);
		panel_7.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_2_2_2 = new JButton("Quisiera Salir a Comer");
		btnNewButton_2_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_2_2_2.setBounds(514, 95, 240, 30);
		panel_7.add(btnNewButton_2_2_2);
		
		JButton btnNewButton_9_2 = new JButton("???");
		btnNewButton_9_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton_9_2.setBounds(514, 131, 240, 30);
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
		panel_4.setLayout(null);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setBounds(118, 8, 140, 30);
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
		
		JButton btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("see");
		        voice.deallocate();
			}
		});
		btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSi.setBounds(13, 30, 89, 70);
		panel_9.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("noh");
		        voice.deallocate();
			}
		});
		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNo.setBounds(112, 30, 89, 70);
		panel_9.add(btnNo);
		
		JButton btnNoSe = new JButton("No Se");
		btnNoSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("noh seh-eh");
		        voice.deallocate();
			}
		});
		btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNoSe.setBounds(211, 30, 89, 70);
		panel_9.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal Vez");
		btnTalVez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("tahl behs");
		        voice.deallocate();
			}
		});
		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTalVez.setBounds(310, 30, 89, 70);
		panel_9.add(btnTalVez);
		
		JButton btnGracias = new JButton("Gracias!");
		btnGracias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("grah-syahs!");
		        voice.deallocate();
			}
		});
		btnGracias.setBounds(409, 30, 89, 70);
		panel_9.add(btnGracias);
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(520, 202, 256, 112);
		contentPane.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblTemperatura.setBounds(10, 0, 153, 19);
		panel_10.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo Frio");
		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoFrio.setBounds(10, 30, 113, 70);
		panel_10.add(btnTengoFrio);
		
		JButton btnTengoCalor = new JButton("Tengo Calor");
		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoCalor.setBounds(133, 30, 113, 70);
		panel_10.add(btnTengoCalor);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setBounds(520, 47, 256, 144);
		contentPane.add(panel_10_1);
		panel_10_1.setLayout(null);
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
