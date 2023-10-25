package com.mycompany.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 



public class BodyJogo{
	private List<Perguntas> perguntas;
	private List<Planetas> planetas; 
	private List<String> respostas; 
	
	public BodyJogo() {
		this.perguntas = new ArrayList<>(); 
		this.perguntas.add(new Perguntas("Qual é a cor do planeta?", "Azul", "Verde", "Bege", "Vermelho", null));
		this.perguntas.add(new Perguntas("O planeta é quente?", "Sim", "Não", "Relativamente"));
		this.perguntas.add(new Perguntas("Qual o estado físico do planeta?", "Rochoso", "Gasoso"));
		this.perguntas.add(new Perguntas("Quantas luas tem esse planeta?", "1", "79", "2", "Nenhuma","teste"));
		this.perguntas.add(new Perguntas("O planeta tem vida habitável?", "Sim","Não", "Futuramente talvez")); 
	}
	
	
	
	public void iniciarJogo() {

		for (Perguntas perguntas : perguntas) 
        {
            perguntas.exibirPergunta();
        	System.out.print("Resposta: ");
            Scanner scanner = new Scanner(System.in);
            perguntas.resposta = scanner.nextLine();
            System.out.println(perguntas.resposta); 
        
        }
    }
//	public List<String> getRespostas() {
	//	return respostas;
	//}


	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}
}