package com.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class IHMAcceuil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHMAcceuil frame = new IHMAcceuil();
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
	public IHMAcceuil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 563, 452);
		contentPane.add(panel);
		
		JButton btnGestionUsager = new JButton("Gestion Oeuvres et Exemplaires");
		btnGestionUsager.setForeground(Color.BLUE);
		btnGestionUsager.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnGestionDesUsagers = new JButton("Gestion Des Usagers");
		btnGestionDesUsagers.setForeground(Color.BLUE);
		btnGestionDesUsagers.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnGestionRservationsEt = new JButton("Gestion R\u00E9servations et Emprunts");
		btnGestionRservationsEt.setForeground(Color.BLUE);
		btnGestionRservationsEt.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblGestion = new JLabel("Gestion Biblioth\u00E8que");
		lblGestion.setForeground(new Color(0, 51, 102));
		lblGestion.setFont(new Font("Tahoma", Font.BOLD, 27));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\RACHIDA PROJET\\intervace java\\umlprojet\\umlprojet\\src\\icons\\16976567_1850130248559056_992998201_n.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addGap(122)
							.addComponent(lblGestion))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(80)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnGestionRservationsEt, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnGestionUsager, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnGestionDesUsagers, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(36)
							.addComponent(lblGestion)))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addComponent(btnGestionDesUsagers, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(btnGestionUsager, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btnGestionRservationsEt, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(55))
		);
		panel.setLayout(gl_panel);
	}
}
