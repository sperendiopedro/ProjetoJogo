package com.mycompany.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 



public class BodyJogo{
	private List<Perguntas> perguntas;
	private List<String> respostas; 
	
	public void jogoPerguntas() {
		
		
		Planetas planeta1 = new Planetas("Terra", "a", "b", "a", "a", "a"); 
		Planetas planeta2 = new Planetas("Marte", "c", "c", "a", "d", "c");
		
		this.perguntas = new ArrayList<>(); 
		this.perguntas.add(new Perguntas("Qual é a cor do planeta?", "Azul", "Verde", "Vermelho"));
		this.perguntas.add(new Perguntas("O planeta é quente?", "Sim", "Não", "Relativamente"));
		this.perguntas.add(new Perguntas("Qual o estado físico do planeta?", "Rochoso", "Gasoso"));
		this.perguntas.add(new Perguntas("Quantas luas tem esse planeta?", "1", "79", "2", "Nenhuma","teste"));
		this.perguntas.add(new Perguntas("O planeta tem vida habitável?", "Sim","Não", "Futuramente talvez"));
	}
	
	
	public void iniciarJogo() {
	 Scanner scanner = new Scanner(System.in); 
	  for (Perguntas perguntas : this.perguntas) {
          perguntas.exibirPergunta();
          System.out.print("Sua resposta: ");
          this.respostas.add(perguntas.obterResposta());
	  }
	}


	public List<String> getRespostas() {
		return respostas;
	}


	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}
}