package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 626, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");                      //Vuelve al menú principal
		btnVolver.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnVolver.setBounds(246, 385, 150, 40);
		panel.add(btnVolver);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 1, 626, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Configuración");             
		lblTitulo.setBounds(246, 0, 140, 40);
		panel_1.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Roboto Medium", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 50, 10, 393);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(616, 50, 10, 393);
		panel.add(panel_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 433, 606, 10);
		panel.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(10, 50, 606, 10);
		panel.add(panel_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(10, 150, 606, 10);
		panel.add(panel_1_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 60, 606, 90);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTamanio = new JLabel("Tamaño");
		lblTamanio.setBounds(5, 25, 80, 40);
		panel_3.add(lblTamanio);
		lblTamanio.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JButton btnTamanio1 = new JButton("800 x 600");           //Botón que selecciona el primer tamaño (800 x 600)
		btnTamanio1.setBounds(90, 25, 150, 40);
		panel_3.add(btnTamanio1);
		btnTamanio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio = "1";                                                  //Coloca la variable tamanio como "1"
				lblTamanioSeleccionado.setText("Seleccionado: 800 x 600");      //Cambia el texto del label para indicar que el tamaño selecciondao es 800 x 600
			}
		});
		btnTamanio1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JButton btnTamanio2 = new JButton("1280 x 960");        //Botón que selecciona el segundo tamaño (1280 x 960)
		btnTamanio2.setBounds(250, 25, 150, 40);
		panel_3.add(btnTamanio2);
		btnTamanio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio = "2";                                                  //Coloca la variable tamanio como "2"
				lblTamanioSeleccionado.setText("Seleccionado: 1280 x 960");      //Cambia el texto del label para indicar que el tamaño selecciondao es 1280 x 960
			}
		});
		btnTamanio2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JButton btnTamanio3 = new JButton("1920 x 1080");        //Botón que selecciona el primer tamaño (1920 x 1080)
		btnTamanio3.setBounds(410, 25, 150, 40);
		panel_3.add(btnTamanio3);
		btnTamanio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio = "3";                                                       //Coloca la variable tamanio como "3"
				lblTamanioSeleccionado.setText("Seleccionado: 1920 x 1080");         //Cambia el texto del label para indicar que el tamaño selecciondao es 1920 x 1080
			}
		});
		btnTamanio3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("16:9");
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		lblNewLabel.setBounds(283, 1, 40, 24);
		panel_3.add(lblNewLabel);
		
		lblTamanioSeleccionado = new JLabel("Seleccionado: 800 x 600");
		lblTamanioSeleccionado.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblTamanioSeleccionado.setBounds(228, 73, 216, 17);
		panel_3.add(lblTamanioSeleccionado);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 160, 606, 90);
		panel.add(panel_3_1);
		
		JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		lblIdioma.setBounds(5, 25, 80, 40);
		panel_3_1.add(lblIdioma);
		
		JButton btnEspaniol = new JButton("Español");                //Botón que selecciona el idioma español
		btnEspaniol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idioma = "esp";                                            //Cambia la variable idioma a "esp"
				lblIdiomaSeleccionado.setText("Seleccionado: Español");    //Cambia el texto del label para indicar que el idioma seleccionado es español
			}
		});
		btnEspaniol.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnEspaniol.setBounds(90, 25, 150, 40);
		panel_3_1.add(btnEspaniol);
		
		JButton btnIngles = new JButton("Ingles");                 //Botón que selecciona el idioma inglés
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idioma = "ing";                                           //Cambia la variable idioma a "ing"
				lblIdiomaSeleccionado.setText("Seleccionado: Inglés");    //Cambia el texto del label para indicar que el idioma seleccionado es inglés
			}
		});
		btnIngles.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btnIngles.setBounds(250, 25, 150, 40);
		panel_3_1.add(btnIngles);
		
		 lblIdiomaSeleccionado = new JLabel("Seleccionado: Español");
		 lblIdiomaSeleccionado.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblIdiomaSeleccionado.setBounds(410, 39, 186, 17);
		panel_3_1.add(lblIdiomaSeleccionado);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(10, 250, 606, 10);
		panel.add(panel_1_1_1_1_1);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main_1 main = new Main_1(tamanio,idioma);        //Construye la ventana principal usando como parámetros las variables tamanio e idioma
				main.setVisible(true);
				dispose();                                       //Cierra esta ventana
				
				
			}
		});
		
		
	}
}
