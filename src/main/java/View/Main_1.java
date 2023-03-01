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
import java.awt.Rectangle;

import javax.swing.SwingConstants;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_1 frame = new Main_1();
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
	public Main_1(String tamanio, String idioma) {        // Constructor por parametro que recibe el tamaño y el idioma que se quiere usar para construir la ventana
		
		if (tamanio.equals("1")) {                        //If que verifica si el tamaño seleccionado es el primero
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 520, 47);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(520, 0, 266, 73);
		contentPane.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(10, 47, 510, 144);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(520, 73, 256, 42);
		contentPane.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(10, 192, 510, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(520, 115, 256, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(10, 202, 510, 112);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JPanel panel8 = new JPanel();
		panel8.setBounds(520, 124, 256, 190);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JPanel panel9 = new JPanel();
		panel9.setBounds(10, 314, 766, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setBounds(10, 325, 766, 172);
		contentPane.add(panel10);
		panel10.setLayout(null);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(10, 498, 766, 10);
		contentPane.add(panel11);

		JPanel panel12 = new JPanel();
		panel12.setBounds(10, 508, 378, 44);
		contentPane.add(panel12);
		panel12.setLayout(null);

		JPanel panel13 = new JPanel();
		panel13.setBounds(387, 508, 10, 44);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setBounds(398, 508, 378, 44);
		contentPane.add(panel14);
		panel14.setLayout(null);
		
		JPanel panel15 = new JPanel();
		panel15.setBounds(0, 47, 10, 516);
		contentPane.add(panel15);
		
		JPanel panel16 = new JPanel();
		panel16.setBounds(776, 73, 10, 490);
		contentPane.add(panel16);
		
		JPanel panel17 = new JPanel();
		panel17.setBounds(10, 553, 766, 10);
		contentPane.add(panel17);
		
		if (idioma.equals("esp")) {            // If que verifica si el idioma seleccionado es español
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblDialogosHabituales.setBounds(10, 0, 160, 24);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");              // Boton text-to-Speech
		btnHambre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");  // Settea las propiedades de la voz
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();        //Prepara la instancia de voz
		        voice = voiceManager.getVoice("kevin16");                     //Utiliza la voz "kevin16"
		        voice.allocate();
		        voice.speak("tehng-goh ahm-breh");                           //Dice la frase seleccionada
		        voice.deallocate();
			}
		});
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnHambre.setBounds(10, 32, 240, 30);
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
		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSed.setBounds(10, 68, 240, 30);
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
		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSuenio.setBounds(10, 104, 240, 30);
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
		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnDientes.setBounds(260, 32, 240, 30);
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
		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBanio.setBounds(260, 68, 240, 30);
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
		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBaniar.setBounds(260, 104, 240, 30);
		panel3.add(btnBaniar);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setBounds(118, 8, 140, 30);
		panel14.add(btnEmergencias);
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setBounds(10, 0, 130, 24);
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
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
		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnPaseo.setBounds(14, 23, 240, 30);
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
		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnTele.setBounds(14, 59, 240, 30);
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
		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnComputadora.setBounds(14, 95, 240, 30);
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
		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnTablet.setBounds(14, 131, 240, 30);
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
		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnRadio.setBounds(264, 23, 240, 30);
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
		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnMusica.setBounds(264, 59, 240, 30);
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
		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnAudiolibro.setBounds(264, 95, 240, 30);
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
		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnLibro.setBounds(264, 131, 240, 30);
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
		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnRopa.setBounds(514, 23, 240, 30);
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
		btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnCine.setBounds(514, 59, 240, 30);
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
		btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnSalirAComer.setBounds(514, 95, 240, 30);
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
		btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnJugar.setBounds(514, 131, 240, 30);
		panel10.add(btnJugar);
		
		JButton btnConfiguracion = new JButton("Configuración");                   
		btnConfiguracion.setBounds(118, 8, 140, 30);
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		panel12.add(btnConfiguracion);
			
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setBounds(10, 0, 153, 19);
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
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
		btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSi.setBounds(13, 30, 89, 70);
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
		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNo.setBounds(112, 30, 89, 70);
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
		btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNoSe.setBounds(211, 30, 89, 70);
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
		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTalVez.setBounds(310, 30, 89, 70);
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
		btnGracias.setBounds(409, 30, 89, 70);
		panel7.add(btnGracias);
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblTemperatura.setBounds(10, 0, 153, 24);
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
		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoFrio.setBounds(5, 30, 118, 70);
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
		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoCalor.setBounds(128, 30, 123, 70);
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
		btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnEstaFrio.setBounds(5, 109, 118, 70);
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
		btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnEstaCaliente.setBounds(128, 109, 123, 70);
		panel8.add(btnEstaCaliente);
		
		JButton btnNewButton = new JButton("Teclado en pantalla");        //Botón que abre el teclado en pantalla
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        try {
		        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");    //Envía a cmd el comando para ejecutar el teclado en pantalla
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }


			}
		});
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton.setBounds(40, 6, 176, 30);
		panel4.add(btnNewButton);
		
		btnConfiguracion.addActionListener(new ActionListener() {    //Botón que abre la ventana de configuración
			public void actionPerformed(ActionEvent e) {
				Configuracion con = new Configuracion();
				con.setVisible(true);
				dispose();
			}
		});
		btnEmergencias.addActionListener(new ActionListener() {     //Botón que abre la ventana emergencias
			public void actionPerformed(ActionEvent e) {
				Emergencias em = new Emergencias();
				em.setVisible(true);
				dispose();
			}
		});
		}
		
		if (idioma.equals("ing")) {             //If que verifica si el idioma seleccionado es inglés
		
			JLabel lblDialogosHabituales = new JLabel("Usual Dialogues");
			lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			lblDialogosHabituales.setBounds(10, 0, 160, 24);
			panel3.add(lblDialogosHabituales);
			
			JButton btnHambre = new JButton("I am hungry");
			btnHambre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I am hungry");
			        voice.deallocate();
				}
			});
			btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnHambre.setBounds(10, 32, 240, 30);
			panel3.add(btnHambre);
			
			JButton btnSed = new JButton("I am thirsty");
			btnSed.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I am thirsty");
			        voice.deallocate();
				}
			});
			btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnSed.setBounds(10, 68, 240, 30);
			panel3.add(btnSed);
			
			JButton btnSuenio = new JButton("I am sleepy");
			btnSuenio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I am sleepy");
			        voice.deallocate();
				}
			});
			btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnSuenio.setBounds(10, 104, 240, 30);
			panel3.add(btnSuenio);
			
			JButton btnDientes = new JButton("I want to brush my teeth");
			btnDientes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I want to brush my teeth");
			        voice.deallocate();
				}
			});
			btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnDientes.setBounds(260, 32, 240, 30);
			panel3.add(btnDientes);
			
			JButton btnBanio = new JButton("I want to go to the bathroom");
			btnBanio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I want to go to the bathroom");
			        voice.deallocate();
				}
			});
			btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnBanio.setBounds(260, 68, 240, 30);
			panel3.add(btnBanio);
			
			JButton btnBaniar = new JButton("I want to bathe");
			btnBaniar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I want to bathe");
			        voice.deallocate();
				}
			});
			btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnBaniar.setBounds(260, 104, 240, 30);
			panel3.add(btnBaniar);
			
			JButton btnEmergencias = new JButton("Emergencies");
			btnEmergencias.setBounds(118, 8, 140, 30);
			panel14.add(btnEmergencias);
			btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			
			JLabel lblOcio = new JLabel("Leisure");
			lblOcio.setBounds(10, 0, 130, 24);
			lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			panel10.add(lblOcio);
			
			JButton btnPaseo = new JButton("I would like to take a walk");
			btnPaseo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to take a walk");
			        voice.deallocate();
				}
			});
			btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnPaseo.setBounds(14, 23, 240, 30);
			panel10.add(btnPaseo);
			
			JButton btnTele = new JButton("I would like to watch something on the tv");
			btnTele.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to watch something on the tv");
			        voice.deallocate();

				}
			});
			btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnTele.setBounds(14, 59, 240, 30);
			panel10.add(btnTele);
			
			JButton btnComputadora = new JButton("I would like to watch something on the pc");
			btnComputadora.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to watch something on the computer");
			        voice.deallocate();

				}
			});
			btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnComputadora.setBounds(14, 95, 240, 30);
			panel10.add(btnComputadora);
			
			JButton btnTablet = new JButton("I would like to watch something on the tablet");
			btnTablet.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to watch something on the tablet");
			        voice.deallocate();
				}
			});
			btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnTablet.setBounds(14, 131, 240, 30);
			panel10.add(btnTablet);
			
			JButton btnRadio = new JButton("I would like to listen to the radio");
			btnRadio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to listen to the radio");
			        voice.deallocate();
				}
			});
			btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnRadio.setBounds(264, 23, 240, 30);
			panel10.add(btnRadio);
			
			JButton btnMusica = new JButton("I would like to listen to music");
			btnMusica.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to listen to music");
			        voice.deallocate();
				}
			});
			btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnMusica.setBounds(264, 59, 240, 30);
			panel10.add(btnMusica);
			
			JButton btnAudiolibro = new JButton("I would like to listen to an audiobook");
			btnAudiolibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to listen to an audiobook");
			        voice.deallocate();
				}
			});
			btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnAudiolibro.setBounds(264, 95, 240, 30);
			panel10.add(btnAudiolibro);
			
			JButton btnLibro = new JButton("I would like you to read me a book");
			btnLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like you to read me a book");
			        voice.deallocate();
				}
			});
			btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnLibro.setBounds(264, 131, 240, 30);
			panel10.add(btnLibro);
			
			JButton btnRopa = new JButton("I would like to change my clothes");
			btnRopa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to change my clothes");
			        voice.deallocate();
				}
			});
			btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnRopa.setBounds(514, 23, 240, 30);
			panel10.add(btnRopa);
			
			JButton btnCine = new JButton("I would like to go to the cinema");
			btnCine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to go to the cinema");
			        voice.deallocate();
				}
			});
			btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnCine.setBounds(514, 59, 240, 30);
			panel10.add(btnCine);
			
			JButton btnSalirAComer = new JButton("I would like to go out to eat");
			btnSalirAComer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to go out to eat");
			        voice.deallocate();
				}
			});
			btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnSalirAComer.setBounds(514, 95, 240, 30);
			panel10.add(btnSalirAComer);
			
			JButton btnJugar = new JButton("I would like to play something");
			btnJugar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I would like to play something");
			        voice.deallocate();
				}
			});
			btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnJugar.setBounds(514, 131, 240, 30);
			panel10.add(btnJugar);
			
			JButton btnConfiguracion = new JButton("Configuration");
			btnConfiguracion.setBounds(118, 8, 140, 30);
			btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			panel12.add(btnConfiguracion);
				
			JLabel lblRespuestas = new JLabel("Answers");
			lblRespuestas.setBounds(10, 0, 153, 19);
			lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			panel7.add(lblRespuestas);
			
			JButton btnSi = new JButton("Yes");
			btnSi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("Yes");
			        voice.deallocate();
				}
			});
			btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnSi.setBounds(13, 30, 89, 70);
			panel7.add(btnSi);
			
			JButton btnNo = new JButton("No");
			btnNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("no");
			        voice.deallocate();
				}
			});
			btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnNo.setBounds(112, 30, 89, 70);
			panel7.add(btnNo);
			
			JButton btnNoSe = new JButton("<html><center>I don´t know</html>");
			btnNoSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I don't know");
			        voice.deallocate();
				}
			});
			btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnNoSe.setBounds(211, 30, 89, 70);
			panel7.add(btnNoSe);
			
			JButton btnTalVez = new JButton("Maybe");
			btnTalVez.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("Maybe");
			        voice.deallocate();
				}
			});
			btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTalVez.setBounds(310, 30, 89, 70);
			panel7.add(btnTalVez);
			
			JButton btnGracias = new JButton("Thanks!");
			btnGracias.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("Thanks!");
			        voice.deallocate();
				}
			});
			btnGracias.setBounds(409, 30, 89, 70);
			panel7.add(btnGracias);
			btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			
			JLabel lblTemperatura = new JLabel("Temperature");
			lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			lblTemperatura.setBounds(10, 0, 153, 24);
			panel8.add(lblTemperatura);
			
			JButton btnTengoFrio = new JButton("I am cold");
			btnTengoFrio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I am cold");
			        voice.deallocate();
				}
			});
			btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTengoFrio.setBounds(5, 30, 118, 70);
			panel8.add(btnTengoFrio);
			
			JButton btnTengoCalor = new JButton("I am hot");
			btnTengoCalor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("I am hot");
			        voice.deallocate();
				}
			});
			btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTengoCalor.setBounds(128, 30, 123, 70);
			panel8.add(btnTengoCalor);
			
			JButton btnEstaFrio = new JButton("It is cold");
			btnEstaFrio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("It is cold");
			        voice.deallocate();
				}
			});
			btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnEstaFrio.setBounds(5, 109, 118, 70);
			panel8.add(btnEstaFrio);
			
			JButton btnEstaCaliente = new JButton("It is hot");
			btnEstaCaliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
					Voice voice;
			        VoiceManager voiceManager = VoiceManager.getInstance();
			        voice = voiceManager.getVoice("kevin16");
			        voice.allocate();
			        voice.speak("It is hot");
			        voice.deallocate();
				}
			});
			btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnEstaCaliente.setBounds(128, 109, 123, 70);
			panel8.add(btnEstaCaliente);
			
			JButton btnNewButton = new JButton("Virtual Keyboard");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			        try {
			        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }


				}
			});
			btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnNewButton.setBounds(40, 6, 176, 30);
			panel4.add(btnNewButton);
			
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
		
		if (tamanio.equals("2")) {         // If que verifica si el tamaño seleccionado es el segundo
			
			if (idioma.equals("esp")) {
			
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
			btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnHambre.setBounds(30, 30, 458, 50);
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
			btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSed.setBounds(30, 90, 458, 50);
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
			btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSuenio.setBounds(30, 150, 458, 50);
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
			btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnDientes.setBounds(508, 30, 458, 50);
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
			btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnBanio.setBounds(508, 90, 458, 50);
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
			btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnBaniar.setBounds(508, 150, 458, 50);
			panel3.add(btnBaniar);
			
			JPanel panel4 = new JPanel();
			panel4.setLayout(null);
			panel4.setBounds(994, 130, 350, 60);
			contentPane.add(panel4);
			
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
			btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSi.setBounds(92, 30, 130, 85);
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
			btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnNo.setBounds(262, 30, 130, 85);
			panel7.add(btnNo);
			
			JButton btnNoSe = new JButton("No sé");
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
			btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnNoSe.setBounds(432, 30, 130, 85);
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
			btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTalVez.setBounds(602, 30, 130, 85);
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
			btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTengoFrio.setBounds(10, 30, 160, 80);
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
			btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTengoCalor.setBounds(175, 30, 160, 80);
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
			btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnEstaFrio.setBounds(10, 120, 160, 80);
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
			btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnPaseo.setBounds(31, 30, 414, 40);
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
			btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTele.setBounds(31, 75, 414, 40);
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
			btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnComputadora.setBounds(31, 120, 414, 40);
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
			btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTablet.setBounds(31, 165, 414, 40);
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
			btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnRadio.setBounds(465, 30, 414, 40);
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
			btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnMusica.setBounds(465, 75, 414, 40);
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
			btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnAudiolibro.setBounds(465, 120, 414, 40);
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
			btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnLibro.setBounds(465, 165, 414, 40);
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
			btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnRopa.setBounds(899, 30, 414, 40);
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
			btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnCine.setBounds(899, 75, 414, 40);
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
			btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSalirAComer.setBounds(899, 120, 414, 40);
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
					Configuracion con = new Configuracion();
					con.setVisible(true);
					dispose();
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
			btnEmergencias.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Emergencias em = new Emergencias();
					em.setVisible(true);
					dispose();
				}
			});
			btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnEmergencias.setBounds(126, 13, 415, 40);
			panel14.add(btnEmergencias);
			
			JPanel panel15 = new JPanel();
			panel15.setBounds(0, 643, 1344, 10);
			contentPane.add(panel15);
			}
			
			if (idioma.equals("ing")) {
				
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
				
				JLabel lblDialogosHabituales = new JLabel("Usual Dialogues");
				lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblDialogosHabituales.setBounds(30, 0, 230, 30);
				panel3.add(lblDialogosHabituales);
				
				JButton btnHambre = new JButton("I am hungry");
				btnHambre.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am hungry");
				        voice.deallocate();
					}
				});
				btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnHambre.setBounds(30, 30, 458, 50);
				panel3.add(btnHambre);
				
				JButton btnSed = new JButton("I am thirsty");
				btnSed.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am thirsty");
				        voice.deallocate();
					}
				});
				btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSed.setBounds(30, 90, 458, 50);
				panel3.add(btnSed);
				
				JButton btnSuenio = new JButton("I am sleepy");
				btnSuenio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am sleepy");
				        voice.deallocate();
					}
				});
				btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSuenio.setBounds(30, 150, 458, 50);
				panel3.add(btnSuenio);
				
				JButton btnDientes = new JButton("I want to brush my teeth");
				btnDientes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I want to brush my teeth");
				        voice.deallocate();
					}
				});
				btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnDientes.setBounds(508, 30, 458, 50);
				panel3.add(btnDientes);
				
				JButton btnBanio = new JButton("I want to go to the bathroom");
				btnBanio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I want to go to the bathroom");
				        voice.deallocate();
					}
				});
				btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnBanio.setBounds(508, 90, 458, 50);
				panel3.add(btnBanio);
				
				JButton btnBaniar = new JButton("I want to bathe");
				btnBaniar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I want to bathe");
				        voice.deallocate();
					}
				});
				btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnBaniar.setBounds(508, 150, 458, 50);
				panel3.add(btnBaniar);
				
				JPanel panel4 = new JPanel();
				panel4.setLayout(null);
				panel4.setBounds(994, 130, 350, 60);
				contentPane.add(panel4);
				
				JButton btnNewButton = new JButton("Virtual Keyboard");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        try {
				        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }


					}
				});
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
				
				JLabel lblRespuestas = new JLabel("Answers");
				lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblRespuestas.setBounds(30, 0, 153, 30);
				panel7.add(lblRespuestas);
				
				JButton btnSi = new JButton("Yes");
				btnSi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("Yes");
				        voice.deallocate();
					}
				});
				btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSi.setBounds(92, 30, 130, 85);
				panel7.add(btnSi);
				
				JButton btnNo = new JButton("No");
				btnNo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("No");
				        voice.deallocate();
					}
				});
				btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnNo.setBounds(262, 30, 130, 85);
				panel7.add(btnNo);
				
				JButton btnNoSe = new JButton("<html><center>I don´t know</html>");
				btnNoSe.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I don't know");
				        voice.deallocate();
					}
				});
				btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnNoSe.setBounds(432, 30, 130, 85);
				panel7.add(btnNoSe);
				
				JButton btnTalVez = new JButton("Maybe");
				btnTalVez.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("Maybe");
				        voice.deallocate();
					}
				});
				btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTalVez.setBounds(602, 30, 130, 85);
				panel7.add(btnTalVez);
				
				JButton btnGracias = new JButton("Thanks!");
				btnGracias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("Thanks!");
				        voice.deallocate();
					}
				});
				btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnGracias.setBounds(772, 30, 130, 85);
				panel7.add(btnGracias);
				
				JPanel panel8 = new JPanel();
				panel8.setLayout(null);
				panel8.setBounds(994, 200, 350, 214);
				contentPane.add(panel8);
				
				JLabel lblTemperatura = new JLabel("Temperature");
				lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblTemperatura.setBounds(10, 0, 150, 30);
				panel8.add(lblTemperatura);
				
				JButton btnTengoFrio = new JButton("I am cold");
				btnTengoFrio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am cold");
				        voice.deallocate();
					}
				});
				btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTengoFrio.setBounds(10, 30, 160, 80);
				panel8.add(btnTengoFrio);
				
				JButton btnTengoCalor = new JButton("I am hot");
				btnTengoCalor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am hot");
				        voice.deallocate();
					}
				});
				btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTengoCalor.setBounds(175, 30, 160, 80);
				panel8.add(btnTengoCalor);
				
				JButton btnEstaFrio = new JButton("It is cold");
				btnEstaFrio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("It is cold");
				        voice.deallocate();
					}
				});
				btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnEstaFrio.setBounds(10, 120, 160, 80);
				panel8.add(btnEstaFrio);
				
				JButton btnEstaCaliente = new JButton("It is hot");
				btnEstaCaliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("It is hot");
				        voice.deallocate();
					}
				});
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
				
				JLabel lblOcio = new JLabel("Leisure");
				lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblOcio.setBounds(30, 0, 150, 30);
				panel10.add(lblOcio);
				
				JButton btnPaseo = new JButton("I would like to take a walk");
				btnPaseo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to take a walk");
				        voice.deallocate();
					}
				});
				btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnPaseo.setBounds(31, 30, 414, 40);
				panel10.add(btnPaseo);
				
				JButton btnTele = new JButton("I would like to watch something on the tv");
				btnTele.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to watch something on the tv");
				        voice.deallocate();

					}
				});
				btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTele.setBounds(31, 75, 414, 40);
				panel10.add(btnTele);
				
				JButton btnComputadora = new JButton("I would like to watch something on the pc");
				btnComputadora.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to watch something on the computer");
				        voice.deallocate();

					}
				});
				btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnComputadora.setBounds(31, 120, 414, 40);
				panel10.add(btnComputadora);
				
				JButton btnTablet = new JButton("I would like to watch something on the tablet");
				btnTablet.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to watch something on the tablet");
				        voice.deallocate();
					}
				});
				btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTablet.setBounds(31, 165, 414, 40);
				panel10.add(btnTablet);
				
				JButton btnRadio = new JButton("I would like to listen to the radio");
				btnRadio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to listen to the radio");
				        voice.deallocate();
					}
				});
				btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnRadio.setBounds(465, 30, 414, 40);
				panel10.add(btnRadio);
				
				JButton btnMusica = new JButton("I would like to listen to music");
				btnMusica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to listen to music");
				        voice.deallocate();
					}
				});
				btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnMusica.setBounds(465, 75, 414, 40);
				panel10.add(btnMusica);
				
				JButton btnAudiolibro = new JButton("I would like to listen to an audiobook");
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
				btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnAudiolibro.setBounds(465, 120, 414, 40);
				panel10.add(btnAudiolibro);
				
				JButton btnLibro = new JButton("I would like you to read me a book");
				btnLibro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like you to read me a book");
				        voice.deallocate();
					}
				});
				btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnLibro.setBounds(465, 165, 414, 40);
				panel10.add(btnLibro);
				
				JButton btnRopa = new JButton("I would like to change my clothes");
				btnRopa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to change my clothes");
				        voice.deallocate();
					}
				});
				btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnRopa.setBounds(899, 30, 414, 40);
				panel10.add(btnRopa);
				
				JButton btnCine = new JButton("I would like to go to the cinema");
				btnCine.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to go to the cinema");
				        voice.deallocate();
					}
				});
				btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnCine.setBounds(899, 75, 414, 40);
				panel10.add(btnCine);
				
				JButton btnSalirAComer = new JButton("I would like to go out to eat");
				btnSalirAComer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to go out to eat");
				        voice.deallocate();
					}
				});
				btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSalirAComer.setBounds(899, 120, 414, 40);
				panel10.add(btnSalirAComer);
				
				JButton btnJugar = new JButton("I would like to play something");
				btnJugar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to play something");
				        voice.deallocate();
					}
				});
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
				
				JButton btnConfiguracion = new JButton("Configuration");
				btnConfiguracion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Configuracion con = new Configuracion();
						con.setVisible(true);
						dispose();
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
				
				JButton btnEmergencias = new JButton("Emergencies");
				btnEmergencias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Emergencias em = new Emergencias();
						em.setVisible(true);
						dispose();
					}
				});
				btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnEmergencias.setBounds(126, 13, 415, 40);
				panel14.add(btnEmergencias);
				
				JPanel panel15 = new JPanel();
				panel15.setBounds(0, 643, 1344, 10);
				contentPane.add(panel15);
				
			}
			
		}
		
		if (tamanio.equals("3")) {           //If que verifica si el tamaño seleccionado es el tercero
			
			if (idioma.equals("esp")) {
				
				setBounds(new Rectangle(0, 0, 1920, 1080));
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel1 = new JPanel();
				panel1.setBounds(0, 0, 1444, 121);
				contentPane.add(panel1);
				
				JPanel panel2 = new JPanel();
				panel2.setBounds(1444, 0, 460, 161);
				contentPane.add(panel2);
				
				JPanel panel3 = new JPanel();
				panel3.setLayout(null);
				panel3.setBounds(0, 121, 1444, 260);
				contentPane.add(panel3);
				
				JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
				lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblDialogosHabituales.setBounds(20, 0, 270, 30);
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
				btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnHambre.setBounds(80, 30, 620, 60);
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
				btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSed.setBounds(80, 100, 620, 60);
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
				btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSuenio.setBounds(80, 170, 620, 60);
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
				btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnDientes.setBounds(744, 30, 620, 60);
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
				btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBanio.setBounds(744, 100, 620, 60);
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
				btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBaniar.setBounds(744, 170, 620, 60);
				panel3.add(btnBaniar);
				
				JPanel panel4 = new JPanel();
				panel4.setLayout(null);
				panel4.setBounds(1444, 161, 460, 100);
				contentPane.add(panel4);
				
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
				btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNewButton.setBounds(30, 20, 400, 60);
				panel4.add(btnNewButton);
				
				JPanel panel5 = new JPanel();
				panel5.setBounds(0, 381, 1444, 10);
				contentPane.add(panel5);
				
				JPanel panel6 = new JPanel();
				panel6.setBounds(1444, 261, 460, 10);
				contentPane.add(panel6);
				
				JPanel panel7 = new JPanel();
				panel7.setLayout(null);
				panel7.setBounds(0, 391, 1444, 170);
				contentPane.add(panel7);
				
				JLabel lblRespuestas = new JLabel("Respuestas");
				lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblRespuestas.setBounds(20, 0, 153, 30);
				panel7.add(lblRespuestas);
				
				JButton btnSi = new JButton("Sí");
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
				btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSi.setBounds(101, 30, 190, 110);
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
				btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNo.setBounds(364, 30, 190, 110);
				panel7.add(btnNo);
				
				JButton btnNoSe = new JButton("No sé");
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
				btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNoSe.setBounds(627, 30, 190, 110);
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
				btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTalVez.setBounds(890, 30, 190, 110);
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
				btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnGracias.setBounds(1153, 30, 180, 110);
				panel7.add(btnGracias);
				
				JPanel panel8 = new JPanel();
				panel8.setLayout(null);
				panel8.setBounds(1444, 271, 460, 290);
				contentPane.add(panel8);
				
				JLabel lblTemperatura = new JLabel("Temperatura");
				lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
				lblTemperatura.setBounds(20, 0, 150, 30);
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
				btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoFrio.setBounds(30, 30, 190, 110);
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
				btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoCalor.setBounds(240, 30, 190, 110);
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
				btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaFrio.setBounds(30, 150, 190, 110);
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
				btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaCaliente.setBounds(240, 150, 190, 110);
				panel8.add(btnEstaCaliente);
				
				JPanel panel9 = new JPanel();
				panel9.setBounds(0, 561, 1904, 10);
				contentPane.add(panel9);
				
				JPanel panel10 = new JPanel();
				panel10.setLayout(null);
				panel10.setBounds(0, 571, 1904, 330);
				contentPane.add(panel10);
				
				JLabel lblOcio = new JLabel("Ocio");
				lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblOcio.setBounds(20, 0, 150, 30);
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
				btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnPaseo.setBounds(20, 30, 608, 60);
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
				btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTele.setBounds(20, 100, 608, 60);
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
				btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnComputadora.setBounds(20, 170, 608, 60);
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
				btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTablet.setBounds(20, 240, 608, 60);
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
				btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRadio.setBounds(648, 30, 608, 60);
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
				btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnMusica.setBounds(648, 100, 608, 60);
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
				btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnAudiolibro.setBounds(648, 170, 608, 60);
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
				btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnLibro.setBounds(648, 240, 608, 60);
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
				btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRopa.setBounds(1276, 30, 608, 60);
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
				btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnCine.setBounds(1276, 100, 608, 60);
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
				btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSalirAComer.setBounds(1276, 170, 608, 60);
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
				btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnJugar.setBounds(1276, 240, 608, 60);
				panel10.add(btnJugar);
				
				JPanel panel11 = new JPanel();
				panel11.setBounds(0, 901, 1904, 10);
				contentPane.add(panel11);
				
				JPanel panel12 = new JPanel();
				panel12.setLayout(null);
				panel12.setBounds(0, 911, 947, 120);
				contentPane.add(panel12);
				
				JButton btnConfiguracion = new JButton("Configuración");
				btnConfiguracion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Configuracion con = new Configuracion();
						con.setVisible(true);
						dispose();
					}
				});
				btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnConfiguracion.setBounds(170, 30, 608, 60);
				panel12.add(btnConfiguracion);
				
				JPanel panel13 = new JPanel();
				panel13.setBounds(947, 911, 10, 120);
				contentPane.add(panel13);
				
				JPanel panel14 = new JPanel();
				panel14.setLayout(null);
				panel14.setBounds(957, 911, 947, 120);
				contentPane.add(panel14);
				
				JButton btnEmergencias = new JButton("Emergencias");
				btnEmergencias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Emergencias em = new Emergencias();
						em.setVisible(true);
						dispose();
					}
				});
				btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEmergencias.setBounds(169, 30, 608, 60);
				panel14.add(btnEmergencias);
				
				JPanel panel15 = new JPanel();
				panel15.setBounds(0, 1031, 1904, 10);
				contentPane.add(panel15);
				
				
			}
			
			if (idioma.equals("ing")) {
				
				setBounds(new Rectangle(0, 0, 1920, 1080));
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel1 = new JPanel();
				panel1.setBounds(0, 0, 1444, 121);
				contentPane.add(panel1);
				
				JPanel panel2 = new JPanel();
				panel2.setBounds(1444, 0, 460, 161);
				contentPane.add(panel2);
				
				JPanel panel3 = new JPanel();
				panel3.setLayout(null);
				panel3.setBounds(0, 121, 1444, 260);
				contentPane.add(panel3);
				
				JLabel lblDialogosHabituales = new JLabel("Usual Dialogues");
				lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblDialogosHabituales.setBounds(20, 0, 270, 30);
				panel3.add(lblDialogosHabituales);
				
				JButton btnHambre = new JButton("I am hungry");
				btnHambre.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am hungry");
				        voice.deallocate();
					}
				});
				btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnHambre.setBounds(80, 30, 620, 60);
				panel3.add(btnHambre);
				
				JButton btnSed = new JButton("I am thirsty");
				btnSed.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am thirsty");
				        voice.deallocate();
					}
				});
				btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSed.setBounds(80, 100, 620, 60);
				panel3.add(btnSed);
				
				JButton btnSuenio = new JButton("I am sleepy");
				btnSuenio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am sleepy");
				        voice.deallocate();
					}
				});
				btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSuenio.setBounds(80, 170, 620, 60);
				panel3.add(btnSuenio);
				
				JButton btnDientes = new JButton("I want to brush my teeth");
				btnDientes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I want to brush my teeth");
				        voice.deallocate();
					}
				});
				btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnDientes.setBounds(744, 30, 620, 60);
				panel3.add(btnDientes);
				
				JButton btnBanio = new JButton("I want to go to the bathroom");
				btnBanio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I want to go to the bathroom");
				        voice.deallocate();
					}
				});
				btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBanio.setBounds(744, 100, 620, 60);
				panel3.add(btnBanio);
				
				JButton btnBaniar = new JButton("I want to bathe");
				btnBaniar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I want to bathe");
				        voice.deallocate();
					}
				});
				btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBaniar.setBounds(744, 170, 620, 60);
				panel3.add(btnBaniar);
				
				JPanel panel4 = new JPanel();
				panel4.setLayout(null);
				panel4.setBounds(1444, 161, 460, 100);
				contentPane.add(panel4);
				
				JButton btnNewButton = new JButton("Virtual keyboard");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        try {
				        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }


					}
				});
				btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNewButton.setBounds(30, 20, 400, 60);
				panel4.add(btnNewButton);
				
				JPanel panel5 = new JPanel();
				panel5.setBounds(0, 381, 1444, 10);
				contentPane.add(panel5);
				
				JPanel panel6 = new JPanel();
				panel6.setBounds(1444, 261, 460, 10);
				contentPane.add(panel6);
				
				JPanel panel7 = new JPanel();
				panel7.setLayout(null);
				panel7.setBounds(0, 391, 1444, 170);
				contentPane.add(panel7);
				
				JLabel lblRespuestas = new JLabel("Answers");
				lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblRespuestas.setBounds(20, 0, 153, 30);
				panel7.add(lblRespuestas);
				
				JButton btnSi = new JButton("Yes");
				btnSi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("Yes");
				        voice.deallocate();
					}
				});
				btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSi.setBounds(101, 30, 190, 110);
				panel7.add(btnSi);
				
				JButton btnNo = new JButton("No");
				btnNo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("No");
				        voice.deallocate();
					}
				});
				btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNo.setBounds(364, 30, 190, 110);
				panel7.add(btnNo);
				
				JButton btnNoSe = new JButton("<html><center>I don´t know</html>");
				btnNoSe.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I don't know");
				        voice.deallocate();
					}
				});
				btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNoSe.setBounds(627, 30, 190, 110);
				panel7.add(btnNoSe);
				
				JButton btnTalVez = new JButton("Maybe");
				btnTalVez.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("Maybe");
				        voice.deallocate();
					}
				});
				btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTalVez.setBounds(890, 30, 190, 110);
				panel7.add(btnTalVez);
				
				JButton btnGracias = new JButton("Thanks!");
				btnGracias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("Thanks!");
				        voice.deallocate();
					}
				});
				btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnGracias.setBounds(1153, 30, 180, 110);
				panel7.add(btnGracias);
				
				JPanel panel8 = new JPanel();
				panel8.setLayout(null);
				panel8.setBounds(1444, 271, 460, 290);
				contentPane.add(panel8);
				
				JLabel lblTemperatura = new JLabel("Temperature");
				lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
				lblTemperatura.setBounds(20, 0, 150, 30);
				panel8.add(lblTemperatura);
				
				JButton btnTengoFrio = new JButton("I am cold");
				btnTengoFrio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am cold");
				        voice.deallocate();
					}
				});
				btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoFrio.setBounds(30, 30, 190, 110);
				panel8.add(btnTengoFrio);
				
				JButton btnTengoCalor = new JButton("I am hot");
				btnTengoCalor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I am hot");
				        voice.deallocate();
					}
				});
				btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoCalor.setBounds(240, 30, 190, 110);
				panel8.add(btnTengoCalor);
				
				JButton btnEstaFrio = new JButton("It is cold");
				btnEstaFrio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("It is cold");
				        voice.deallocate();
					}
				});
				btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaFrio.setBounds(30, 150, 190, 110);
				panel8.add(btnEstaFrio);
				
				JButton btnEstaCaliente = new JButton("It is hot");
				btnEstaCaliente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("It is hot");
				        voice.deallocate();
					}
				});
				btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaCaliente.setBounds(240, 150, 190, 110);
				panel8.add(btnEstaCaliente);
				
				JPanel panel9 = new JPanel();
				panel9.setBounds(0, 561, 1904, 10);
				contentPane.add(panel9);
				
				JPanel panel10 = new JPanel();
				panel10.setLayout(null);
				panel10.setBounds(0, 571, 1904, 330);
				contentPane.add(panel10);
				
				JLabel lblOcio = new JLabel("Leisure");
				lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblOcio.setBounds(20, 0, 150, 30);
				panel10.add(lblOcio);
				
				JButton btnPaseo = new JButton("I would like to take a walk");
				btnPaseo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to take a walk");
				        voice.deallocate();
					}
				});
				btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnPaseo.setBounds(20, 30, 608, 60);
				panel10.add(btnPaseo);
				
				JButton btnTele = new JButton("I would like to watch something on the tv");
				btnTele.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to watch something on the tv");
				        voice.deallocate();

					}
				});
				btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTele.setBounds(20, 100, 608, 60);
				panel10.add(btnTele);
				
				JButton btnComputadora = new JButton("I would like to watch something on the pc");
				btnComputadora.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to watch something on the pc");
				        voice.deallocate();

					}
				});
				btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnComputadora.setBounds(20, 170, 608, 60);
				panel10.add(btnComputadora);
				
				JButton btnTablet = new JButton("I would like to watch something on the tablet");
				btnTablet.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to watch something on the tablet");
				        voice.deallocate();
					}
				});
				btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTablet.setBounds(20, 240, 608, 60);
				panel10.add(btnTablet);
				
				JButton btnRadio = new JButton("I would like to listen to the radio");
				btnRadio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to listen to the radio");
				        voice.deallocate();
					}
				});
				btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRadio.setBounds(648, 30, 608, 60);
				panel10.add(btnRadio);
				
				JButton btnMusica = new JButton("I would like to listen to music");
				btnMusica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to listen to music");
				        voice.deallocate();
					}
				});
				btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnMusica.setBounds(648, 100, 608, 60);
				panel10.add(btnMusica);
				
				JButton btnAudiolibro = new JButton("I would like to listen to an audiobook");
				btnAudiolibro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to listen to an audiobook");
				        voice.deallocate();
					}
				});
				btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnAudiolibro.setBounds(648, 170, 608, 60);
				panel10.add(btnAudiolibro);
				
				JButton btnLibro = new JButton("I would like you to read me a book");
				btnLibro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like you to read me a book");
				        voice.deallocate();
					}
				});
				btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnLibro.setBounds(648, 240, 608, 60);
				panel10.add(btnLibro);
				
				JButton btnRopa = new JButton("I would like to change my clothes");
				btnRopa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to change my clothes");
				        voice.deallocate();
					}
				});
				btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRopa.setBounds(1276, 30, 608, 60);
				panel10.add(btnRopa);
				
				JButton btnCine = new JButton("I would like to go to the cinema");
				btnCine.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to go to the cinema");
				        voice.deallocate();
					}
				});
				btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnCine.setBounds(1276, 100, 608, 60);
				panel10.add(btnCine);
				
				JButton btnSalirAComer = new JButton("I would like to go out to eat");
				btnSalirAComer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to go out to eat");
				        voice.deallocate();
					}
				});
				btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSalirAComer.setBounds(1276, 170, 608, 60);
				panel10.add(btnSalirAComer);
				
				JButton btnJugar = new JButton("I would like to play something");
				btnJugar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
						Voice voice;
				        VoiceManager voiceManager = VoiceManager.getInstance();
				        voice = voiceManager.getVoice("kevin16");
				        voice.allocate();
				        voice.speak("I would like to play something");
				        voice.deallocate();
					}
				});
				btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnJugar.setBounds(1276, 240, 608, 60);
				panel10.add(btnJugar);
				
				JPanel panel11 = new JPanel();
				panel11.setBounds(0, 901, 1904, 10);
				contentPane.add(panel11);
				
				JPanel panel12 = new JPanel();
				panel12.setLayout(null);
				panel12.setBounds(0, 911, 947, 120);
				contentPane.add(panel12);
				
				JButton btnConfiguracion = new JButton("Configuration");
				btnConfiguracion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Configuracion con = new Configuracion();
						con.setVisible(true);
						dispose();
					}
				});
				btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnConfiguracion.setBounds(170, 30, 608, 60);
				panel12.add(btnConfiguracion);
				
				JPanel panel13 = new JPanel();
				panel13.setBounds(947, 911, 10, 120);
				contentPane.add(panel13);
				
				JPanel panel14 = new JPanel();
				panel14.setLayout(null);
				panel14.setBounds(957, 911, 947, 120);
				contentPane.add(panel14);
				
				JButton btnEmergencias = new JButton("Emergencies");
				btnEmergencias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Emergencias em = new Emergencias();
						em.setVisible(true);
						dispose();
					}
				});
				btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEmergencias.setBounds(169, 30, 608, 60);
				panel14.add(btnEmergencias);
				
				JPanel panel15 = new JPanel();
				panel15.setBounds(0, 1031, 1904, 10);
				contentPane.add(panel15);
				
				
			}
			
		}
		
	}

	public Main_1() {            //Constructor vacío que abre por defecto el primer tamaño en español
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 520, 47);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(520, 0, 266, 73);
		contentPane.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(10, 47, 510, 144);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(520, 73, 256, 42);
		contentPane.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(10, 192, 510, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(520, 115, 256, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(10, 202, 510, 112);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JPanel panel8 = new JPanel();
		panel8.setBounds(520, 124, 256, 190);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JPanel panel9 = new JPanel();
		panel9.setBounds(10, 314, 766, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setBounds(10, 325, 766, 172);
		contentPane.add(panel10);
		panel10.setLayout(null);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(10, 498, 766, 10);
		contentPane.add(panel11);

		JPanel panel12 = new JPanel();
		panel12.setBounds(10, 508, 378, 44);
		contentPane.add(panel12);
		panel12.setLayout(null);

		JPanel panel13 = new JPanel();
		panel13.setBounds(387, 508, 10, 44);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setBounds(398, 508, 378, 44);
		contentPane.add(panel14);
		panel14.setLayout(null);
		
		JPanel panel15 = new JPanel();
		panel15.setBounds(0, 47, 10, 516);
		contentPane.add(panel15);
		
		JPanel panel16 = new JPanel();
		panel16.setBounds(776, 73, 10, 490);
		contentPane.add(panel16);
		
		JPanel panel17 = new JPanel();
		panel17.setBounds(10, 553, 766, 10);
		contentPane.add(panel17);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblDialogosHabituales.setBounds(10, 0, 160, 24);
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
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnHambre.setBounds(10, 32, 240, 30);
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
		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSed.setBounds(10, 68, 240, 30);
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
		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSuenio.setBounds(10, 104, 240, 30);
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
		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnDientes.setBounds(260, 32, 240, 30);
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
		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBanio.setBounds(260, 68, 240, 30);
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
		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBaniar.setBounds(260, 104, 240, 30);
		panel3.add(btnBaniar);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setBounds(118, 8, 140, 30);
		panel14.add(btnEmergencias);
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setBounds(10, 0, 130, 24);
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
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
		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnPaseo.setBounds(14, 23, 240, 30);
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
		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnTele.setBounds(14, 59, 240, 30);
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
		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnComputadora.setBounds(14, 95, 240, 30);
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
		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnTablet.setBounds(14, 131, 240, 30);
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
		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnRadio.setBounds(264, 23, 240, 30);
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
		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnMusica.setBounds(264, 59, 240, 30);
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
		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnAudiolibro.setBounds(264, 95, 240, 30);
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
		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnLibro.setBounds(264, 131, 240, 30);
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
		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnRopa.setBounds(514, 23, 240, 30);
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
		btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnCine.setBounds(514, 59, 240, 30);
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
		btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnSalirAComer.setBounds(514, 95, 240, 30);
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
		btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnJugar.setBounds(514, 131, 240, 30);
		panel10.add(btnJugar);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setBounds(118, 8, 140, 30);
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		panel12.add(btnConfiguracion);
			
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setBounds(10, 0, 153, 19);
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel7.add(lblRespuestas);
		
		JButton btnSi = new JButton("Sí");
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
		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNo.setBounds(112, 30, 89, 70);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No sé");
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
		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTalVez.setBounds(310, 30, 89, 70);
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
		btnGracias.setBounds(409, 30, 89, 70);
		panel7.add(btnGracias);
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblTemperatura.setBounds(10, 0, 153, 24);
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
		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoFrio.setBounds(5, 30, 118, 70);
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
		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoCalor.setBounds(128, 30, 123, 70);
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
		btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnEstaFrio.setBounds(5, 109, 118, 70);
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
		btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnEstaCaliente.setBounds(128, 109, 123, 70);
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
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton.setBounds(40, 6, 176, 30);
		panel4.add(btnNewButton);
		
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
