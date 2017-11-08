package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import logica.AdaptadorPersonaje;
import logica.Personaje;


import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pantalla1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla1 frame = new pantalla1();
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
	public pantalla1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMago = new JLabel("New label");
		lblMago.setIcon(new ImageIcon(pantalla1.class.getResource("/gui/mago.png")));
		lblMago.setBounds(37, 27, 200, 200);
		contentPane.add(lblMago);
		
		JButton btnAtacar = new JButton("ATACAR");
		btnAtacar.setFont(new Font("Segoe Print", Font.BOLD, 17));
		btnAtacar.setBounds(277, 202, 135, 48);
		contentPane.add(btnAtacar);
		btnAtacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
	}
}
