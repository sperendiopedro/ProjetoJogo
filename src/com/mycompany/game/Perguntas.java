package com.mycompany.game;
import java.util.Scanner;

public class Perguntas{
	private String perguntas; 
	private String opA;
    private String opB;
    private String opC;
    private String opD; 
    public String resposta; 
   
    

    public Perguntas(String pergunta, String opA, String opB, String opC, String opD) {
        this.perguntas = pergunta;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        this.resposta = "";
    }
    

    public Perguntas(String pergunta, String opA, String opB, String opC) {
        this.perguntas = pergunta;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = "";
        this.resposta = "";
    }
    
    public Perguntas(String pergunta, String opA, String opB) {
        this.perguntas = pergunta;
        this.opA = opA;
        this.opB = opB;
        this.opC = "";
        this.opD = "";
        this.resposta = "";
    }
	
    public Perguntas() {
	}


	public String getPergunta(){
        return perguntas;
    }

    public String exibirPergunta(){
        System.out.println(this.perguntas);
        System.out.println("a) " + this.opA);
        System.out.println("b) " + this.opB);
        if(this.opC.compareTo("") != 0 ) {
        	System.out.println("c) " + this.opC);
        }
        if(this.opD.compareTo("") != 0){
            System.out.println("d) " +this.opD);
        }
        
        return perguntas;
    }
    
    public String obterResposta(){
        System.out.print("Resposta: ");
        Scanner scanner = new Scanner(System.in);
        this.resposta = scanner.nextLine().toLowerCase();
        return this.resposta;
    }
} 

