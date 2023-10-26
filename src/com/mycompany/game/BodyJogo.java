package com.mycompany.game;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 


public class BodyJogo{
	private List<Perguntas> perguntas; 
	private List<String> respostas; 
	private Planetas planeta1;
	private Planetas planeta2; 
	
	public BodyJogo() { //CONSTRUTOR
		this.perguntas = new ArrayList<>(); 
		this.perguntas.add(new Perguntas("Qual é a cor do planeta?", "Azul", "Tons claros", "Bege", "Vermelho"));
		this.perguntas.add(new Perguntas("\nO planeta é quente?", "Sim", "Não", "Relativamente"));
		this.perguntas.add(new Perguntas("\nQual o estado físico do planeta?", "Rochoso", "Gasoso"));
		this.perguntas.add(new Perguntas("\nQuantas luas tem esse planeta?", "1", "79", "2", "Nenhuma"));
		this.perguntas.add(new Perguntas("\nO planeta tem vida habitável?", "Sim","Não", "talvez futuramente")); 
		
		this.respostas = new ArrayList<>();
		this.planeta1 = new Planetas("Terra","a", "b", "a", "a", "a"); 
		this.planeta2 = new Planetas("Marte","d", "c", "a", "d", "c");
	}
	
	
	
	public void iniciarJogo() {
		for (Perguntas perguntas : perguntas) 
        {
            perguntas.exibirPergunta();
            this.respostas.add(perguntas.obterResposta());
        }
		Planetas vencedor = this.obterVencedor();
		System.out.println("O planeta vencedor é: " + vencedor.getNomePlaneta());
	}
	
	public Planetas obterVencedor() {
		Planetas vencedor = planeta1;
		if(vencedor.obterPlaneta(respostas) < planeta2.obterPlaneta(respostas)) vencedor = planeta2; 
		return vencedor;
		
	}
}