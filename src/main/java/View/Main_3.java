package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Main_3 extends JFrame {

	//El código de esta ventana no se utiliza porque decidimos copiarlo al Main_1 dentro un if
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_3 frame = new Main_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	public Main_3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main_1.class.getResource("/Images/solidar_icono.png")));
		
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 0, 139));
		panel1.setBounds(0, 0, 1444, 111);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 0, 139));
		panel2.setBounds(1444, 0, 460, 161);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main_3.class.getResource("/Images/solidar_logo_reducido_Main_3.png")));
		lblLogo.setBounds(0, 0, 460, 161);
		panel2.add(lblLogo);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel3.setBackground(new Color(135, 206, 250));
		panel3.setLayout(null);
		panel3.setBounds(0, 111, 1434, 270);
		contentPane.add(panel3);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel4.setBackground(new Color(135, 206, 250));
		panel4.setLayout(null);
		panel4.setBounds(1444, 161, 460, 100);
		contentPane.add(panel4);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(65, 105, 225));
		panel5.setBounds(0, 381, 1434, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(65, 105, 225));
		panel6.setBounds(1444, 261, 460, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel7.setBackground(new Color(135, 206, 250));
		panel7.setLayout(null);
		panel7.setBounds(0, 391, 1434, 170);
		contentPane.add(panel7);
		
		JPanel panel8 = new JPanel();
		panel8.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel8.setBackground(new Color(135, 206, 250));
		panel8.setLayout(null);
		panel8.setBounds(1444, 271, 460, 290);
		contentPane.add(panel8);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(new Color(65, 105, 225));
		panel9.setBounds(0, 561, 1904, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel10.setBackground(new Color(135, 206, 250));
		panel10.setLayout(null);
		panel10.setBounds(0, 571, 1904, 330);
		contentPane.add(panel10);
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(new Color(65, 105, 225));
		panel11.setBounds(0, 901, 1904, 10);
		contentPane.add(panel11);
		
		JPanel panel12 = new JPanel();
		panel12.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel12.setBackground(new Color(135, 206, 250));
		panel12.setLayout(null);
		panel12.setBounds(0, 911, 947, 120);
		contentPane.add(panel12);
		
		JPanel panel13 = new JPanel();
		panel13.setBackground(new Color(65, 105, 225));
		panel13.setBounds(947, 911, 10, 120);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel14.setBackground(new Color(135, 206, 250));
		panel14.setLayout(null);
		panel14.setBounds(957, 911, 947, 120);
		contentPane.add(panel14);
		
		JPanel panel15 = new JPanel();
		panel15.setBackground(new Color(65, 105, 225));
		panel15.setBounds(0, 1031, 1904, 10);
		contentPane.add(panel15);
		
		JPanel panel16 = new JPanel();
		panel16.setBackground(new Color(65, 105, 225));
		panel16.setBounds(1434, 111, 10, 450);
		contentPane.add(panel16);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 26));
		lblDialogosHabituales.setBounds(20, 2, 270, 30);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");
		btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnHambre.setBackground(new Color(240, 248, 255));
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
		btnHambre.setBounds(75, 35, 620, 60);
		panel3.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo sed");
		btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnSed.setBackground(new Color(240, 248, 255));
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
		btnSed.setBounds(75, 105, 620, 60);
		panel3.add(btnSed);
		
		JButton btnSuenio = new JButton("Tengo sueño");
		btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnSuenio.setBackground(new Color(240, 248, 255));
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
		btnSuenio.setBounds(75, 175, 620, 60);
		panel3.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero lavarme los dientes");
		btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnDientes.setBackground(new Color(240, 248, 255));
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
		btnDientes.setBounds(739, 35, 620, 60);
		panel3.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al baño");
		btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnBanio.setBackground(new Color(240, 248, 255));
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
		btnBanio.setBounds(739, 105, 620, 60);
		panel3.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero bañarme");
		btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnBaniar.setBackground(new Color(240, 248, 255));
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
		btnBaniar.setBounds(739, 175, 620, 60);
		panel3.add(btnBaniar);

		JButton btnTecladoEnPantalla = new JButton("Teclado en pantalla");
		btnTecladoEnPantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        try {
		        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }


			}
		});
		btnTecladoEnPantalla.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnTecladoEnPantalla.setBackground(new Color(240, 248, 255));
		
		btnTecladoEnPantalla.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
		btnTecladoEnPantalla.setBounds(30, 20, 400, 60);
		panel4.add(btnTecladoEnPantalla);

		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 26));
		lblRespuestas.setBounds(20, 0, 153, 30);
		panel7.add(lblRespuestas);
		
		JButton btnSi = new JButton("Sí");
		btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnSi.setBackground(new Color(240, 248, 255));
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
		btnSi.setBounds(96, 30, 190, 110);
		panel7.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnNo.setBackground(new Color(240, 248, 255));
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
		btnNo.setBounds(359, 30, 190, 110);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No sé");
		btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnNoSe.setBackground(new Color(240, 248, 255));
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
		btnNoSe.setBounds(622, 30, 190, 110);
		panel7.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal vez");
		btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnTalVez.setBackground(new Color(240, 248, 255));
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
		btnTalVez.setBounds(885, 30, 190, 110);
		panel7.add(btnTalVez);
		
		JButton btnGracias = new JButton("Gracias!");
		btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnGracias.setBackground(new Color(240, 248, 255));
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
		btnGracias.setBounds(1148, 30, 180, 110);
		panel7.add(btnGracias);

		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
		lblTemperatura.setBounds(20, 0, 150, 30);
		panel8.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo frio");
		btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnTengoFrio.setBackground(new Color(240, 248, 255));
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
		btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnTengoCalor.setBackground(new Color(240, 248, 255));
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
		btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnEstaFrio.setBackground(new Color(240, 248, 255));
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
		btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnEstaCaliente.setBackground(new Color(240, 248, 255));
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

		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 26));
		lblOcio.setBounds(20, 0, 150, 30);
		panel10.add(lblOcio);
		
		JButton btnPaseo = new JButton("Quisiera dar un paseo");
		btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnPaseo.setBackground(new Color(240, 248, 255));
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
		btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnTele.setBackground(new Color(240, 248, 255));
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
		btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnComputadora.setBackground(new Color(240, 248, 255));
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
		btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnTablet.setBackground(new Color(240, 248, 255));
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
		btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnRadio.setBackground(new Color(240, 248, 255));
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
		btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnMusica.setBackground(new Color(240, 248, 255));
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
		btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnAudiolibro.setBackground(new Color(240, 248, 255));
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
		btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnLibro.setBackground(new Color(240, 248, 255));
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
		btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnRopa.setBackground(new Color(240, 248, 255));
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
		btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnCine.setBackground(new Color(240, 248, 255));
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
		btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnSalirAComer.setBackground(new Color(240, 248, 255));
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
		btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnJugar.setBackground(new Color(240, 248, 255));
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

		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnConfiguracion.setBackground(new Color(240, 248, 255));
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

		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
		btnEmergencias.setBackground(new Color(240, 248, 255));
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
		
	}
}
