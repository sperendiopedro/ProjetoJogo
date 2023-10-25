package com.mycompany.game;
import java.util.Scanner;

public class Perguntas{
	private String perguntas; 
	private String opA;
    private String opB;
    private String opC;
    private String opD; 
    public String resposta; 
   
    
    public Perguntas(String perguntas, String opA, String opB, String opC, String opD, String resposta) {
        this.perguntas = perguntas;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC; 
        this.opD = opD;
        this.resposta = ""; 
    
    }
     
    public Perguntas(String perguntas, String opA, String opB, String resposta ) {	  
        this.perguntas = "";
    	this.opA = opA;
        this.opB = opB;
    }
    
    public Perguntas(String perguntas, String opA, String opB) {	  
        this.perguntas = "";
    	this.opA = opA;
        this.opB = opB;
    }
	
	
    public String getPergunta(){
        return perguntas;
    }

    public void exibirPergunta() {
            System.out.println(this.perguntas);
            System.out.println("a) " + this.opA);
            System.out.println("b) " + this.opB);
            System.out.println("c) " + this.opC);
            System.out.println("d) " + this.opD); 
    }

    public String getResposta() {
            return resposta;
    }

        
	public String obterResposta(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Resposta: ");
    this.resposta = scanner.nextLine();
    return this.resposta;
	}
} 