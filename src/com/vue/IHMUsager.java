package com.vue;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.UIManager;

public class IHMUsager {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblemprunt;
	private JLabel lblReservation;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHMUsager window = new IHMUsager();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IHMUsager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Gestion usager");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Californian FB", Font.BOLD, 26));
		lblNewLabel.setBounds(266, 11, 217, 31);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(">> Ussager");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setBounds(22, 104, 96, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(">>Oeuvres");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBackground(Color.BLUE);
		lblNewLabel_2.setBounds(22, 147, 86, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblemprunt = new JLabel(">>Emprunt");
		lblemprunt.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblemprunt.setForeground(Color.BLUE);
		lblemprunt.setBounds(22, 181, 86, 25);
		frame.getContentPane().add(lblemprunt);
		
		lblReservation = new JLabel(">> Reservation");
		lblReservation.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblReservation.setForeground(Color.BLUE);
		lblReservation.setBounds(22, 217, 104, 25);
		frame.getContentPane().add(lblReservation);
		
		lblNewLabel_3 = new JLabel("Capy..........................");
		lblNewLabel_3.setBounds(194, 415, 312, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		table_1.setForeground(Color.BLUE);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(0, 0, 136, 440);
		frame.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setBounds(136, 395, 471, 45);
		frame.getContentPane().add(table_2);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(Color.WHITE);
		table.setBounds(136, 0, 471, 52);
		frame.getContentPane().add(table);
		
		btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(168, 130, 117, 59);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Modifier");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(310, 133, 117, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(453, 133, 117, 59);
		frame.getContentPane().add(btnNewButton_2);
	}
}
