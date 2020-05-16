package cursoJava;

public class JokenPow {
	
	public static void main(String[] args) {
		String jogador;
		String leia;
		
		System.out.println("#");
		System.out.println("1. Papel");
		System.out.println("2. Pedra");
		System.out.println("3. Tesoura");
		System.out.println("Qual Sua Escolha?: ");
		jogador = leia.nextInt();
		System.out.println("#");
		
		//inicio da logica geral
		switch (jogador) {
		case 1:
			System.out.println("Escolha: Papel");
			break;
		case 2:
			System.out.println("Escolha: Pedra");
			break;
		case 3:
			System.out.println("Escolha: Tesoura");
		}
	}
}
