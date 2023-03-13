package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Configuracion extends JFrame {
    
	private JPanel contentPane;
	JLabel lblIdiomaSeleccionado;
	JLabel lblTamanioSeleccionado;

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

	String idioma = "esp";             //Coloca el idioma español por defecto
	String tamanio = "1";              //Coloca el primer tamaño por defecto
	/**
	 * Create the frame.
	 */
	public Configuracion() {                               //Crea la ventana
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel0 = new JPanel();
		panel0.setBounds(0, 0, 626, 443);
		contentPane.add(panel0);
		panel0.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 0, 139));
		panel1.setBounds(0, 0, 182, 73);
		panel0.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setForeground(Color.WHITE);
		panel2.setBorder(null);
		panel2.setBackground(new Color(0, 0, 139));
		panel2.setBounds(182, 0, 262, 73);
		panel0.add(panel2);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main_1.class.getResource("/Images/solidar_logo_reducido_Main_1.png")));
		lblLogo.setBounds(0, 0, 262, 73);
		panel2.add(lblLogo);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(0, 0, 139));
		panel3.setBounds(444, 0, 182, 73);
		panel0.add(panel3);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(0, 0, 139));
		panel4.setBounds(0, 73, 626, 40);
		panel0.add(panel4);
		panel4.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Configuración");             
		lblTitulo.setForeground(new Color(240, 248, 255));
		lblTitulo.setBounds(246, 0, 140, 40);
		panel4.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Roboto Medium", Font.BOLD, 20));
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(65, 105, 255));
		panel5.setBounds(0, 113, 10, 330);
		panel0.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(65, 105, 255));
		panel6.setBounds(10, 113, 606, 10);
		panel0.add(panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(new Color(65, 105, 255));
		panel7.setBounds(616, 113, 10, 330);
		panel0.add(panel7);
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(new Color(125, 206, 250));
		panel8.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel8.setBounds(10, 123, 606, 110);
		panel0.add(panel8);
		panel8.setLayout(null);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(new Color(65, 105, 255));
		panel9.setBounds(10, 233, 606, 10);
		panel0.add(panel9);
	
		JPanel panel10 = new JPanel();
		panel10.setBackground(new Color(125, 206, 250));
		panel10.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel10.setLayout(null);
		panel10.setBounds(10, 243, 606, 110);
		panel0.add(panel10);
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(new Color(65, 105, 255));
		panel11.setBounds(10, 353, 606, 10);
		panel0.add(panel11);
		
		JPanel panel12 = new JPanel();
		panel12.setBackground(new Color(125, 206, 250));
		panel12.setBorder(new LineBorder(new Color(25, 25, 112), 5));
		panel12.setBounds(10, 363, 606, 70);
		panel0.add(panel12);
		panel12.setLayout(null);
		
		JPanel panel13 = new JPanel();
		panel13.setBackground(new Color(65, 105, 255));
		panel13.setBounds(10, 433, 606, 10);
		panel0.add(panel13);
		
		JLabel lblTamanio = new JLabel("Resolución");
		lblTamanio.setHorizontalAlignment(SwingConstants.CENTER);
		lblTamanio.setBounds(197, 0, 212, 30);
		panel8.add(lblTamanio);
		lblTamanio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JButton btnTamanio1 = new JButton("800 x 600");           //Botón que selecciona el primer tamaño (800 x 600)
		btnTamanio1.setBackground(new Color(240, 248, 255));
		btnTamanio1.setBorder(new LineBorder(new Color(65, 105, 255), 5, true));
		btnTamanio1.setBounds(41, 37, 150, 40);
		panel8.add(btnTamanio1);
		btnTamanio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio = "1";                                                  //Coloca la variable tamanio como "1"
				lblTamanioSeleccionado.setText("Seleccionado: 800 x 600");      //Cambia el texto del label para indicar que el tamaño seleccionado es 800 x 600
			}
		});
		btnTamanio1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JButton btnTamanio2 = new JButton("1280 x 960");        //Botón que selecciona el segundo tamaño (1280 x 960)
		btnTamanio2.setBackground(new Color(240, 248, 255));
		btnTamanio2.setBorder(new LineBorder(new Color(65, 105, 255), 5, true));
		btnTamanio2.setBounds(219, 37, 150, 40);
		panel8.add(btnTamanio2);
		btnTamanio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio = "2";                                                  //Coloca la variable tamanio como "2"
				lblTamanioSeleccionado.setText("Seleccionado: 1280 x 960");      //Cambia el texto del label para indicar que el tamaño seleccionado es 1280 x 960
			}
		});
		btnTamanio2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JButton btnTamanio3 = new JButton("1920 x 1080");        //Botón que selecciona el tercer tamaño (1920 x 1080)
		btnTamanio3.setBackground(new Color(240, 248, 255));
		btnTamanio3.setBorder(new LineBorder(new Color(65, 105, 255), 5, true));
		btnTamanio3.setBounds(406, 37, 150, 40);
		panel8.add(btnTamanio3);
		btnTamanio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio = "3";                                                       //Coloca la variable tamanio como "3"
				lblTamanioSeleccionado.setText("Seleccionado: 1920 x 1080");         //Cambia el texto del label para indicar que el tamaño seleccionado es 1920 x 1080
			}
		});
		btnTamanio3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JLabel lblRes = new JLabel("16:9");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		lblRes.setBounds(3, 37, 38, 40);
		panel8.add(lblRes);
		
		lblTamanioSeleccionado = new JLabel("Seleccionado: 800 x 600");
		lblTamanioSeleccionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblTamanioSeleccionado.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblTamanioSeleccionado.setBounds(197, 80, 212, 30);
		panel8.add(lblTamanioSeleccionado);
		
		
		JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdioma.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		lblIdioma.setBounds(197, 0, 212, 40);
		panel10.add(lblIdioma);
		
		JButton btnEspaniol = new JButton("Español");                //Botón que selecciona el idioma español
		btnEspaniol.setBackground(new Color(240, 248, 255));
		btnEspaniol.setBorder(new LineBorder(new Color(65, 105, 255), 5, true));
		btnEspaniol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idioma = "esp";                                            //Cambia la variable idioma a "esp"
				lblIdiomaSeleccionado.setText("Seleccionado: Español");    //Cambia el texto del label para indicar que el idioma seleccionado es español
			}
		});
		btnEspaniol.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEspaniol.setBounds(102, 36, 150, 40);
		panel10.add(btnEspaniol);
		
		JButton btnIngles = new JButton("Ingles");                 //Botón que selecciona el idioma inglés
		btnIngles.setBackground(new Color(240, 248, 255));
		btnIngles.setBorder(new LineBorder(new Color(65, 105, 255), 5, true));
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idioma = "ing";                                           //Cambia la variable idioma a "ing"
				lblIdiomaSeleccionado.setText("Seleccionado: Inglés");    //Cambia el texto del label para indicar que el idioma seleccionado es inglés
			}
		});
		btnIngles.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnIngles.setBounds(354, 36, 150, 40);
		panel10.add(btnIngles);
		
		lblIdiomaSeleccionado = new JLabel("Seleccionado: Español");
		lblIdiomaSeleccionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdiomaSeleccionado.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblIdiomaSeleccionado.setBounds(197, 80, 212, 30);
		panel10.add(lblIdiomaSeleccionado);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(new Color(240, 248, 255));
		btnVolver.setBorder(new LineBorder(new Color(65, 105, 255), 5, true));
		btnVolver.setBounds(197, 15, 212, 40);
		panel12.add(btnVolver);
		btnVolver.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main_1 main = new Main_1(tamanio,idioma);        //Construye la ventana principal usando como parámetros las variables tamanio e idioma
				main.setVisible(true);
				dispose();                                       //Cierra esta ventana
				
				
			}
		});
		
		
	}
}
