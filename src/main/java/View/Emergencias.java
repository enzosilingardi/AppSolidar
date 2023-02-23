package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		btnAvisoRobo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAvisoRobo.setBounds(115, 93, 176, 30);
		panel.add(btnAvisoRobo);
		
		JButton btnAvisoAccidente = new JButton("Aviso de accidente");
		btnAvisoAccidente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAvisoAccidente.setBounds(115, 134, 176, 30);
		panel.add(btnAvisoAccidente);
		
		JLabel lblEmergencias = new JLabel("Emergencias");
		lblEmergencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmergencias.setBounds(115, 11, 176, 30);
		panel.add(lblEmergencias);
		
		JButton btnAvisoConflicto = new JButton("Aviso de Conflicto Domestico");
		btnAvisoConflicto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAvisoConflicto.setBounds(115, 52, 176, 30);
		panel.add(btnAvisoConflicto);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(337, 194, 89, 23);
		panel.add(btnVolver);
	}
}
