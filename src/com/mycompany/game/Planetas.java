package com.mycompany.game;

public class Planetas {
	private String nome; 
	private String cor; 
	private String temp; 
	private String ef; 
	private String luas;
	private String vida; 
	
	
	public Planetas(String nome, String cor, String temp, String ef, String luas, String vida) { 
		this.nome = nome;
		this.cor = cor; 
		this.temp = temp; 
		this.ef = ef; 
		this.luas = luas;
		this.vida = vida; 
	}
	
	public String getCor() {
		return cor; 
	}
	
	public void setCor(String cor) {
		this.cor = cor; 
	}
	
	public String getTemp() {
		return temp; 
	}
	public void setTemp(String temp) {
		this.temp = temp; 
	}
	
	public String getEF() {
		return ef;
	}
	
	public void setEF(String ef) {
		this.ef = ef; 
	}
	
	public String getLuas() {
		return luas; 
	}
	
	public void setLuas(String luas) {
		this.luas = luas; 
	}
	
	public String getVida() {
		return vida;
	}
	 
	public void setVida(String vida) {
		this.vida = vida; 
	}
	
}