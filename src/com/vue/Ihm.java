package com.vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.controller.IhmUserController;
import com.metier.Usager;



public class Ihm extends JFrame implements Action{
	
	private static final long serialVersionUID = 1L;
	
	JButton validerButton;
	JTextField idTxt, nomTxt, prenomTxt;
	JLabel idLabel, nomLabel, prenomLabel;

	JPanel itemsPanel;	
	GridLayout itemsGL;
	Dimension maxSize;
	
	
	public Ihm(){		
		
		super();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		// initiation des élements du centre
		
		idTxt= new JTextField(20);
		nomTxt= new JTextField(20);
		prenomTxt= new JTextField(20);
		
		idLabel=new JLabel("id");
		nomLabel= new JLabel("NOM");
		prenomLabel = new JLabel("PRENOM");
		
		
		itemsGL= new GridLayout(4, 2);
		itemsGL.setHgap(10);
		itemsGL.setVgap(10);
		itemsPanel= new JPanel(itemsGL);
		
		
		itemsPanel.add(idLabel);
		itemsPanel.add(idTxt);
	
		itemsPanel.add(nomLabel);
		itemsPanel.add(nomTxt);
		
		itemsPanel.add(prenomLabel);
		itemsPanel.add(prenomTxt);
		
		
		validerButton= new JButton("Ajouter");
		validerButton.addActionListener(this);

		this.add(itemsPanel,BorderLayout.CENTER);
		this.add(validerButton,BorderLayout.SOUTH);
		this.setSize(600, 600);
		setVisible(true); // on aurai pu ecrire this.setVisible(true);
	}


	public Object getValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==validerButton){
			int id= Integer.valueOf(idTxt.getText());
			String nom= nomTxt.getText();
			String prenom= prenomTxt.getText();
		//	IhmUserController.addUser(id, nom, prenom);
		}
		
	}
	
	
}
