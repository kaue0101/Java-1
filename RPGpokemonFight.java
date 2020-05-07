package JogoRPG;

import java.util.Scanner;
import java.util.Random;

public class RPGFightGame {
//seleção dos golpes J1
 static int ataqueUsuario() {
  @SuppressWarnings("resource")
Scanner leitor = new Scanner(System.in);
  System.out.println("Escolha o ataque");
  System.out.println("(1) - Ataque");
  System.out.println("(2) - Ataque Forte");
  return leitor.nextInt();
 }

 static int ataqueComputador() {
  Random gerador = new Random();
  return gerador.nextInt(3) + 1; //retorna numero entre 1 e 3.
 }
//Inteface de config dos golpes//
 static void imprimirHP(int hpJogador, int hpComputador, int contagemAtqForte) {
  System.out.println("=-=-=-=-=-=-=-=-=-=-=");
  System.out.println("- HP Jogador: " + hpJogador);
  System.out.println("- HP Computador: " + hpComputador);
  System.out.println("* Ataques Fortes Restantes: " + contagemAtqForte);
  System.out.println("=-=-=-=-=-=-=-=-=-=-=");
 }

 //Estrutura da batalha//
 static int batalha() {
  int hpJogador = 150;
  int hpComputador;
  int contagemAtqForte = 5;
  int escolhaAtaque;
  //inimigoHP
  int i = 1;
  
//incremento de HP e incremento de "inicio"//
  while (hpJogador > 0) {
   hpComputador = 10 + i;

   System.out.println("=-=-=-=-=-=-=-=-=-=-=");
   System.out.println("INÍCIO " + i);
   System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");

   //Atq e dano do jogador//
   while (hpJogador > 0 && hpComputador > 0) {
    imprimirHP(hpJogador, hpComputador, contagemAtqForte);
    escolhaAtaque = ataqueUsuario();
    switch (escolhaAtaque) {
    case 1:
     System.out.println("Jogador acertou um ataque.");
     hpComputador -= 7;
     break;
    case 2:
     System.out.println("Jogador acertou um ataque forte!.");
     hpComputador -= 20;
     contagemAtqForte--; //contagemEspecial = contagemEspecial -1 
     break;
    default:
     System.out.println("Opcao invalida");
     break;
    }
    if (hpComputador > 0) {
     escolhaAtaque = ataqueComputador();
     switch (escolhaAtaque) {
     case 1:
      System.out.println("Computador acertou um ataque.");
      //a cada 10 adversários 1 é incrementado (não esquecer, pode dar problema aqui)//
      hpJogador -= 2 + (int)(i / 10);
      break;
     case 2:
      System.out.println("Computador acertou um chute.");
      hpJogador -= 3 + (int)(i / 10);
      contagemAtqForte--; //contagemespecial = contagemEspecial -1 (descobrir como parar no zero)
      break;
     case 3:
      System.out.println("Computador aplicou um ataque forte!.");
      hpJogador -= 4 + (int)(i / 20);
      break;
     }
    } else {
     System.out.println("Inimigo derrotado");
    } 
   }
   //adicionar 5d vida por inimigo até 150
   if (hpJogador > 0) {
    hpJogador += 2;
    if (hpJogador > 150) {
     hpJogador = 150;
    }
    //a cada inimigo multiplo de 10 aumentar 1 de atqForte até 5//
    if (i % 10 == 0) {
    	contagemAtqForte++;
     if (contagemAtqForte > 5) {
    	 contagemAtqForte = 5;
     }
    }
   }
   i++;
  }
  return i; 
 } 

 public static void main(String[] args) {
	 //controle de jogar ou não e recorde
  @SuppressWarnings("resource")
Scanner leitor = new  Scanner(System.in);
  int continua = 1;
  int recorde = 0;
  while (continua == 1) {
   int pontos = batalha();
   System.out.println("Usuario chegou a " + pontos + " pontos.");
   if (pontos > recorde) {
    recorde = pontos;
   }
   //Reload do jogo e recorde guardado//
   System.out.println("RECORDE ATUAL = " + recorde);
   System.out.println("Fim de jogo. Deseja continuar? (1) Sim (2) Não");
   continua = leitor.nextInt();
  }
       }
}