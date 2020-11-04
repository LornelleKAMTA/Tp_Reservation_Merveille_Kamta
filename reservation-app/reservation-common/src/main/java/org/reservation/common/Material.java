package org.reservation.common;

public class Material {
	private int id;
	private String nom;
	private String marque;
	private String num_serie;
	public Material(int id, String nom, String marque, String num_serie) {
		super();
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.num_serie = num_serie;
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
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getNum_serie() {
		return num_serie;
	}
	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}
	@Override
	public String toString() {
		return "Material [id=" + id + ", nom=" + nom + ", marque=" + marque + ", num_serie=" + num_serie + "]";
	}
	
}
