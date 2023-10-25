[1mdiff --git a/bin/com/mycompany/game/BodyJogo.class b/bin/com/mycompany/game/BodyJogo.class[m
[1mindex 4fc44c5..0cc8545 100644[m
Binary files a/bin/com/mycompany/game/BodyJogo.class and b/bin/com/mycompany/game/BodyJogo.class differ
[1mdiff --git a/bin/com/mycompany/game/Perguntas.class b/bin/com/mycompany/game/Perguntas.class[m
[1mindex 6ed11d0..1a60564 100644[m
Binary files a/bin/com/mycompany/game/Perguntas.class and b/bin/com/mycompany/game/Perguntas.class differ
[1mdiff --git a/bin/com/mycompany/game/Planetas.class b/bin/com/mycompany/game/Planetas.class[m
[1mindex b6afd4a..4c8aa98 100644[m
Binary files a/bin/com/mycompany/game/Planetas.class and b/bin/com/mycompany/game/Planetas.class differ
[1mdiff --git a/src/com/mycompany/game/BodyJogo.java b/src/com/mycompany/game/BodyJogo.java[m
[1mindex 99680ae..69dce41 100644[m
[1m--- a/src/com/mycompany/game/BodyJogo.java[m
[1m+++ b/src/com/mycompany/game/BodyJogo.java[m
[36m@@ -6,34 +6,46 @@[m [mimport java.util.List;[m
 import java.util.Scanner;[m
 import java.util.Random;[m
 [m
[31m-public class BodyJogo {[m
[32m+[m
[32m+[m
[32m+[m[32mpublic class BodyJogo{[m
 	private List<Perguntas> perguntas;[m
[31m-	private String resposta; [m
[32m+[m	[32mprivate List<String> respostas;[m[41m [m
 	[m
 	public void jogoPerguntas() {[m
[31m-		perguntas = new ArrayList<>(); [m
[32m+[m		[32mPlanetas planeta1 = new Planetas("Terra", "a", "b", "a", "a", "a");[m[41m [m
[32m+[m		[32mPlanetas planeta2 = new Planetas("Marte", "c", "c", "a", "d", "c");[m
[32m+[m[41m		[m
 		[m
[32m+[m[41m		[m
[32m+[m[41m		[m
[32m+[m		[32mperguntas = new ArrayList<>();[m[41m [m
 		perguntas.add(new Perguntas("Qual é a cor do planeta?", "Azul", "Verde", "Vermelho"));[m
[31m-		perguntas.add(new Perguntas("O planeta é quente?", "Sim", "Não"));[m
[32m+[m		[32mperguntas.add(new Perguntas("O planeta é quente?", "Sim", "Não", "Relativamente"));[m
 		perguntas.add(new Perguntas("Qual o estado físico do planeta?", "Rochoso", "Gasoso"));[m
[31m-		perguntas.add(new Perguntas("Quantas luas tem esse planeta?", "1", "79", "2"));[m
[31m-		perguntas.add(new Perguntas("O planeta tem vida habitável?", "Sim","Não"));[m
[32m+[m		[32mperguntas.add(new Perguntas("Quantas luas tem esse planeta?", "1", "79", "2", "Nenhuma", null));[m
[32m+[m		[32mperguntas.add(new Perguntas("O planeta tem vida habitável?", "Sim","Não", "Futuramente talvez"));[m
 	}[m
 	[m
 	[m
[31m-	public String getResposta() {[m
[31m-        return resposta;[m
[31m-    }[m
[31m-	[m
[31m-	[m
 	public void iniciarJogo() {[m
 	 try(Scanner scanner = new Scanner(System.in)){[m
 	 [m
 	  for (Perguntas pergunta : perguntas) {[m
           pergunta.exibirPergunta();[m
           System.out.print("Sua resposta: ");[m
[31m-		String resposta = scanner.nextLine(); [m
[32m+[m[32m          this.respostas.add(pergunta.obterResposta());[m
 	  }[m
 	 }[m
 	}[m
[32m+[m
[32m+[m
[32m+[m	[32mpublic List<String> getRespostas() {[m
[32m+[m		[32mreturn respostas;[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m
[32m+[m	[32mpublic void setRespostas(List<String> respostas) {[m
[32m+[m		[32mthis.respostas = respostas;[m
[32m+[m	[32m}[m
 }[m
\ No newline at end of file[m
[1mdiff --git a/src/com/mycompany/game/Perguntas.java b/src/com/mycompany/game/Perguntas.java[m
[1mindex ce79398..f3d3e5b 100644[m
[1m--- a/src/com/mycompany/game/Perguntas.java[m
[1m+++ b/src/com/mycompany/game/Perguntas.java[m
[36m@@ -1,17 +1,23 @@[m
 package com.mycompany.game;[m
[32m+[m[32mimport java.util.Scanner;[m
 [m
 public class Perguntas{[m
 	private String pergunta; [m
 	private String opA;[m
     private String opB;[m
[31m-    private String opC; [m
[32m+[m[32m    private String opC;[m
[32m+[m[32m    private String opD;[m[41m [m
[32m+[m[32m    public String resposta;[m[41m [m
    [m
     [m
[31m-    public Perguntas(String pergunta, String opA, String opB, String opC, String resposta) {[m
[32m+[m[32m    public Perguntas(String pergunta, String opA, String opB, String opC, String opD, String resposta) {[m
         this.pergunta = pergunta;[m
         this.opA = opA;[m
         this.opB = opB;[m
         this.opC = opC; [m
[32m+[m[32m        this.opD = opD;[m
[32m+[m[32m        this.resposta = "";[m[41m [m
[32m+[m[41m    [m
     }[m
      [m
     public Perguntas(String pergunta, String opA, String opB, String resposta ) {	  [m
[36m@@ -30,17 +36,22 @@[m [mpublic class Perguntas{[m
     }[m
 [m
     public void exibirPergunta() {[m
[31m-            System.out.println(pergunta);[m
[31m-            System.out.println("a) " + opA);[m
[31m-            System.out.println("b) " + opB);[m
[31m-            System.out.println("c) " + opC);[m
[32m+[m[32m            System.out.println(this.pergunta);[m
[32m+[m[32m            System.out.println("a) " + this.opA);[m
[32m+[m[32m            System.out.println("b) " + this.opB);[m
[32m+[m[32m            System.out.println("c) " + this.opC);[m
[32m+[m[32m            System.out.println("d) " + this.opD);[m[41m [m
     }[m
 [m
[31m-    public char getResposta() {[m
[31m-            return resp();[m
[32m+[m[32m    public String getResposta() {[m
[32m+[m[32m            return resposta;[m
     }[m
 [m
[31m-        public boolean verificarResposta(char resposta) {[m
[31m-            return resposta == respostaCorreta;[m
[31m-    }[m
[31m-}[m
[32m+[m[41m        [m
[32m+[m	[32mpublic String obterResposta(){[m
[32m+[m[32m    Scanner scanner = new Scanner(System.in);[m
[32m+[m[32m    System.out.print("Resposta: ");[m
[32m+[m[32m    this.resposta = scanner.nextLine();[m
[32m+[m[32m    return this.resposta;[m
[32m+[m	[32m}[m
[32m+[m[32m}[m[41m [m
\ No newline at end of file[m
[1mdiff --git a/src/com/mycompany/game/Planetas.java b/src/com/mycompany/game/Planetas.java[m
[1mindex 9eb2941..acf1e4c 100644[m
[1m--- a/src/com/mycompany/game/Planetas.java[m
[1m+++ b/src/com/mycompany/game/Planetas.java[m
[36m@@ -1,18 +1,60 @@[m
 package com.mycompany.game;[m
 [m
 public class Planetas {[m
[32m+[m	[32mprivate String nome;[m[41m [m
 	private String cor; [m
 	private String temp; [m
 	private String ef; [m
[31m-	private int luas;[m
[31m-	private boolean vida; [m
[32m+[m	[32mprivate String luas;[m
[32m+[m	[32mprivate String vida;[m[41m [m
 	[m
 	[m
[31m-	public Planetas(String cor, String temp, String ef, int luas, boolean vida) { [m
[32m+[m	[32mpublic Planetas(String nome, String cor, String temp, String ef, String luas, String vida) {[m[41m [m
[32m+[m		[32mthis.nome = nome;[m
 		this.cor = cor; [m
 		this.temp = temp; [m
 		this.ef = ef; [m
 		this.luas = luas;[m
 		this.vida = vida; [m
 	}[m
[31m-}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic String getCor() {[m
[32m+[m		[32mreturn cor;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic void setCor(String cor) {[m
[32m+[m		[32mthis.cor = cor;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic String getTemp() {[m
[32m+[m		[32mreturn temp;[m[41m [m
[32m+[m	[32m}[m
[32m+[m	[32mpublic void setTemp(String temp) {[m
[32m+[m		[32mthis.temp = temp;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic String getEF() {[m
[32m+[m		[32mreturn ef;[m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic void setEF(String ef) {[m
[32m+[m		[32mthis.ef = ef;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic String getLuas() {[m
[32m+[m		[32mreturn luas;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic void setLuas(String luas) {[m
[32m+[m		[32mthis.luas = luas;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic String getVida() {[m
[32m+[m		[32mreturn vida;[m
[32m+[m	[32m}[m
[32m+[m[41m	 [m
[32m+[m	[32mpublic void setVida(String vida) {[m
[32m+[m		[32mthis.vida = vida;[m[41m [m
[32m+[m	[32m}[m
[32m+[m[41m	[m
[32m+[m[32m}[m
\ No newline at end of file[m
