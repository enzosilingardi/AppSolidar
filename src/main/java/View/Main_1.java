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
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Dimension;

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
		//Setea el icono de la pantalla
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main_1.class.getResource("/Images/solidar_icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 0, 139));
		panel1.setBounds(0, 0, 525, 47);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 0, 139));
		panel2.setBorder(null);
		panel2.setForeground(new Color(255, 255, 255));
		panel2.setBounds(525, 0, 261, 73);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main_1.class.getResource("/Images/solidar_logo_reducido_Main_1.png")));
		lblLogo.setBounds(0, 0, 261, 73);
		panel2.add(lblLogo);
		
		JPanel panel3 = new JPanel();
		panel3.setForeground(new Color(51, 153, 255));
		panel3.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel3.setBackground(new Color(135, 206, 250));
		panel3.setBounds(0, 47, 515, 144);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setForeground(new Color(51, 153, 255));
		panel4.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel4.setBackground(new Color(135, 206, 250));
		panel4.setBounds(525, 73, 261, 42);
		contentPane.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(65, 105, 225));
		panel5.setBounds(0, 191, 515, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(65, 105, 225));
		panel6.setBounds(525, 115, 261, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setForeground(new Color(51, 153, 255));
		panel7.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel7.setBackground(new Color(135, 206, 250));
		panel7.setBounds(0, 201, 515, 113);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JPanel panel8 = new JPanel();
		panel8.setForeground(new Color(51, 153, 255));
		panel8.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel8.setBackground(new Color(135, 206, 250));
		panel8.setBounds(525, 125, 261, 189);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(new Color(65, 105, 225));
		panel9.setBounds(0, 314, 786, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setForeground(new Color(51, 153, 255));
		panel10.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel10.setBackground(new Color(135, 206, 250));
		panel10.setBounds(0, 324, 786, 172);
		contentPane.add(panel10);
		panel10.setLayout(null);
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(new Color(65, 105, 225));
		panel11.setBounds(0, 496, 786, 10);
		contentPane.add(panel11);

		JPanel panel12 = new JPanel();
		panel12.setForeground(new Color(51, 153, 255));
		panel12.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel12.setBackground(new Color(135, 206, 250));
		panel12.setBounds(0, 506, 388, 46);
		contentPane.add(panel12);
		panel12.setLayout(null);

		JPanel panel13 = new JPanel();
		panel13.setBackground(new Color(65, 105, 225));
		panel13.setBounds(388, 506, 10, 46);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setForeground(new Color(51, 153, 255));
		panel14.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel14.setBackground(new Color(135, 206, 250));
		panel14.setBounds(398, 506, 388, 46);
		contentPane.add(panel14);
		panel14.setLayout(null);
		
		JPanel panel15 = new JPanel();
		panel15.setBackground(new Color(65, 105, 225));
		panel15.setBounds(0, 552, 786, 9);
		contentPane.add(panel15);
		
		JPanel panel16 = new JPanel();
		panel16.setBackground(new Color(65, 105, 225));
		panel16.setBounds(515, 47, 10, 267);
		contentPane.add(panel16);
		
		if (idioma.equals("esp")) {            // If que verifica si el idioma seleccionado es español
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblDialogosHabituales.setBounds(10, 0, 160, 24);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");              // Boton text-to-Speech
		btnHambre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");  // Setea las propiedades de la voz
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();        //Prepara la instancia de voz
		        voice = voiceManager.getVoice("kevin16");                     //Utiliza la voz "kevin16"
		        voice.allocate();
		        voice.speak("tehng-goh ahm-breh");                           //Dice la frase seleccionada
		        voice.deallocate();
			}
		});
		btnHambre.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnHambre.setBackground(new Color(240, 248, 255));
		btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnHambre.setBounds(15, 32, 240, 30);
		panel3.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo sed");              //Igual que en el botón "Tengo hambre"
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
		btnSed.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSed.setBackground(new Color(240, 248, 255));
		btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 14));     
		btnSed.setBounds(15, 68, 240, 30);
		panel3.add(btnSed);
		 
		JButton btnSuenio = new JButton("Tengo sueño");         //Igual que en el botón "Tengo hambre"
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
		btnSuenio.setBackground(new Color(240, 248, 255));
		btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSuenio.setBounds(15, 104, 240, 30);
		panel3.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero lavarme los dientes");      //Igual que en el botón "Tengo hambre"	
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
		btnDientes.setBackground(new Color(240, 248, 255));
		btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnDientes.setBounds(265, 32, 240, 30);
		panel3.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al baño");			 //Igual que en el botón "Tengo hambre"
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
		btnBanio.setBackground(new Color(240, 248, 255));
		btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBanio.setBounds(265, 68, 240, 30);
		panel3.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero bañarme");			 //Igual que en el botón "Tengo hambre"
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
		btnBaniar.setBackground(new Color(240, 248, 255));
		btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnBaniar.setBounds(265, 104, 240, 30);
		panel3.add(btnBaniar);
		
		JButton btnEmergencias = new JButton("Emergencias");				 //Igual que en el botón "Tengo hambre"
		btnEmergencias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnEmergencias.setBackground(new Color(240, 248, 255));
		btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
		btnEmergencias.setBounds(123, 8, 140, 30);
		panel14.add(btnEmergencias);
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setBounds(10, 0, 130, 24);
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel10.add(lblOcio);
		
		JButton btnPaseo = new JButton("Quisiera dar un paseo");				 //Igual que en el botón "Tengo hambre"
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
		btnPaseo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnPaseo.setBackground(new Color(240, 248, 255));
		btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnPaseo.setBounds(16, 23, 240, 30);
		panel10.add(btnPaseo);
		
		JButton btnTele = new JButton("Quisiera ver algo en la tele");				 //Igual que en el botón "Tengo hambre"
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
		btnTele.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTele.setBackground(new Color(240, 248, 255));
		btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnTele.setBounds(16, 59, 240, 30);
		panel10.add(btnTele);
		
		JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");					 //Igual que en el botón "Tengo hambre"
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
		btnComputadora.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnComputadora.setBackground(new Color(240, 248, 255));
		btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnComputadora.setBounds(16, 95, 240, 30);
		panel10.add(btnComputadora);
		
		JButton btnTablet = new JButton("Quisiera ver algo en la tablet");					 //Igual que en el botón "Tengo hambre"
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
		btnTablet.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTablet.setBackground(new Color(240, 248, 255));
		btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnTablet.setBounds(16, 131, 240, 30);
		panel10.add(btnTablet);
		
		JButton btnRadio = new JButton("Quisiera escuchar radio");				 //Igual que en el botón "Tengo hambre"
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
		btnRadio.setBackground(new Color(240, 248, 255));
		btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnRadio.setBounds(273, 23, 240, 30);
		panel10.add(btnRadio);
		
		JButton btnMusica = new JButton("Quisiera escuchar música");				 //Igual que en el botón "Tengo hambre"
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
		btnMusica.setBackground(new Color(240, 248, 255));
		btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnMusica.setBounds(273, 59, 240, 30);
		panel10.add(btnMusica);
		
		JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");				 //Igual que en el botón "Tengo hambre"
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
		btnAudiolibro.setBackground(new Color(240, 248, 255));
		btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnAudiolibro.setBounds(273, 95, 240, 30);
		panel10.add(btnAudiolibro);
		
		JButton btnLibro = new JButton("Quisiera que me lean un libro");			 //Igual que en el botón "Tengo hambre"
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
		btnLibro.setBackground(new Color(240, 248, 255));
		btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnLibro.setBounds(273, 131, 240, 30);
		panel10.add(btnLibro);
		
		JButton btnRopa = new JButton("Quisiera cambiarme de ropa");			 //Igual que en el botón "Tengo hambre"
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
		btnRopa.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnRopa.setBackground(new Color(240, 248, 255));
		btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnRopa.setBounds(530, 23, 240, 30);
		panel10.add(btnRopa);
		
		JButton btnCine = new JButton("Quisiera ir al cine");					 //Igual que en el botón "Tengo hambre"
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
		btnCine.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnCine.setBackground(new Color(240, 248, 255));
		btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnCine.setBounds(530, 59, 240, 30);
		panel10.add(btnCine);
		
		JButton btnSalirAComer = new JButton("Quisiera salir a comer");				 //Igual que en el botón "Tengo hambre"
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
		btnSalirAComer.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSalirAComer.setBackground(new Color(240, 248, 255));
		btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnSalirAComer.setBounds(530, 95, 240, 30);
		panel10.add(btnSalirAComer);
		
		JButton btnJugar = new JButton("Quisiera jugar a algo");			 //Igual que en el botón "Tengo hambre"
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
		btnJugar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnJugar.setBackground(new Color(240, 248, 255));
		btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnJugar.setBounds(530, 131, 240, 30);
		panel10.add(btnJugar);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnConfiguracion.setBackground(new Color(240, 248, 255));
		btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnConfiguracion.setBounds(123, 8, 140, 30);
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		panel12.add(btnConfiguracion);
			
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setBounds(10, 0, 153, 19);
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel7.add(lblRespuestas);
		
		JButton btnSi = new JButton("Si");             //Igual que en el botón "Tengo hambre"
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
		btnSi.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSi.setBackground(new Color(240, 248, 255));
		btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnSi.setBounds(13, 30, 89, 70);
		panel7.add(btnSi);
		
		JButton btnNo = new JButton("No");			 	//Igual que en el botón "Tengo hambre"
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
		btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNo.setBackground(new Color(240, 248, 255));
		btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNo.setBounds(114, 30, 89, 70);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No se");				 //Igual que en el botón "Tengo hambre"
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
		btnNoSe.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNoSe.setBackground(new Color(240, 248, 255));
		btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNoSe.setBounds(215, 30, 89, 70);
		panel7.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal vez");			 //Igual que en el botón "Tengo hambre"
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
		btnTalVez.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTalVez.setBackground(new Color(240, 248, 255));
		btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTalVez.setBounds(316, 30, 89, 70);
		panel7.add(btnTalVez);
		
		JButton btnGracias = new JButton("Gracias!");			 //Igual que en el botón "Tengo hambre"
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
		btnGracias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnGracias.setBackground(new Color(240, 248, 255));
		btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnGracias.setBounds(417, 30, 89, 70);
		panel7.add(btnGracias);
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblTemperatura.setBounds(10, 0, 153, 24);
		panel8.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo frio");			 //Igual que en el botón "Tengo hambre"
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
		btnTengoFrio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTengoFrio.setBackground(new Color(240, 248, 255));
		btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoFrio.setBounds(10, 30, 118, 70);
		panel8.add(btnTengoFrio);
			
		JButton btnTengoCalor = new JButton("Tengo calor");			 //Igual que en el botón "Tengo hambre"
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
		btnTengoCalor.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTengoCalor.setBackground(new Color(240, 248, 255));
		btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTengoCalor.setBounds(133, 30, 123, 70);
		panel8.add(btnTengoCalor);
		
		JButton btnEstaFrio = new JButton("Está frio");			 //Igual que en el botón "Tengo hambre"
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
		btnEstaFrio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnEstaFrio.setBackground(new Color(240, 248, 255));
		btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnEstaFrio.setBounds(10, 109, 118, 70);
		panel8.add(btnEstaFrio);
		
		JButton btnEstaCaliente = new JButton("Está caliente");			 //Igual que en el botón "Tengo hambre"
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
		btnEstaCaliente.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnEstaCaliente.setBackground(new Color(240, 248, 255));
		btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnEstaCaliente.setBounds(133, 109, 123, 70);
		panel8.add(btnEstaCaliente);
		
		JButton btnTecladoEnPantalla = new JButton("Teclado en pantalla");        //Botón que abre el teclado en pantalla
		btnTecladoEnPantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        try {
		        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");    //Envía a cmd el comando para ejecutar el teclado en pantalla
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }


			}
		});
		btnTecladoEnPantalla.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTecladoEnPantalla.setBackground(new Color(240, 248, 255));
		btnTecladoEnPantalla.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

		btnTecladoEnPantalla.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnTecladoEnPantalla.setBounds(45, 6, 176, 30);
		panel4.add(btnTecladoEnPantalla);
		
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
			
			JButton btnHambre = new JButton("I am hungry");			 //Igual que en el botón "Tengo hambre"
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
			btnHambre.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnHambre.setBackground(new Color(240, 248, 255));
			btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnHambre.setBounds(15, 32, 240, 30);
			panel3.add(btnHambre);
			
			JButton btnSed = new JButton("I am thirsty");			 //Igual que en el botón "Tengo hambre"
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
			btnSed.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnSed.setBackground(new Color(240, 248, 255));
			btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnSed.setBounds(15, 68, 240, 30);
			panel3.add(btnSed);
			
			JButton btnSuenio = new JButton("I am sleepy");			 //Igual que en el botón "Tengo hambre"
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
			btnSuenio.setBackground(new Color(240, 248, 255));
			btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnSuenio.setBounds(15, 104, 240, 30);
			panel3.add(btnSuenio);
			
			JButton btnDientes = new JButton("I want to brush my teeth");			 //Igual que en el botón "Tengo hambre"
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
			btnDientes.setBackground(new Color(240, 248, 255));
			btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnDientes.setBounds(265, 32, 240, 30);
			panel3.add(btnDientes);
			
			JButton btnBanio = new JButton("I want to go to the bathroom");			 //Igual que en el botón "Tengo hambre"
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
			btnBanio.setBackground(new Color(240, 248, 255));
			btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnBanio.setBounds(265, 68, 240, 30);
			panel3.add(btnBanio);
			
			JButton btnBaniar = new JButton("I want to bathe");			 //Igual que en el botón "Tengo hambre"
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
			btnBaniar.setBackground(new Color(240, 248, 255));
			btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnBaniar.setBounds(265, 104, 240, 30);
			panel3.add(btnBaniar);
			
			JButton btnEmergencias = new JButton("Emergencies");
			btnEmergencias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnEmergencias.setBackground(new Color(240, 248, 255));
			btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnEmergencias.setBounds(123, 8, 140, 30);
			panel14.add(btnEmergencias);
			btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			
			JLabel lblOcio = new JLabel("Leisure");
			lblOcio.setBounds(10, 0, 130, 24);
			lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			panel10.add(lblOcio);
			
			JButton btnPaseo = new JButton("I would like to take a walk");		 //Igual que en el botón "Tengo hambre"
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
			btnPaseo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnPaseo.setBackground(new Color(240, 248, 255));
			btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnPaseo.setBounds(16, 23, 240, 30);
			panel10.add(btnPaseo);
			
			JButton btnTele = new JButton("I would like to watch something on the tv");			 //Igual que en el botón "Tengo hambre"
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
			btnTele.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnTele.setBackground(new Color(240, 248, 255));
			btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnTele.setBounds(16, 59, 240, 30);
			panel10.add(btnTele);
			
			JButton btnComputadora = new JButton("I would like to watch something on the pc");			 //Igual que en el botón "Tengo hambre"
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
			btnComputadora.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnComputadora.setBackground(new Color(240, 248, 255));
			btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnComputadora.setBounds(16, 95, 240, 30);
			panel10.add(btnComputadora);
			
			JButton btnTablet = new JButton("I would like to watch something on the tablet");			 //Igual que en el botón "Tengo hambre"
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
			btnTablet.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnTablet.setBackground(new Color(240, 248, 255));
			btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnTablet.setBounds(16, 131, 240, 30);
			panel10.add(btnTablet);
			
			JButton btnRadio = new JButton("I would like to listen to the radio");			 //Igual que en el botón "Tengo hambre"
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
			btnRadio.setBackground(new Color(240, 248, 255));
			btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnRadio.setBounds(273, 23, 240, 30);
			panel10.add(btnRadio);
			
			JButton btnMusica = new JButton("I would like to listen to music");			 //Igual que en el botón "Tengo hambre"
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
			btnMusica.setBackground(new Color(240, 248, 255));
			btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnMusica.setBounds(273, 59, 240, 30);
			panel10.add(btnMusica);
			
			JButton btnAudiolibro = new JButton("I would like to listen to an audiobook");			 //Igual que en el botón "Tengo hambre"
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
			btnAudiolibro.setBackground(new Color(240, 248, 255));
			btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnAudiolibro.setBounds(273, 95, 240, 30);
			panel10.add(btnAudiolibro);
			
			JButton btnLibro = new JButton("I would like you to read me a book");			 //Igual que en el botón "Tengo hambre"
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
			btnLibro.setBackground(new Color(240, 248, 255));
			btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnLibro.setBounds(273, 131, 240, 30);
			panel10.add(btnLibro);
			
			JButton btnRopa = new JButton("I would like to change my clothes");			 //Igual que en el botón "Tengo hambre"
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
			btnRopa.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnRopa.setBackground(new Color(240, 248, 255));
			btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnRopa.setBounds(530, 23, 240, 30);
			panel10.add(btnRopa);
			
			JButton btnCine = new JButton("I would like to go to the cinema");			 //Igual que en el botón "Tengo hambre"
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
			btnCine.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnCine.setBackground(new Color(240, 248, 255));
			btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnCine.setBounds(530, 59, 240, 30);
			panel10.add(btnCine);
			
			JButton btnSalirAComer = new JButton("I would like to go out to eat");			 //Igual que en el botón "Tengo hambre"
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
			btnSalirAComer.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnSalirAComer.setBackground(new Color(240, 248, 255));
			btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnSalirAComer.setBounds(530, 95, 240, 30);
			panel10.add(btnSalirAComer);
			
			JButton btnJugar = new JButton("I would like to play something");			 //Igual que en el botón "Tengo hambre"
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
			btnJugar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnJugar.setBackground(new Color(240, 248, 255));
			btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 10));
			btnJugar.setBounds(530, 131, 240, 30);
			panel10.add(btnJugar);
			
			JButton btnConfiguracion = new JButton("Configuration");
			btnConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnConfiguracion.setBackground(new Color(240, 248, 255));
			btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
			
			btnConfiguracion.setBounds(123, 8, 140, 30);
			btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			panel12.add(btnConfiguracion);
				
			JLabel lblRespuestas = new JLabel("Answers");
			lblRespuestas.setBounds(10, 0, 153, 19);
			lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			panel7.add(lblRespuestas);
			
			JButton btnSi = new JButton("Yes");				 //Igual que en el botón "Tengo hambre"
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
			btnSi.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnSi.setBackground(new Color(240, 248, 255));
			btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnSi.setBounds(13, 30, 89, 70);
			panel7.add(btnSi);
			
			JButton btnNo = new JButton("No");				 //Igual que en el botón "Tengo hambre"
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
			btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnNo.setBackground(new Color(240, 248, 255));
			btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnNo.setBounds(114, 30, 89, 70);
			panel7.add(btnNo);
			
			JButton btnNoSe = new JButton("<html><center>I don´t know</html>");			 //Igual que en el botón "Tengo hambre"
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
			btnNoSe.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnNoSe.setBackground(new Color(240, 248, 255));
			btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnNoSe.setBounds(215, 30, 89, 70);
			panel7.add(btnNoSe);
			
			JButton btnTalVez = new JButton("Maybe");			 //Igual que en el botón "Tengo hambre"
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
			btnTalVez.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnTalVez.setBackground(new Color(240, 248, 255));
			btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTalVez.setBounds(316, 30, 89, 70);
			panel7.add(btnTalVez);
			
			JButton btnGracias = new JButton("Thanks!");			 //Igual que en el botón "Tengo hambre"
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
			btnGracias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnGracias.setBackground(new Color(240, 248, 255));
			btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnGracias.setBounds(417, 30, 89, 70);
			panel7.add(btnGracias);
			btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			
			JLabel lblTemperatura = new JLabel("Temperature");
			lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
			lblTemperatura.setBounds(10, 0, 153, 24);
			panel8.add(lblTemperatura);
			
			JButton btnTengoFrio = new JButton("I am cold");		 //Igual que en el botón "Tengo hambre"
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
			btnTengoFrio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnTengoFrio.setBackground(new Color(240, 248, 255));
			btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTengoFrio.setBounds(10, 30, 118, 70);
			panel8.add(btnTengoFrio);
			
			JButton btnTengoCalor = new JButton("I am hot");		 //Igual que en el botón "Tengo hambre"
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
			btnTengoCalor.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnTengoCalor.setBackground(new Color(240, 248, 255));
			btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTengoCalor.setBounds(133, 30, 123, 70);
			panel8.add(btnTengoCalor);
			
			JButton btnEstaFrio = new JButton("It is cold");			 //Igual que en el botón "Tengo hambre"
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
			btnEstaFrio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnEstaFrio.setBackground(new Color(240, 248, 255));
			btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnEstaFrio.setBounds(10, 109, 118, 70);
			panel8.add(btnEstaFrio);
			
			JButton btnEstaCaliente = new JButton("It is hot");			 //Igual que en el botón "Tengo hambre"
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
			btnEstaCaliente.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnEstaCaliente.setBackground(new Color(240, 248, 255));
			btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnEstaCaliente.setBounds(133, 109, 123, 70);
			panel8.add(btnEstaCaliente);
			
			JButton btnTecladoEnPantalla = new JButton("Virtual Keyboard");  //Botón que abre el teclado en pantalla
			btnTecladoEnPantalla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			        try {
			        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");   //Envía el comando a cmd para ejecutar el teclado en pantala
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }


				}
			});
			btnTecladoEnPantalla.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnTecladoEnPantalla.setBackground(new Color(240, 248, 255));
			btnTecladoEnPantalla.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTecladoEnPantalla.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			btnTecladoEnPantalla.setBounds(45, 6, 176, 30);
			panel4.add(btnTecladoEnPantalla);
			
			btnConfiguracion.addActionListener(new ActionListener() {     //Botón que abre la ventana Configuración
				public void actionPerformed(ActionEvent e) {
					Configuracion con = new Configuracion();
					con.setVisible(true);
					dispose();
				}
			});
			btnEmergencias.addActionListener(new ActionListener() {         //Botón que abre la ventana Emergencias
				public void actionPerformed(ActionEvent e) {
					Emergencias em = new Emergencias();
					em.setVisible(true);
					dispose();
				}
			});
		}
		
		}
		
		if (tamanio.equals("2")) {         // If que verifica si el tamaño seleccionado es el segundo
			
			if (idioma.equals("esp")) {     //If que verifica si el idioma seleccionado es el español
			//Setear icono de la ventana
			setIconImage(Toolkit.getDefaultToolkit().getImage(Main_1.class.getResource("/Images/solidar_icono.png")));
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1360, 768);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel1 = new JPanel();
			panel1.setBackground(new Color(0, 0, 139));
			panel1.setBounds(0, 0, 994, 74);
			contentPane.add(panel1);
			
			JPanel panel2 = new JPanel();
			panel2.setBackground(new Color(0, 0, 139));
			panel2.setBounds(994, 0, 350, 130);
			contentPane.add(panel2);
			panel2.setLayout(null);
			
			JLabel lblLogo = new JLabel("");
			lblLogo.setIcon(new ImageIcon(Main_2.class.getResource("/Images/solidar_logo_reducido_Main_2.png")));
			lblLogo.setBounds(0, 0, 350, 130);
			panel2.add(lblLogo);
			
			JPanel panel3 = new JPanel();
			panel3.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel3.setBackground(new Color(135, 206, 250));
			panel3.setLayout(null);
			panel3.setBounds(0, 74, 984, 210);
			contentPane.add(panel3);
			
			JPanel panel4 = new JPanel();
			panel4.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel4.setBackground(new Color(135, 206, 250));
			panel4.setLayout(null);
			panel4.setBounds(994, 130, 350, 60);
			contentPane.add(panel4);

			JPanel panel5 = new JPanel();
			panel5.setBackground(new Color(65, 105, 225));
			panel5.setBounds(0, 284, 984, 10);
			contentPane.add(panel5);
			
			JPanel panel6 = new JPanel();
			panel6.setBackground(new Color(65, 105, 225));
			panel6.setBounds(994, 190, 350, 10);
			contentPane.add(panel6);
			
			JPanel panel7 = new JPanel();
			panel7.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel7.setBackground(new Color(135, 206, 250));
			panel7.setLayout(null);
			panel7.setBounds(0, 294, 984, 120);
			contentPane.add(panel7);
			
			JPanel panel8 = new JPanel();
			panel8.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel8.setBackground(new Color(135, 206, 250));
			panel8.setLayout(null);
			panel8.setBounds(994, 200, 350, 214);
			contentPane.add(panel8);
			
			JPanel panel9 = new JPanel();
			panel9.setBackground(new Color(65, 105, 225));
			panel9.setBounds(0, 413, 1344, 10);
			contentPane.add(panel9);
			
			JPanel panel10 = new JPanel();
			panel10.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel10.setBackground(new Color(135, 206, 250));
			panel10.setLayout(null);
			panel10.setBounds(0, 423, 1344, 220);
			contentPane.add(panel10);
			
			JPanel panel11 = new JPanel();
			panel11.setBackground(new Color(65, 105, 225));
			panel11.setBounds(0, 719, 1344, 10);
			contentPane.add(panel11);
			
			JPanel panel12 = new JPanel();
			panel12.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel12.setBackground(new Color(135, 206, 250));
			panel12.setLayout(null);
			panel12.setBounds(0, 653, 667, 66);
			contentPane.add(panel12);
			
			JPanel panel13 = new JPanel();
			panel13.setBackground(new Color(65, 105, 225));
			panel13.setBounds(667, 653, 10, 66);
			contentPane.add(panel13);
			
			JPanel panel14 = new JPanel();
			panel14.setBorder(new LineBorder(new Color(25, 25, 112), 3));
			panel14.setBackground(new Color(135, 206, 250));
			panel14.setLayout(null);
			panel14.setBounds(677, 653, 667, 66);
			contentPane.add(panel14);
			
			JPanel panel15 = new JPanel();
			panel15.setBackground(new Color(65, 105, 225));
			panel15.setBounds(0, 643, 1344, 10);
			contentPane.add(panel15);
			
			JPanel panel16 = new JPanel();
			panel16.setBackground(new Color(65, 105, 225));
			panel16.setBounds(984, 74, 10, 340);
			contentPane.add(panel16);
			
			JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
			lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 18));
			lblDialogosHabituales.setBounds(30, 0, 230, 30);
			panel3.add(lblDialogosHabituales);
			
			JButton btnHambre = new JButton("Tengo hambre");      //Igual que en el primer botón "Tengo hambre"
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
			btnHambre.setBackground(new Color(240, 248, 255));
			btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnHambre.setBounds(25, 30, 458, 50);
			panel3.add(btnHambre);
			
			JButton btnSed = new JButton("Tengo sed");            //Igual que en el botón "Tengo hambre"
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
			btnSed.setBackground(new Color(240, 248, 255));
			btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSed.setBounds(25, 90, 458, 50);
			panel3.add(btnSed);
			
			JButton btnSuenio = new JButton("Tengo sueño");      //Igual que en el botón "Tengo hambre"
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
			btnSuenio.setBackground(new Color(240, 248, 255));
			btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSuenio.setBounds(25, 150, 458, 50);
			panel3.add(btnSuenio);
			
			JButton btnDientes = new JButton("Quiero lavarme los dientes");			 //Igual que en el botón "Tengo hambre"
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
			btnDientes.setBackground(new Color(240, 248, 255));
			btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnDientes.setBounds(503, 30, 458, 50);
			panel3.add(btnDientes);
			
			JButton btnBanio = new JButton("Quiero ir al baño");			 //Igual que en el botón "Tengo hambre"
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
			btnBanio.setBackground(new Color(240, 248, 255));
			btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnBanio.setBounds(503, 90, 458, 50);
			panel3.add(btnBanio);
			
			JButton btnBaniar = new JButton("Quiero bañarme");			 //Igual que en el botón "Tengo hambre"
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
			btnBaniar.setBackground(new Color(240, 248, 255));
			btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnBaniar.setBounds(503, 150, 458, 50);
			panel3.add(btnBaniar);
			
			JButton btnTecladoEnPantalla = new JButton("Teclado en pantalla");       //Botón que abre el teclado en pantalla
			btnTecladoEnPantalla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			        try {
			        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");		//Envía a cmd el comando para ejecutar el teclado en pantalla 
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }


				}
			});
			btnTecladoEnPantalla.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTecladoEnPantalla.setBounds(10, 5, 330, 50);
			panel4.add(btnTecladoEnPantalla);
			
			JLabel lblRespuestas = new JLabel("Respuestas");
			lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 18));
			lblRespuestas.setBounds(30, 0, 153, 30);
			panel7.add(lblRespuestas);
			
			JButton btnSi = new JButton("Sí");				 //Igual que en el botón "Tengo hambre"
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
			btnSi.setBackground(new Color(240, 248, 255));
			btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSi.setBounds(87, 30, 130, 82);
			panel7.add(btnSi);
			
			JButton btnNo = new JButton("No");				 //Igual que en el botón "Tengo hambre"
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
			btnNo.setBackground(new Color(240, 248, 255));
			btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnNo.setBounds(257, 30, 130, 82);
			panel7.add(btnNo);
			
			JButton btnNoSe = new JButton("No sé");				 //Igual que en el botón "Tengo hambre"
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
			btnNoSe.setBackground(new Color(240, 248, 255));
			btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnNoSe.setBounds(427, 30, 130, 82);
			panel7.add(btnNoSe);
			
			JButton btnTalVez = new JButton("Tal vez");				 //Igual que en el botón "Tengo hambre"
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
			btnTalVez.setBackground(new Color(240, 248, 255));
			btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTalVez.setBounds(597, 30, 130, 82);
			panel7.add(btnTalVez);
			
			JButton btnGracias = new JButton("Gracias!");			 //Igual que en el botón "Tengo hambre"
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
			btnGracias.setBackground(new Color(240, 248, 255));
			btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnGracias.setBounds(767, 30, 130, 82);
			panel7.add(btnGracias);
			
			JLabel lblTemperatura = new JLabel("Temperatura");
			lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 18));
			lblTemperatura.setBounds(10, 0, 150, 30);
			panel8.add(lblTemperatura);
			
			JButton btnTengoFrio = new JButton("Tengo frio");			 //Igual que en el botón "Tengo hambre"
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
			btnTengoFrio.setBackground(new Color(240, 248, 255));
			btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTengoFrio.setBounds(10, 30, 160, 80);
			panel8.add(btnTengoFrio);
			
			JButton btnTengoCalor = new JButton("Tengo calor");			 //Igual que en el botón "Tengo hambre"
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
			btnTengoCalor.setBackground(new Color(240, 248, 255));
			btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTengoCalor.setBounds(175, 30, 160, 80);
			panel8.add(btnTengoCalor);
			
			JButton btnEstaFrio = new JButton("Está frio");			 //Igual que en el botón "Tengo hambre"
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
			btnEstaFrio.setBackground(new Color(240, 248, 255));
			btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnEstaFrio.setBounds(10, 120, 160, 80);
			panel8.add(btnEstaFrio);
			
			JButton btnEstaCaliente = new JButton("Está caliente");			 //Igual que en el botón "Tengo hambre"
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
			btnEstaCaliente.setBackground(new Color(240, 248, 255));
			btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnEstaCaliente.setBounds(175, 120, 160, 80);
			panel8.add(btnEstaCaliente);
			
			JLabel lblOcio = new JLabel("Ocio");
			lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 18));
			lblOcio.setBounds(30, 0, 150, 30);
			panel10.add(lblOcio);
			
			JButton btnPaseo = new JButton("Quisiera dar un paseo");			 //Igual que en el botón "Tengo hambre"
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
			btnPaseo.setBackground(new Color(240, 248, 255));
			btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnPaseo.setBounds(31, 30, 414, 40);
			panel10.add(btnPaseo);
			
			JButton btnTele = new JButton("Quisiera ver algo en la tele");			 //Igual que en el botón "Tengo hambre"
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
			btnTele.setBackground(new Color(240, 248, 255));
			btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTele.setBounds(31, 75, 414, 40);
			panel10.add(btnTele);
			
			JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");			 //Igual que en el botón "Tengo hambre"
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
			btnComputadora.setBackground(new Color(240, 248, 255));
			btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnComputadora.setBounds(31, 120, 414, 40);
			panel10.add(btnComputadora);
			
			JButton btnTablet = new JButton("Quisiera ver algo en la tablet");			 //Igual que en el botón "Tengo hambre"
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
			btnTablet.setBackground(new Color(240, 248, 255));
			btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnTablet.setBounds(31, 165, 414, 40);
			panel10.add(btnTablet);
			
			JButton btnRadio = new JButton("Quisiera escuchar radio");			 //Igual que en el botón "Tengo hambre"
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
			btnRadio.setBackground(new Color(240, 248, 255));
			btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnRadio.setBounds(465, 30, 414, 40);
			panel10.add(btnRadio);
			
			JButton btnMusica = new JButton("Quisiera escuchar música");			 //Igual que en el botón "Tengo hambre"
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
			btnMusica.setBackground(new Color(240, 248, 255));
			btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnMusica.setBounds(465, 75, 414, 40);
			panel10.add(btnMusica);
			
			JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");			 //Igual que en el botón "Tengo hambre"
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
			btnAudiolibro.setBackground(new Color(240, 248, 255));
			btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnAudiolibro.setBounds(465, 120, 414, 40);
			panel10.add(btnAudiolibro);
			
			JButton btnLibro = new JButton("Quisiera que me lean un libro");			 //Igual que en el botón "Tengo hambre"
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
			btnLibro.setBackground(new Color(240, 248, 255));
			btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnLibro.setBounds(465, 165, 414, 40);
			panel10.add(btnLibro);
			
			JButton btnRopa = new JButton("Quisiera cambiarme de ropa");			 //Igual que en el botón "Tengo hambre"
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
			btnRopa.setBackground(new Color(240, 248, 255));
			btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnRopa.setBounds(899, 30, 414, 40);
			panel10.add(btnRopa);
			
			JButton btnCine = new JButton("Quisiera ir al cine");			 //Igual que en el botón "Tengo hambre"
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
			btnCine.setBackground(new Color(240, 248, 255));
			btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnCine.setBounds(899, 75, 414, 40);
			panel10.add(btnCine);
			
			JButton btnSalirAComer = new JButton("Quisiera salir a comer");			 //Igual que en el botón "Tengo hambre"
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
			btnSalirAComer.setBackground(new Color(240, 248, 255));
			btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnSalirAComer.setBounds(899, 120, 414, 40);
			panel10.add(btnSalirAComer);
			
			JButton btnJugar = new JButton("Quisiera jugar a algo");			 //Igual que en el botón "Tengo hambre"
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
			btnJugar.setBackground(new Color(240, 248, 255));
			btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnJugar.setBounds(899, 165, 414, 40);
			panel10.add(btnJugar);
			
			JButton btnConfiguracion = new JButton("Configuración");      //Botón que abre la ventana configuración
			btnConfiguracion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Configuracion con = new Configuracion();
					con.setVisible(true);
					dispose();
				}
			});
			btnConfiguracion.setBackground(new Color(240, 248, 255));
			btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnConfiguracion.setBounds(126, 13, 415, 40);
			panel12.add(btnConfiguracion);
			
			JButton btnEmergencias = new JButton("Emergencias");     //Botón que abre la ventana emergencias
			btnEmergencias.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Emergencias em = new Emergencias();
					em.setVisible(true);
					dispose();
				}
			});
			btnEmergencias.setBackground(new Color(240, 248, 255));
			btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

			btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
			btnEmergencias.setBounds(126, 13, 415, 40);
			panel14.add(btnEmergencias);
			
			}
			
			if (idioma.equals("ing")) {      //If que verifica si el idioma seleccionado es el inglés
				//Setear icono de la ventana
				setIconImage(Toolkit.getDefaultToolkit().getImage(Main_1.class.getResource("/Images/solidar_icono.png")));
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 1360, 768);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel1 = new JPanel();
				panel1.setBackground(new Color(0, 0, 139));
				panel1.setBounds(0, 0, 994, 74);
				contentPane.add(panel1);
				
				JPanel panel2 = new JPanel();
				panel2.setBackground(new Color(0, 0, 139));
				panel2.setBounds(994, 0, 350, 130);
				contentPane.add(panel2);
				panel2.setLayout(null);
				
				JLabel lblLogo = new JLabel("");
				lblLogo.setIcon(new ImageIcon(Main_2.class.getResource("/Images/solidar_logo_reducido_Main_2.png")));
				lblLogo.setBounds(0, 0, 350, 130);
				panel2.add(lblLogo);
				
				JPanel panel3 = new JPanel();
				panel3.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel3.setBackground(new Color(135, 206, 250));
				panel3.setLayout(null);
				panel3.setBounds(0, 74, 984, 210);
				contentPane.add(panel3);
				
				JPanel panel4 = new JPanel();
				panel4.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel4.setBackground(new Color(135, 206, 250));
				panel4.setLayout(null);
				panel4.setBounds(994, 130, 350, 60);
				contentPane.add(panel4);

				JPanel panel5 = new JPanel();
				panel5.setBackground(new Color(65, 105, 225));
				panel5.setBounds(0, 284, 984, 10);
				contentPane.add(panel5);
				
				JPanel panel6 = new JPanel();
				panel6.setBackground(new Color(65, 105, 225));
				panel6.setBounds(994, 190, 350, 10);
				contentPane.add(panel6);
				
				JPanel panel7 = new JPanel();
				panel7.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel7.setBackground(new Color(135, 206, 250));
				panel7.setLayout(null);
				panel7.setBounds(0, 294, 984, 120);
				contentPane.add(panel7);
				
				JPanel panel8 = new JPanel();
				panel8.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel8.setBackground(new Color(135, 206, 250));
				panel8.setLayout(null);
				panel8.setBounds(994, 200, 350, 214);
				contentPane.add(panel8);
				
				JPanel panel9 = new JPanel();
				panel9.setBackground(new Color(65, 105, 225));
				panel9.setBounds(0, 413, 1344, 10);
				contentPane.add(panel9);
				
				JPanel panel10 = new JPanel();
				panel10.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel10.setBackground(new Color(135, 206, 250));
				panel10.setLayout(null);
				panel10.setBounds(0, 423, 1344, 220);
				contentPane.add(panel10);
				
				JPanel panel11 = new JPanel();
				panel11.setBackground(new Color(65, 105, 225));
				panel11.setBounds(0, 719, 1344, 10);
				contentPane.add(panel11);
				
				JPanel panel12 = new JPanel();
				panel12.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel12.setBackground(new Color(135, 206, 250));
				panel12.setLayout(null);
				panel12.setBounds(0, 653, 667, 66);
				contentPane.add(panel12);
				
				JPanel panel13 = new JPanel();
				panel13.setBackground(new Color(65, 105, 225));
				panel13.setBounds(667, 653, 10, 66);
				contentPane.add(panel13);
				
				JPanel panel14 = new JPanel();
				panel14.setBorder(new LineBorder(new Color(25, 25, 112), 3));
				panel14.setBackground(new Color(135, 206, 250));
				panel14.setLayout(null);
				panel14.setBounds(677, 653, 667, 66);
				contentPane.add(panel14);
				
				JPanel panel15 = new JPanel();
				panel15.setBackground(new Color(65, 105, 225));
				panel15.setBounds(0, 643, 1344, 10);
				contentPane.add(panel15);
				
				JPanel panel16 = new JPanel();
				panel16.setBackground(new Color(65, 105, 225));
				panel16.setBounds(984, 74, 10, 340);
				contentPane.add(panel16);
				
				JLabel lblDialogosHabituales = new JLabel("Usual Dialogues");			
				lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblDialogosHabituales.setBounds(30, 0, 230, 30);
				panel3.add(lblDialogosHabituales);
				
				JButton btnHambre = new JButton("I am hungry");			 //Igual que en el botón "Tengo hambre"
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
				btnHambre.setBackground(new Color(240, 248, 255));
				btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnHambre.setBounds(25, 30, 458, 50);
				panel3.add(btnHambre);
				
				JButton btnSed = new JButton("I am thirsty");			 //Igual que en el botón "Tengo hambre"
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
				btnSed.setBackground(new Color(240, 248, 255));
				btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSed.setBounds(25, 90, 458, 50);
				panel3.add(btnSed);
				
				JButton btnSuenio = new JButton("I am sleepy");				 //Igual que en el botón "Tengo hambre"
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
				btnSuenio.setBackground(new Color(240, 248, 255));
				btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSuenio.setBounds(25, 150, 458, 50);
				panel3.add(btnSuenio);

				JButton btnDientes = new JButton("I want to brush my teeth");			 //Igual que en el botón "Tengo hambre"
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
				btnDientes.setBackground(new Color(240, 248, 255));
				btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnDientes.setBounds(503, 30, 458, 50);
				panel3.add(btnDientes);
				
				JButton btnBanio = new JButton("I want to go to the bathroom");			 //Igual que en el botón "Tengo hambre"
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
				btnBanio.setBackground(new Color(240, 248, 255));
				btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnBanio.setBounds(503, 90, 458, 50);
				panel3.add(btnBanio);
				
				JButton btnBaniar = new JButton("I want to bathe");			 //Igual que en el botón "Tengo hambre"
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
				btnBaniar.setBackground(new Color(240, 248, 255));
				btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnBaniar.setBounds(503, 150, 458, 50);
				panel3.add(btnBaniar);
				
				JButton btnTecladoEnPantalla = new JButton("Virtual Keyboard");   //Botón que abre el teclado en pantalla
				btnTecladoEnPantalla.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        try {
				        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");	//Envía a cmd el comando para ejecutar el teclado en pantalla
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }


					}
				});
				btnTecladoEnPantalla.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTecladoEnPantalla.setBounds(10, 5, 330, 50);
				panel4.add(btnTecladoEnPantalla);
				
				JLabel lblRespuestas = new JLabel("Answers");
				lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblRespuestas.setBounds(30, 0, 153, 30);
				panel7.add(lblRespuestas);
				
				JButton btnSi = new JButton("Yes");				 //Igual que en el botón "Tengo hambre"
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
				btnSi.setBackground(new Color(240, 248, 255));
				btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSi.setBounds(87, 30, 130, 82);
				panel7.add(btnSi);
				
				JButton btnNo = new JButton("No");				 //Igual que en el botón "Tengo hambre"
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
				btnNo.setBackground(new Color(240, 248, 255));
				btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnNo.setBounds(257, 30, 130, 82);
				panel7.add(btnNo);
				
				JButton btnNoSe = new JButton("<html><center>I don´t know</html>");			 //Igual que en el botón "Tengo hambre"
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
				btnNoSe.setBackground(new Color(240, 248, 255));
				btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnNoSe.setBounds(427, 30, 130, 82);
				panel7.add(btnNoSe);
				
				JButton btnTalVez = new JButton("Maybe");			 //Igual que en el botón "Tengo hambre"
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
				btnTalVez.setBackground(new Color(240, 248, 255));
				btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTalVez.setBounds(597, 30, 130, 82);
				panel7.add(btnTalVez);
				
				JButton btnGracias = new JButton("Thanks!");			 //Igual que en el botón "Tengo hambre"
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
				btnGracias.setBackground(new Color(240, 248, 255));
				btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnGracias.setBounds(767, 30, 130, 82);
				panel7.add(btnGracias);

				JLabel lblTemperatura = new JLabel("Temperature");
				lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblTemperatura.setBounds(10, 0, 150, 30);
				panel8.add(lblTemperatura);
				
				JButton btnTengoFrio = new JButton("I am cold");			 //Igual que en el botón "Tengo hambre"
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
				btnTengoFrio.setBackground(new Color(240, 248, 255));
				btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTengoFrio.setBounds(10, 30, 160, 80);
				panel8.add(btnTengoFrio);

				JButton btnTengoCalor = new JButton("I am hot");			 //Igual que en el botón "Tengo hambre"
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
				btnTengoCalor.setBackground(new Color(240, 248, 255));
				btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTengoCalor.setBounds(175, 30, 160, 80);
				panel8.add(btnTengoCalor);
				
				JButton btnEstaFrio = new JButton("It is cold");			 //Igual que en el botón "Tengo hambre"
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
				btnEstaFrio.setBackground(new Color(240, 248, 255));
				btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnEstaFrio.setBounds(10, 120, 160, 80);
				panel8.add(btnEstaFrio);
				
				JButton btnEstaCaliente = new JButton("It is hot");			 //Igual que en el botón "Tengo hambre"
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
				btnEstaCaliente.setBackground(new Color(240, 248, 255));
				btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnEstaCaliente.setBounds(175, 120, 160, 80);
				panel8.add(btnEstaCaliente);
				
				JLabel lblOcio = new JLabel("Leisure");
				lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 18));
				lblOcio.setBounds(30, 0, 150, 30);
				panel10.add(lblOcio);
				
				JButton btnPaseo = new JButton("I would like to take a walk");			 //Igual que en el botón "Tengo hambre"
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
				btnPaseo.setBackground(new Color(240, 248, 255));
				btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnPaseo.setBounds(31, 30, 414, 40);
				panel10.add(btnPaseo);

				JButton btnTele = new JButton("I would like to watch something on the tv");	 //Igual que en el botón "Tengo hambre"
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
				btnTele.setBackground(new Color(240, 248, 255));
				btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTele.setBounds(31, 75, 414, 40);
				panel10.add(btnTele);

				JButton btnComputadora = new JButton("I would like to watch something on the pc");	 //Igual que en el botón "Tengo hambre"
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
				btnComputadora.setBackground(new Color(240, 248, 255));
				btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnComputadora.setBounds(31, 120, 414, 40);
				panel10.add(btnComputadora);
				
				JButton btnTablet = new JButton("I would like to watch something on the tablet");	 //Igual que en el botón "Tengo hambre"
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
				btnTablet.setBackground(new Color(240, 248, 255));
				btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnTablet.setBounds(31, 165, 414, 40);
				panel10.add(btnTablet);
				
				JButton btnRadio = new JButton("I would like to listen to the radio");	//Igual que en el botón "Tengo hambre"
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
				btnRadio.setBackground(new Color(240, 248, 255));
				btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnRadio.setBounds(465, 30, 414, 40);
				panel10.add(btnRadio);
				
				JButton btnMusica = new JButton("I would like to listen to music");	 //Igual que en el botón "Tengo hambre"
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
				btnMusica.setBackground(new Color(240, 248, 255));
				btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnMusica.setBounds(465, 75, 414, 40);
				panel10.add(btnMusica);

				JButton btnAudiolibro = new JButton("I would like to listen to an audiobook");	 //Igual que en el botón "Tengo hambre"
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
				btnAudiolibro.setBackground(new Color(240, 248, 255));
				btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnAudiolibro.setBounds(465, 120, 414, 40);
				panel10.add(btnAudiolibro);
				
				JButton btnLibro = new JButton("I would like you to read me a book");	 //Igual que en el botón "Tengo hambre"
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
				btnLibro.setBackground(new Color(240, 248, 255));
				btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnLibro.setBounds(465, 165, 414, 40);
				panel10.add(btnLibro);
				
				JButton btnRopa = new JButton("I would like to change my clothes");		//Igual que en el botón "Tengo hambre"
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
				btnRopa.setBackground(new Color(240, 248, 255));
				btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnRopa.setBounds(899, 30, 414, 40);
				panel10.add(btnRopa);
				
				JButton btnCine = new JButton("I would like to go to the cinema");	//Igual que en el botón "Tengo hambre"
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
				btnCine.setBackground(new Color(240, 248, 255));
				btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnCine.setBounds(899, 75, 414, 40);
				panel10.add(btnCine);
				
				JButton btnSalirAComer = new JButton("I would like to go out to eat");	 //Igual que en el botón "Tengo hambre"
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
				btnSalirAComer.setBackground(new Color(240, 248, 255));
				btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnSalirAComer.setBounds(899, 120, 414, 40);
				panel10.add(btnSalirAComer);
				
				JButton btnJugar = new JButton("I would like to play something");	 //Igual que en el botón "Tengo hambre"
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
				btnJugar.setBackground(new Color(240, 248, 255));
				btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnJugar.setBounds(899, 165, 414, 40);
				panel10.add(btnJugar);
				
				JButton btnConfiguracion = new JButton("Configuration");	//Botón que abre la ventana Configuración
				btnConfiguracion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Configuracion con = new Configuracion();
						con.setVisible(true);
						dispose();
					}
				});
				btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnConfiguracion.setBounds(126, 13, 415, 40);
				panel12.add(btnConfiguracion);	btnConfiguracion.setBackground(new Color(240, 248, 255));
				btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnConfiguracion.setBounds(126, 13, 415, 40);
				panel12.add(btnConfiguracion);
				
				JButton btnEmergencias = new JButton("Emergencies");		//Botón que abre la ventana emergencias
				btnEmergencias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Emergencias em = new Emergencias();
						em.setVisible(true);
						dispose();
					}
				});
				btnEmergencias.setBackground(new Color(240, 248, 255));
				btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));

				btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
				btnEmergencias.setBounds(126, 13, 415, 40);
				panel14.add(btnEmergencias);
				
			}
			
		}
		
		if (tamanio.equals("3")) {           //If que verifica si el tamaño seleccionado es el tercero
			//Setea el icono de la pantalla
			setIconImage(Toolkit.getDefaultToolkit().getImage(Main_1.class.getResource("/Images/solidar_icono.png")));
			
			if (idioma.equals("esp")) {		//If que verifica si el idioma seleccionado es el español
				
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
				lblDialogosHabituales.setBounds(20, 0, 270, 30);
				panel3.add(lblDialogosHabituales);
				
				JButton btnHambre = new JButton("Tengo hambre");		 //Igual que en el primer botón "Tengo hambre"
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
				btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnHambre.setBackground(new Color(240, 248, 255));

				btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnHambre.setBounds(75, 35, 620, 60);
				panel3.add(btnHambre);
				
				JButton btnSed = new JButton("Tengo sed");			 //Igual que en el botón "Tengo hambre"
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
				btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSed.setBackground(new Color(240, 248, 255));

				btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSed.setBounds(75, 105, 620, 60);
				panel3.add(btnSed);
				
				JButton btnSuenio = new JButton("Tengo sueño");			 //Igual que en el botón "Tengo hambre"
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
				btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSuenio.setBackground(new Color(240, 248, 255));

				btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSuenio.setBounds(75, 175, 620, 60);
				panel3.add(btnSuenio);
				
				JButton btnDientes = new JButton("Quiero lavarme los dientes");			 //Igual que en el botón "Tengo hambre"
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
				btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnDientes.setBackground(new Color(240, 248, 255));

				btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnDientes.setBounds(739, 35, 620, 60);
				panel3.add(btnDientes);
				
				JButton btnBanio = new JButton("Quiero ir al baño");			 //Igual que en el botón "Tengo hambre"
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
				btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnBanio.setBackground(new Color(240, 248, 255));

				btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBanio.setBounds(739, 105, 620, 60);
				panel3.add(btnBanio);
				
				JButton btnBaniar = new JButton("Quiero bañarme");			 //Igual que en el botón "Tengo hambre"
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
				btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnBaniar.setBackground(new Color(240, 248, 255));

				btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBaniar.setBounds(739, 175, 620, 60);
				panel3.add(btnBaniar);
				
				JButton btnTecladoEnPantalla = new JButton("Teclado en pantalla");		//Botón que abre el teclado en pantalla
				btnTecladoEnPantalla.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        try {
				        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");			//Envía a cmd el comando para ejecutar el teclado en pantalla
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
				
				JButton btnSi = new JButton("Sí");				 //Igual que en el botón "Tengo hambre"
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
				btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSi.setBackground(new Color(240, 248, 255));

				btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSi.setBounds(96, 30, 190, 110);
				panel7.add(btnSi);
				
				JButton btnNo = new JButton("No");				 //Igual que en el botón "Tengo hambre"
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
				btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnNo.setBackground(new Color(240, 248, 255));

				btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNo.setBounds(359, 30, 190, 110);
				panel7.add(btnNo);
				
				JButton btnNoSe = new JButton("No sé");				 //Igual que en el botón "Tengo hambre"
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
				btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnNoSe.setBackground(new Color(240, 248, 255));

				btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNoSe.setBounds(622, 30, 190, 110);
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
				btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTalVez.setBackground(new Color(240, 248, 255));

				btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTalVez.setBounds(885, 30, 190, 110);
				panel7.add(btnTalVez);
				
				JButton btnGracias = new JButton("Gracias!");			 //Igual que en el botón "Tengo hambre"
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
				btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnGracias.setBackground(new Color(240, 248, 255));

				btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnGracias.setBounds(1148, 30, 180, 110);
				panel7.add(btnGracias);
				
				JLabel lblTemperatura = new JLabel("Temperatura");
				lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
				lblTemperatura.setBounds(20, 0, 150, 30);
				panel8.add(lblTemperatura);
				
				JButton btnTengoFrio = new JButton("Tengo frio");			 //Igual que en el botón "Tengo hambre"
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
				btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTengoFrio.setBackground(new Color(240, 248, 255));

				btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoFrio.setBounds(30, 30, 190, 110);
				panel8.add(btnTengoFrio);
				
				JButton btnTengoCalor = new JButton("Tengo calor");			 //Igual que en el botón "Tengo hambre"
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
				btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTengoCalor.setBackground(new Color(240, 248, 255));

				btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoCalor.setBounds(240, 30, 190, 110);
				panel8.add(btnTengoCalor);
				
				JButton btnEstaFrio = new JButton("Está frio");			 //Igual que en el botón "Tengo hambre"
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
				btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnEstaFrio.setBackground(new Color(240, 248, 255));

				btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaFrio.setBounds(30, 150, 190, 110);
				panel8.add(btnEstaFrio);
				
				JButton btnEstaCaliente = new JButton("Está caliente");			 //Igual que en el botón "Tengo hambre"
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
				btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnEstaCaliente.setBackground(new Color(240, 248, 255));

				btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaCaliente.setBounds(240, 150, 190, 110);
				panel8.add(btnEstaCaliente);
				
				JLabel lblOcio = new JLabel("Ocio");
				lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblOcio.setBounds(20, 0, 150, 30);
				panel10.add(lblOcio);
				
				JButton btnPaseo = new JButton("Quisiera dar un paseo");			 //Igual que en el botón "Tengo hambre"
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
				btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnPaseo.setBackground(new Color(240, 248, 255));

				btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnPaseo.setBounds(20, 30, 608, 60);
				panel10.add(btnPaseo);
				
				JButton btnTele = new JButton("Quisiera ver algo en la tele");			 //Igual que en el botón "Tengo hambre"
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
				btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTele.setBackground(new Color(240, 248, 255));

				btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTele.setBounds(20, 100, 608, 60);
				panel10.add(btnTele);
				
				JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");	 //Igual que en el botón "Tengo hambre"
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
				btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnComputadora.setBackground(new Color(240, 248, 255));

				btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnComputadora.setBounds(20, 170, 608, 60);
				panel10.add(btnComputadora);
				
				JButton btnTablet = new JButton("Quisiera ver algo en la tablet");	 //Igual que en el botón "Tengo hambre"
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
				btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTablet.setBackground(new Color(240, 248, 255));

				btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTablet.setBounds(20, 240, 608, 60);
				panel10.add(btnTablet);
				
				JButton btnRadio = new JButton("Quisiera escuchar radio");		//Igual que en el botón "Tengo hambre"
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
				btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnRadio.setBackground(new Color(240, 248, 255));

				btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRadio.setBounds(648, 30, 608, 60);
				panel10.add(btnRadio);
				
				JButton btnMusica = new JButton("Quisiera escuchar música");	 //Igual que en el botón "Tengo hambre"
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
				btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnMusica.setBackground(new Color(240, 248, 255));

				btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnMusica.setBounds(648, 100, 608, 60);
				panel10.add(btnMusica);
				
				JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");	 //Igual que en el botón "Tengo hambre"
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
				btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnAudiolibro.setBackground(new Color(240, 248, 255));

				btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnAudiolibro.setBounds(648, 170, 608, 60);
				panel10.add(btnAudiolibro);
				
				JButton btnLibro = new JButton("Quisiera que me lean un libro");	 //Igual que en el botón "Tengo hambre"
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
				btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnLibro.setBackground(new Color(240, 248, 255));

				btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnLibro.setBounds(648, 240, 608, 60);
				panel10.add(btnLibro);
				
				JButton btnRopa = new JButton("Quisiera cambiarme de ropa");	//Igual que en el botón "Tengo hambre"
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
				btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnRopa.setBackground(new Color(240, 248, 255));

				btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRopa.setBounds(1276, 30, 608, 60);
				panel10.add(btnRopa);
				
				JButton btnCine = new JButton("Quisiera ir al cine");	 //Igual que en el botón "Tengo hambre"
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
				btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnCine.setBackground(new Color(240, 248, 255));

				btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnCine.setBounds(1276, 100, 608, 60);
				panel10.add(btnCine);
				
				JButton btnSalirAComer = new JButton("Quisiera salir a comer");	 //Igual que en el botón "Tengo hambre"
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
				btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSalirAComer.setBackground(new Color(240, 248, 255));

				btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSalirAComer.setBounds(1276, 170, 608, 60);
				panel10.add(btnSalirAComer);
				
				JButton btnJugar = new JButton("Quisiera jugar a algo");	 //Igual que en el botón "Tengo hambre"
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
				btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnJugar.setBackground(new Color(240, 248, 255));

				btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnJugar.setBounds(1276, 240, 608, 60);
				panel10.add(btnJugar);
				
				JButton btnConfiguracion = new JButton("Configuración");	//Botón que abre la ventana Configuración
				btnConfiguracion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Configuracion con = new Configuracion();
						con.setVisible(true);
						dispose();
					}
				});
				btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnConfiguracion.setBackground(new Color(240, 248, 255));

				btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnConfiguracion.setBounds(170, 30, 608, 60);
				panel12.add(btnConfiguracion);
				
				JButton btnEmergencias = new JButton("Emergencias");	//Botón que abre la ventana Emergencias
				btnEmergencias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Emergencias em = new Emergencias();
						em.setVisible(true);
						dispose();
					}
				});
				btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnEmergencias.setBackground(new Color(240, 248, 255));

				btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEmergencias.setBounds(169, 30, 608, 60);
				panel14.add(btnEmergencias);
			}
			
			if (idioma.equals("ing")) {			//If que verifica si el idioma seleccionado es el inglés
				//Setea el icono de la pantalla
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
				
				JLabel lblDialogosHabituales = new JLabel("Usual Dialogues");
				lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblDialogosHabituales.setBounds(20, 0, 270, 30);
				panel3.add(lblDialogosHabituales);
				
				JButton btnHambre = new JButton("I am hungry");			 //Igual que en el botón "Tengo hambre"
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
				btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnHambre.setBackground(new Color(240, 248, 255));

				btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnHambre.setBounds(75, 35, 620, 60);
				panel3.add(btnHambre);

				JButton btnSed = new JButton("I am thirsty");			 //Igual que en el botón "Tengo hambre"
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
				btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSed.setBackground(new Color(240, 248, 255));

				btnSed.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSed.setBounds(75, 105, 620, 60);
				panel3.add(btnSed);
				
				JButton btnSuenio = new JButton("I am sleepy");			 //Igual que en el botón "Tengo hambre"
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
				btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSuenio.setBackground(new Color(240, 248, 255));

				btnSuenio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSuenio.setBounds(75, 175, 620, 60);
				panel3.add(btnSuenio);
				
				JButton btnDientes = new JButton("I want to brush my teeth");			 //Igual que en el botón "Tengo hambre"
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
				btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnDientes.setBackground(new Color(240, 248, 255));

				btnDientes.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnDientes.setBounds(739, 35, 620, 60);
				panel3.add(btnDientes);
				
				JButton btnBanio = new JButton("I want to go to the bathroom");			 //Igual que en el botón "Tengo hambre"
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
				btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnBanio.setBackground(new Color(240, 248, 255));

				btnBanio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBanio.setBounds(739, 105, 620, 60);
				panel3.add(btnBanio);
				
				JButton btnBaniar = new JButton("I want to bathe");			 //Igual que en el botón "Tengo hambre"
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
				btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnBaniar.setBackground(new Color(240, 248, 255));

				btnBaniar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnBaniar.setBounds(739, 175, 620, 60);
				panel3.add(btnBaniar);

				JButton btnTecladoEnPantalla = new JButton("Virtual keyboard");		//Botón que abre el teclado en pantalla
				btnTecladoEnPantalla.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        try {
				        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");		//Envía el comando al cmd para ejecutar el teclado en pantalla
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

				JLabel lblRespuestas = new JLabel("Answers");
				lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblRespuestas.setBounds(20, 0, 153, 30);
				panel7.add(lblRespuestas);
				
				JButton btnSi = new JButton("Yes");				 //Igual que en el botón "Tengo hambre"
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
				btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSi.setBackground(new Color(240, 248, 255));

				btnSi.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSi.setBounds(96, 30, 190, 110);
				panel7.add(btnSi);
				
				JButton btnNo = new JButton("No");		 //Igual que en el botón "Tengo hambre"
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
				btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnNo.setBackground(new Color(240, 248, 255));

				btnNo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNo.setBounds(359, 30, 190, 110);
				panel7.add(btnNo);
				
				JButton btnNoSe = new JButton("<html><center>I don´t know</html>");		 //Igual que en el botón "Tengo hambre"
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
				btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnNoSe.setBackground(new Color(240, 248, 255));

				btnNoSe.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnNoSe.setBounds(622, 30, 190, 110);
				panel7.add(btnNoSe);
				
				JButton btnTalVez = new JButton("Maybe");	 //Igual que en el botón "Tengo hambre"
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
				btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTalVez.setBackground(new Color(240, 248, 255));

				btnTalVez.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTalVez.setBounds(885, 30, 190, 110);
				panel7.add(btnTalVez);
				
				JButton btnGracias = new JButton("Thanks!");	 //Igual que en el botón "Tengo hambre"
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
				btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnGracias.setBackground(new Color(240, 248, 255));

				btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnGracias.setBounds(1148, 30, 180, 110);
				panel7.add(btnGracias);

				JLabel lblTemperatura = new JLabel("Temperature");
				lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 22));
				lblTemperatura.setBounds(20, 0, 150, 30);
				panel8.add(lblTemperatura);
				
				JButton btnTengoFrio = new JButton("I am cold");	 //Igual que en el botón "Tengo hambre"
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
				btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTengoFrio.setBackground(new Color(240, 248, 255));

				btnTengoFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoFrio.setBounds(30, 30, 190, 110);
				panel8.add(btnTengoFrio);

				
				JButton btnTengoCalor = new JButton("I am hot");	 //Igual que en el botón "Tengo hambre"
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
				btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTengoCalor.setBackground(new Color(240, 248, 255));

				btnTengoCalor.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTengoCalor.setBounds(240, 30, 190, 110);
				panel8.add(btnTengoCalor);

				JButton btnEstaFrio = new JButton("It is cold");	//Igual que en el botón "Tengo hambre"
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
				btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnEstaFrio.setBackground(new Color(240, 248, 255));

				btnEstaFrio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaFrio.setBounds(30, 150, 190, 110);
				panel8.add(btnEstaFrio);

				JButton btnEstaCaliente = new JButton("It is hot");		 //Igual que en el botón "Tengo hambre"
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
				btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnEstaCaliente.setBackground(new Color(240, 248, 255));

				btnEstaCaliente.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEstaCaliente.setBounds(240, 150, 190, 110);
				panel8.add(btnEstaCaliente);

				JLabel lblOcio = new JLabel("Leisure");
				lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 26));
				lblOcio.setBounds(20, 0, 150, 30);
				panel10.add(lblOcio);
				
				JButton btnPaseo = new JButton("I would like to take a walk");	 //Igual que en el botón "Tengo hambre"
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
				btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnPaseo.setBackground(new Color(240, 248, 255));

				btnPaseo.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnPaseo.setBounds(20, 30, 608, 60);
				panel10.add(btnPaseo);
				
				JButton btnTele = new JButton("I would like to watch something on the tv");	 //Igual que en el botón "Tengo hambre"
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
				btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTele.setBackground(new Color(240, 248, 255));

				btnTele.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTele.setBounds(20, 100, 608, 60);
				panel10.add(btnTele);
				
				JButton btnComputadora = new JButton("I would like to watch something on the pc");	 //Igual que en el botón "Tengo hambre"
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
				btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnComputadora.setBackground(new Color(240, 248, 255));

				btnComputadora.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnComputadora.setBounds(20, 170, 608, 60);
				panel10.add(btnComputadora);
				
				JButton btnTablet = new JButton("I would like to watch something on the tablet");   //Igual que en el botón "Tengo hambre"
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
				btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnTablet.setBackground(new Color(240, 248, 255));

				btnTablet.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnTablet.setBounds(20, 240, 608, 60);
				panel10.add(btnTablet);
				
				JButton btnRadio = new JButton("I would like to listen to the radio");	//Igual que en el botón "Tengo hambre"
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
				btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnRadio.setBackground(new Color(240, 248, 255));

				btnRadio.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRadio.setBounds(648, 30, 608, 60);
				panel10.add(btnRadio);
				
				JButton btnMusica = new JButton("I would like to listen to music");	 //Igual que en el botón "Tengo hambre"
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
				btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnMusica.setBackground(new Color(240, 248, 255));

				btnMusica.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnMusica.setBounds(648, 100, 608, 60);
				panel10.add(btnMusica);
				
				JButton btnAudiolibro = new JButton("I would like to listen to an audiobook");	//Igual que en el botón "Tengo hambre"
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
				btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnAudiolibro.setBackground(new Color(240, 248, 255));

				btnAudiolibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnAudiolibro.setBounds(648, 170, 608, 60);
				panel10.add(btnAudiolibro);
				
				JButton btnLibro = new JButton("I would like you to read me a book");	 //Igual que en el botón "Tengo hambre"
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
				btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnLibro.setBackground(new Color(240, 248, 255));

				btnLibro.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnLibro.setBounds(648, 240, 608, 60);
				panel10.add(btnLibro);
				
				JButton btnRopa = new JButton("I would like to change my clothes");	  //Igual que en el botón "Tengo hambre"
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
				btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnRopa.setBackground(new Color(240, 248, 255));

				btnRopa.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnRopa.setBounds(1276, 30, 608, 60);
				panel10.add(btnRopa);
				
				JButton btnCine = new JButton("I would like to go to the cinema");	 //Igual que en el botón "Tengo hambre"
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
				btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnCine.setBackground(new Color(240, 248, 255));

				btnCine.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnCine.setBounds(1276, 100, 608, 60);
				panel10.add(btnCine);
				
				JButton btnSalirAComer = new JButton("I would like to go out to eat");	//Igual que en el botón "Tengo hambre"
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
				btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnSalirAComer.setBackground(new Color(240, 248, 255));

				btnSalirAComer.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnSalirAComer.setBounds(1276, 170, 608, 60);
				panel10.add(btnSalirAComer);
					
				JButton btnJugar = new JButton("I would like to play something");	//Igual que en el botón "Tengo hambre"
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
				btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnJugar.setBackground(new Color(240, 248, 255));

				btnJugar.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnJugar.setBounds(1276, 240, 608, 60);
				panel10.add(btnJugar);

				JButton btnConfiguracion = new JButton("Configuration");	//Botón que abre la ventana Configuración
				btnConfiguracion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Configuracion con = new Configuracion();
						con.setVisible(true);
						dispose();
					}
				});
				btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnConfiguracion.setBackground(new Color(240, 248, 255));

				btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnConfiguracion.setBounds(170, 30, 608, 60);
				panel12.add(btnConfiguracion);

				JButton btnEmergencias = new JButton("Emergencies");	//Botón que abre la ventana emergencias
				btnEmergencias.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Emergencias em = new Emergencias();
						em.setVisible(true);
						dispose();
					}
				});
				btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 5, true));
				btnEmergencias.setBackground(new Color(240, 248, 255));

				btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
				btnEmergencias.setBounds(169, 30, 608, 60);
				panel14.add(btnEmergencias);
			}
		}
	}

	public Main_1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main_1.class.getResource("/Images/solidar_icono.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 0, 139));
		panel1.setBounds(0, 0, 525, 47);
		contentPane.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 0, 139));
		panel2.setBorder(null);
		panel2.setForeground(new Color(255, 255, 255));
		panel2.setBounds(525, 0, 261, 73);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main_1.class.getResource("/Images/solidar_logo_reducido_Main_1.png")));
		lblLogo.setBounds(0, 0, 261, 73);
		panel2.add(lblLogo);
		
		JPanel panel3 = new JPanel();
		panel3.setForeground(new Color(51, 153, 255));
		panel3.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel3.setBackground(new Color(135, 206, 250));
		panel3.setBounds(0, 47, 515, 144);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		panel4.setForeground(new Color(51, 153, 255));
		panel4.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel4.setBackground(new Color(135, 206, 250));
		panel4.setBounds(525, 73, 261, 42);
		contentPane.add(panel4);
		panel4.setLayout(null);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(65, 105, 225));
		panel5.setBounds(0, 191, 515, 10);
		contentPane.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(65, 105, 225));
		panel6.setBounds(525, 115, 261, 10);
		contentPane.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setForeground(new Color(51, 153, 255));
		panel7.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel7.setBackground(new Color(135, 206, 250));
		panel7.setBounds(0, 201, 515, 113);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JPanel panel8 = new JPanel();
		panel8.setForeground(new Color(51, 153, 255));
		panel8.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel8.setBackground(new Color(135, 206, 250));
		panel8.setBounds(525, 125, 261, 189);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(new Color(65, 105, 225));
		panel9.setBounds(0, 314, 786, 10);
		contentPane.add(panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setForeground(new Color(51, 153, 255));
		panel10.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel10.setBackground(new Color(135, 206, 250));
		panel10.setBounds(0, 324, 786, 172);
		contentPane.add(panel10);
		panel10.setLayout(null);
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(new Color(65, 105, 225));
		panel11.setBounds(0, 496, 786, 10);
		contentPane.add(panel11);

		JPanel panel12 = new JPanel();
		panel12.setForeground(new Color(51, 153, 255));
		panel12.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel12.setBackground(new Color(135, 206, 250));
		panel12.setBounds(0, 506, 388, 46);
		contentPane.add(panel12);
		panel12.setLayout(null);

		JPanel panel13 = new JPanel();
		panel13.setBackground(new Color(65, 105, 225));
		panel13.setBounds(388, 506, 10, 46);
		contentPane.add(panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setForeground(new Color(51, 153, 255));
		panel14.setBorder(new LineBorder(new Color(25, 25, 112), 3));
		panel14.setBackground(new Color(135, 206, 250));
		panel14.setBounds(398, 506, 388, 46);
		contentPane.add(panel14);
		panel14.setLayout(null);
		
		JPanel panel15 = new JPanel();
		panel15.setBackground(new Color(65, 105, 225));
		panel15.setBounds(0, 552, 786, 9);
		contentPane.add(panel15);
		
		JPanel panel16 = new JPanel();
		panel16.setBackground(new Color(65, 105, 225));
		panel16.setBounds(515, 47, 10, 267);
		contentPane.add(panel16);
		
		JLabel lblDialogosHabituales = new JLabel("Dialogos Habituales");
		lblDialogosHabituales.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblDialogosHabituales.setBounds(10, 0, 160, 24);
		panel3.add(lblDialogosHabituales);
		
		JButton btnHambre = new JButton("Tengo hambre");
		btnHambre.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnHambre.setBackground(new Color(240, 248, 255));
		btnHambre.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
		btnHambre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");	//Setea las propiedades de la voz
				Voice voice;
		        VoiceManager voiceManager = VoiceManager.getInstance();		//Prepara la instancia de voz
		        voice = voiceManager.getVoice("kevin16");				 //Utiliza la voz "kevn16"
		        voice.allocate();
		        voice.speak("tehng-goh ahm-breh");			//Dice la frase seleccionada
		        voice.deallocate();
			}
		});
		btnHambre.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnHambre.setBounds(15, 32, 240, 30);
		panel3.add(btnHambre);
		
		JButton btnSed = new JButton("Tengo sed");
		btnSed.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSed.setBackground(new Color(240, 248, 255));
		btnSed.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnSed.setBounds(15, 68, 240, 30);
		panel3.add(btnSed);
		
		JButton btnSuenio = new JButton("Tengo sueño");
		btnSuenio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSuenio.setBackground(new Color(240, 248, 255));
		btnSuenio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnSuenio.setBounds(15, 104, 240, 30);
		panel3.add(btnSuenio);
		
		JButton btnDientes = new JButton("Quiero lavarme los dientes");
		btnDientes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnDientes.setBackground(new Color(240, 248, 255));
		btnDientes.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnDientes.setBounds(265, 32, 240, 30);
		panel3.add(btnDientes);
		
		JButton btnBanio = new JButton("Quiero ir al baño");
		btnBanio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnBanio.setBackground(new Color(240, 248, 255));
		btnBanio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnBanio.setBounds(265, 68, 240, 30);
		panel3.add(btnBanio);
		
		JButton btnBaniar = new JButton("Quiero bañarme");
		btnBaniar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnBaniar.setBackground(new Color(240, 248, 255));
		btnBaniar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnBaniar.setBounds(265, 104, 240, 30);
		panel3.add(btnBaniar);
		
		JButton btnEmergencias = new JButton("Emergencias");
		btnEmergencias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnEmergencias.setBackground(new Color(240, 248, 255));
		btnEmergencias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
		btnEmergencias.setBounds(123, 8, 140, 30);
		panel14.add(btnEmergencias);
		btnEmergencias.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		
		JLabel lblOcio = new JLabel("Ocio");
		lblOcio.setBounds(10, 0, 130, 24);
		lblOcio.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel10.add(lblOcio);
		
		JButton btnPaseo = new JButton("Quisiera dar un paseo");
		btnPaseo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnPaseo.setBackground(new Color(240, 248, 255));
		btnPaseo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnPaseo.setBounds(16, 23, 240, 30);
		panel10.add(btnPaseo);
		
		JButton btnTele = new JButton("Quisiera ver algo en la tele");
		btnTele.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTele.setBackground(new Color(240, 248, 255));
		btnTele.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnTele.setBounds(16, 59, 240, 30);
		panel10.add(btnTele);
		
		JButton btnComputadora = new JButton("Quisiera ver algo en la computadora");
		btnComputadora.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnComputadora.setBackground(new Color(240, 248, 255));
		btnComputadora.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnComputadora.setBounds(16, 95, 240, 30);
		panel10.add(btnComputadora);
		
		JButton btnTablet = new JButton("Quisiera ver algo en la tablet");
		btnTablet.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTablet.setBackground(new Color(240, 248, 255));
		btnTablet.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnTablet.setBounds(16, 131, 240, 30);
		panel10.add(btnTablet);
		
		JButton btnRadio = new JButton("Quisiera escuchar radio");
		btnRadio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnRadio.setBackground(new Color(240, 248, 255));
		btnRadio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnRadio.setBounds(273, 23, 240, 30);
		panel10.add(btnRadio);
		
		JButton btnMusica = new JButton("Quisiera escuchar música");
		btnMusica.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnMusica.setBackground(new Color(240, 248, 255));
		btnMusica.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnMusica.setBounds(273, 59, 240, 30);
		panel10.add(btnMusica);
		
		JButton btnAudiolibro = new JButton("Quisiera escuchar un audiolibro");
		btnAudiolibro.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnAudiolibro.setBackground(new Color(240, 248, 255));
		btnAudiolibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnAudiolibro.setBounds(273, 95, 240, 30);
		panel10.add(btnAudiolibro);
		
		JButton btnLibro = new JButton("Quisiera que me lean un libro");
		btnLibro.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnLibro.setBackground(new Color(240, 248, 255));
		btnLibro.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnLibro.setBounds(273, 131, 240, 30);
		panel10.add(btnLibro);
		
		JButton btnRopa = new JButton("Quisiera cambiarme de ropa");
		btnRopa.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnRopa.setBackground(new Color(240, 248, 255));
		btnRopa.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnRopa.setBounds(530, 23, 240, 30);
		panel10.add(btnRopa);
		
		JButton btnCine = new JButton("Quisiera ir al cine");
		btnCine.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnCine.setBackground(new Color(240, 248, 255));
		btnCine.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnCine.setBounds(530, 59, 240, 30);
		panel10.add(btnCine);
		
		JButton btnSalirAComer = new JButton("Quisiera salir a comer");
		btnSalirAComer.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSalirAComer.setBackground(new Color(240, 248, 255));
		btnSalirAComer.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnSalirAComer.setBounds(530, 95, 240, 30);
		panel10.add(btnSalirAComer);
		
		JButton btnJugar = new JButton("Quisiera jugar a algo");
		btnJugar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnJugar.setBackground(new Color(240, 248, 255));
		btnJugar.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnJugar.setBounds(530, 131, 240, 30);
		panel10.add(btnJugar);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnConfiguracion.setBackground(new Color(240, 248, 255));
		btnConfiguracion.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
		btnConfiguracion.setBounds(123, 8, 140, 30);
		btnConfiguracion.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		panel12.add(btnConfiguracion);
			
		JLabel lblRespuestas = new JLabel("Respuestas");
		lblRespuestas.setBounds(10, 0, 153, 19);
		lblRespuestas.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		panel7.add(lblRespuestas);
		
		JButton btnSi = new JButton("Sí");
		btnSi.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSi.setBackground(new Color(240, 248, 255));
		btnSi.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNo.setBackground(new Color(240, 248, 255));
		btnNo.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnNo.setBounds(114, 30, 89, 70);
		panel7.add(btnNo);
		
		JButton btnNoSe = new JButton("No sé");
		btnNoSe.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNoSe.setBackground(new Color(240, 248, 255));
		btnNoSe.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnNoSe.setBounds(215, 30, 89, 70);
		panel7.add(btnNoSe);
		
		JButton btnTalVez = new JButton("Tal vez");
		btnTalVez.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTalVez.setBackground(new Color(240, 248, 255));
		btnTalVez.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnTalVez.setBounds(316, 30, 89, 70);
		panel7.add(btnTalVez);
		
		JButton btnGracias = new JButton("Gracias!");
		btnGracias.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnGracias.setBackground(new Color(240, 248, 255));
		btnGracias.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnGracias.setBounds(417, 30, 89, 70);
		panel7.add(btnGracias);
		btnGracias.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setFont(new Font("Roboto Medium", Font.BOLD, 16));
		lblTemperatura.setBounds(10, 0, 153, 24);
		panel8.add(lblTemperatura);
		
		JButton btnTengoFrio = new JButton("Tengo frio");
		btnTengoFrio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTengoFrio.setBackground(new Color(240, 248, 255));
		btnTengoFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnTengoFrio.setBounds(8, 30, 118, 70);
		panel8.add(btnTengoFrio);
		
		JButton btnTengoCalor = new JButton("Tengo calor");
		btnTengoCalor.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnTengoCalor.setBackground(new Color(240, 248, 255));
		btnTengoCalor.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnTengoCalor.setBounds(130, 30, 123, 70);
		panel8.add(btnTengoCalor);
		
		JButton btnEstaFrio = new JButton("Está frio");
		btnEstaFrio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnEstaFrio.setBackground(new Color(240, 248, 255));
		btnEstaFrio.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnEstaFrio.setBounds(8, 109, 118, 70);
		panel8.add(btnEstaFrio);
		
		JButton btnEstaCaliente = new JButton("Está caliente");
		btnEstaCaliente.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnEstaCaliente.setBackground(new Color(240, 248, 255));
		btnEstaCaliente.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
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
		btnEstaCaliente.setBounds(130, 109, 123, 70);
		panel8.add(btnEstaCaliente);
		
		JButton btnNewButton = new JButton("Teclado en pantalla");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setBorder(new LineBorder(new Color(65, 105, 225), 3, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        try {
		        	Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");		//Envía a cmd el comando para ejecutar el teclado en pantalla
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }


			}
		});
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnNewButton.setBounds(42, 6, 176, 30);
		panel4.add(btnNewButton);
		
		btnConfiguracion.addActionListener(new ActionListener() {			//Botón que abre la ventana Configuración
			public void actionPerformed(ActionEvent e) {
				Configuracion con = new Configuracion();
				con.setVisible(true);
				dispose();
			}
		});
		btnEmergencias.addActionListener(new ActionListener() {			//Botón que abre la ventana Emergencias
			public void actionPerformed(ActionEvent e) {
				Emergencias em = new Emergencias();
				em.setVisible(true);
				dispose();
			}
		});
	}
}
