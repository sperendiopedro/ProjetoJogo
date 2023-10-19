package com.mycompany.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class BodyJogo {
	private List<Perguntas> perguntas;
	private String resposta; 
	
    public String getResposta() {
        return resposta;
    }
	
	public void jogoPerguntas() {
		perguntas = new ArrayList<>(); 
		
		perguntas.add(new Perguntas("Qual é a cor do planeta?", "Azul", "Verde", "Vermelho"));
		perguntas.add(new Perguntas("O planeta é quente?", "Sim", "Não"));
		perguntas.add(new Perguntas("Qual o estado físico do planeta?", "Rochoso", "Gasoso"));
		perguntas.add(new Perguntas("Quantas luas tem esse planeta?", "1", "79", "2"));
		perguntas.add(new Perguntas("O planeta tem vida habitável?", "Sim","Não"));
	}
	
	 public void iniciarJogo() {
	  Scanner scanner = new Scanner(System.in);
	 
	  for (Perguntas pergunta : perguntas) {
          pergunta.exibirPergunta();
          System.out.print("Sua resposta: ");
		String resposta = scanner.nextLine(); 
	  }
	  
	 }
}