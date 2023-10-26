package com.mycompany.game;

import java.util.List;

public class Planetas {
	private String nome; 
	private String cor; 
	private String temp; 
	private String ef; 
	private String luas;
	private String vida;
	
	public Planetas(String Planeta1, String cor, String temp, String ef, String luas, String vida) { 
		this.nome = Planeta1;
		this.cor = cor; 
		this.temp = temp; 
		this.ef = ef;
		this.luas = luas;
		this.vida = vida; 
	}
	
	public double obterPlaneta(List<String> respostas) {
		double contador = 0;
		if(this.cor.compareTo(respostas.get(0)) == 0)  contador += 1;
		if(this.temp.compareTo(respostas.get(1)) == 0) contador += 1; 
		if(this.ef.compareTo(respostas.get(2))== 0)    contador += 1;
		if(this.luas.compareTo(respostas.get(3)) == 0) contador +=1;
		if(this.vida.compareTo(respostas.get(4))== 0) contador +=1; 
		return contador; 
	}
	
	public String getNomePlaneta(){
	    return this.nome;
	}
}