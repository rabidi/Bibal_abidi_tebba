package com.metier;



public class Usager {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String tel;

	
	public Usager( String nom, String prenom, String adresse, String tel) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Usager(String nom, String prenom) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Usager [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	

}
