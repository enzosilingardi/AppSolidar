package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

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
		panel1.setBounds(0, 0, 832, 134);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(832, 0, 432, 174);
		contentPane.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(20, 134, 812, 224);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(832, 174, 412, 70);
		contentPane.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(20, 358, 812, 20);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(832, 244, 412, 20);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(20, 378, 812, 154);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JPanel panel8 = new JPanel();
		panel8.setBounds(832, 264, 412, 268);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JPanel panel9 = new JPanel();
		panel9.setBounds(20, 532, 1224, 20);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setBounds(20, 552, 1224, 265);
		contentPane.add(panel10);
		panel10.setLayout(null);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(20, 817, 1224, 20);
		contentPane.add(panel11);

		JPanel panel12 = new JPanel();
		panel12.setBounds(20, 837, 602, 64);
		contentPane.add(panel12);
		panel12.setLayout(null);

		JPanel panel13 = new JPanel();
		panel13.setBounds(622, 837, 20, 64);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setBounds(642, 837, 602, 64);
		contentPane.add(panel14);
		panel14.setLayout(null);
		
		JPanel panel15 = new JPanel();
		panel15.setBounds(0, 134, 20, 787);
		contentPane.add(panel15);
		
		JPanel panel17 = new JPanel();
		panel17.setBounds(20, 901, 1224, 20);
		contentPane.add(panel17);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblDialogosHabituales.setBounds(30, 0, 230, 30);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");
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
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnHambre.setBounds(30, 30, 361, 50);
		panel3.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo sed");
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
		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSed.setBounds(30, 90, 361, 50);
		panel3.add(btnSed);
		
		JButton btnSuenio = new JButton("Tengo sueño");
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
		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSuenio.setBounds(30, 150, 361, 50);
		panel3.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero lavarme los dientes");
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
		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnDientes.setBounds(421, 30, 361, 50);
		panel3.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al baño");
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
		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnBanio.setBounds(421, 90, 361, 50);
		panel3.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero bañarme");
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
		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnBaniar.setBounds(421, 150, 361, 50);
		panel3.add(btnBaniar);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setBounds(131, 12, 340, 40);
		panel14.add(btnEmergencias);
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setBounds(30, 0, 150, 30);
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		panel10.add(lblOcio);
		
		JButton btnPaseo = new JButton("Quisiera dar un paseo");
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
		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnPaseo.setBounds(30, 30, 370, 45);
		panel10.add(btnPaseo);
		
		JButton btnTele = new JButton("Quisiera ver algo en la tele");
		btnTele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah behr ahl-goh ehn lah teh-leh");
		        voice.deallocate();

			}
		});
		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTele.setBounds(30, 85, 370, 45);
		panel10.add(btnTele);
		
		JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");
		btnComputadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah behr ahl-goh ehn lah kohm-poo-tah-doh-rah");
		        voice.deallocate();

			}
		});
		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnComputadora.setBounds(30, 140, 370, 45);
		panel10.add(btnComputadora);
		
		JButton btnTablet = new JButton("Quisiera ver algo en la tablet");
		btnTablet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah behr ahl-goh ehn lah tahb-liht");
		        voice.deallocate();
			}
		});
		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTablet.setBounds(30, 195, 370, 45);
		panel10.add(btnTablet);
		
		JButton btnRadio = new JButton("Quisiera escuchar radio");
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
		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnRadio.setBounds(427, 30, 370, 45);
		panel10.add(btnRadio);
		
		JButton btnMusica = new JButton("Quisiera escuchar música");
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
		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnMusica.setBounds(427, 85, 370, 45);
		panel10.add(btnMusica);
		
		JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");
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
		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnAudiolibro.setBounds(427, 140, 370, 45);
		panel10.add(btnAudiolibro);
		
		JButton btnLibro = new JButton("Quisiera que me lean un libro");
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
		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnLibro.setBounds(427, 195, 370, 45);
		panel10.add(btnLibro);
		
		JButton btnRopa = new JButton("Quisiera cambiarme de ropa");
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
		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnRopa.setBounds(824, 30, 370, 45);
		panel10.add(btnRopa);
		
		JButton btnCine = new JButton("Quisiera ir al cine");
		btnCine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah eer ahl see-neh");
		        voice.deallocate();
			}
		});
		btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnCine.setBounds(824, 86, 370, 45);
		panel10.add(btnCine);
		
		JButton btnSalirAComer = new JButton("Quisiera salir a comer");
		btnSalirAComer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah sah-ah-lee-eer ah koh-mehr");
		        voice.deallocate();
			}
		});
		btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSalirAComer.setBounds(824, 140, 370, 45);
		panel10.add(btnSalirAComer);
		
		JButton btnJugar = new JButton("Quisiera jugar a algo");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("kee-see-eh-rah hoo-gah-ahr ah ahl-goh");
		        voice.deallocate();
			}
		});
		btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnJugar.setBounds(824, 195, 370, 45);
		panel10.add(btnJugar);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setBounds(131, 12, 340, 40);
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		panel12.add(btnConfiguracion);
			
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setBounds(30, 0, 153, 30);
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		panel7.add(lblRespuestas);
		
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
		btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnSi.setBounds(41, 30, 130, 94);
		panel7.add(btnSi);
		
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
		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnNo.setBounds(191, 30, 130, 94);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No se");
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
		btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnNoSe.setBounds(341, 30, 130, 94);
		panel7.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal vez");
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
		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTalVez.setBounds(491, 30, 130, 94);
		panel7.add(btnTalVez);
		
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
		btnGracias.setBounds(641, 30, 130, 94);
		panel7.add(btnGracias);
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblTemperatura.setBounds(24, 0, 150, 30);
		panel8.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo frio");
		btnTengoFrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("tehng-goh free-oh");
		        voice.deallocate();
			}
		});
		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTengoFrio.setBounds(24, 30, 170, 94);
		panel8.add(btnTengoFrio);
		
		JButton btnTengoCalor = new JButton("Tengo calor");
		btnTengoCalor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("tehng-goh kah-lohr");
		        voice.deallocate();
			}
		});
		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnTengoCalor.setBounds(218, 30, 170, 94);
		panel8.add(btnTengoCalor);
		
		JButton btnEstaFrio = new JButton("Está frio");
		btnEstaFrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("ehs-tah-ah free-oh");
		        voice.deallocate();
			}
		});
		btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEstaFrio.setBounds(24, 144, 170, 94);
		panel8.add(btnEstaFrio);
		
		JButton btnEstaCaliente = new JButton("Está caliente");
		btnEstaCaliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();
		        voice = voiceManager.getVoice("kevin16");
		        voice.allocate();
		        voice.speak("ehs-tah-ah kah-lee-ehn-teh");
		        voice.deallocate();
			}
		});
		btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEstaCaliente.setBounds(218, 144, 170, 94);
		panel8.add(btnEstaCaliente);
		
		JButton btnNewButton = new JButton("Teclado en pantalla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        try {
		        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }


			}
		});
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnNewButton.setBounds(86, 10, 240, 50);
		panel4.add(btnNewButton);
		
		JPanel panel16 = new JPanel();
		panel16.setBounds(1244, 174, 20, 747);
		contentPane.add(panel16);
		
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
