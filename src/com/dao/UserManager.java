package com.dao;

import com.metier.Usager;

public class UserManager implements DaoUser {

	public void addUsage(Usager u) {
		
		DbInteraction.Connect();
		String sql="insert into usager 	(nom,prenom,adresse,tel) values ('"+u.getNom()+"','"+u.getPrenom()+"','"+u.getAdresse()+"','"+u.getTel()+"')";	    
	    DbInteraction.update(sql);	
	    DbInteraction.disconnect();
	   
	}

	@Override
	public void afficher() {
		
		DbInteraction.Connect();
		String sql="select * from usager";
		  DbInteraction.select(sql);	
		   
		  
		
	}



	
	

	
	
	}


