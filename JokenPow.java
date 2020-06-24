package cursojava;

import java.util.Scanner;

public class JokenPow {
	
	public static void main(String[] args) {
		int jogador;
		Scanner mao = new Scanner(System.in);
		
		System.out.println("________________________");
		System.out.println("1. Papel");
		System.out.println("2. Pedra");
		System.out.println("3. Tesoura");
		System.out.println("Qual Sua Escolha? ");
		System.out.println("________________________");
		jogador=mao.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Escolha: Pedra");
		break;
		case 2:
			System.out.println("Escolha: Papel");
		break;
		case 3:
			System.out.println("Escolha: Tesoura");
		break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		int computador = (int) (Math.random() *3+1);
		switch (computador) {
	case 1:
		System.out.println("Comp opção: Pedra");
	break;
	case 2:
		System.out.println("Comp opção: Papel");
	break;
	case 3:
		System.out.println("Comp opção: Tesoura");
	break;
	}
		if (jogador != computador) {
			if ((jogador==1 && computador ==3)|| (jogador ==2 && computador==1) || (jogador==3 && computador==2)) {
				System.out.println("Jogador Vence");
			}else{
				System.out.println("Jogador Perde");}
		}else {
			System.out.println("Empate");
		}
		
		
		
	}
}
