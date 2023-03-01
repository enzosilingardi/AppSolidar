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
import javax.swing.SwingConstants;
import java.awt.Font;

public class Emergencias extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emergencias frame = new Emergencias();
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
	public Emergencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 228);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAvisoRobo = new JButton("Aviso de Robo");
		btnAvisoRobo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnAvisoRobo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAvisoRobo.setBounds(104, 93, 219, 30);
		panel.add(btnAvisoRobo);
		
		JButton btnAvisoAccidente = new JButton("Aviso de accidente");
		btnAvisoAccidente.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnAvisoAccidente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAvisoAccidente.setBounds(104, 134, 219, 30);
		panel.add(btnAvisoAccidente);
		
		JLabel lblEmergencias = new JLabel("Emergencias");
		lblEmergencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmergencias.setBounds(125, 11, 176, 30);
		panel.add(lblEmergencias);
		
		JButton btnAvisoConflicto = new JButton("Aviso de Conflicto Domestico");
		btnAvisoConflicto.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnAvisoConflicto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://api.whatsapp.com/send?phone=+5492342414379&text=Aviso%20de%20conflicto%20domestico"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnAvisoConflicto.setBounds(104, 52, 219, 30);
		panel.add(btnAvisoConflicto);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_1 main = new Main_1();
				main.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(337, 194, 89, 23);
		panel.add(btnVolver);
	}
}
