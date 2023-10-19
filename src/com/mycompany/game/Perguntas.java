package com.mycompany.game;

public class Perguntas{
	private String pergunta; 
	private String opA;
    private String opB;
    private String opC; 
   
    
    public Perguntas(String pergunta, String opA, String opB, String opC, String resposta) {
        this.pergunta = pergunta;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC; 
    }
     
    public Perguntas(String pergunta, String opA, String opB, String resposta ) {	  
        this.opA = opA;
        this.opB = opB;
    }
    
    public Perguntas(String pergunta, String opA, String opB) {	  
        this.opA = opA;
        this.opB = opB;
    }
	
	
    public String getPergunta(){
        return pergunta;
    }

    public void exibirPergunta() {
            System.out.println(pergunta);
            System.out.println("a) " + opA);
            System.out.println("b) " + opB);
            System.out.println("c) " + opC);
    }

    public char getResposta() {
            return resp();
    }

        public boolean verificarResposta(char resposta) {
            return resposta == respostaCorreta;
    }
}
