package com.controller;

import com.dao.UserManager;
import com.metier.Usager;

public class IhmUserController {
	
	static UserManager UsagerManager;
	public IhmUserController() {
		

		UsagerManager = new UserManager();
	
	}
	public void addUsager(String nom,String prenom,String adresse,String tel){
		
	Usager u=new Usager( nom, prenom, adresse, tel);
	UsagerManager.addUsage(u);
	
	
	}
	
	public void afficher(){
		UsagerManager.afficher();
		
	}
	
	
	
	
}







	

