package cursoJava;

public class fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 18;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		nome = "Matheus Alves";
		System.out.println("Uso de variáveis na linguagem Java");
		System.out.println("Exemplos: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo:" + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println("_______________________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritimeticos e atribuições");
		System.out.println("exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		System.out.println("i %= 5       | i = " + (i %= 5));
		i++;
		System.out.println("i++       | i = " + i);
		System.out.println("i--       | i = " + i);
		System.out.println("_______________________________________________");
		System.out.println("");
		System.out.println("Estruturas de controle");
		System.out.println("");
		System.out.println("Estrutura de controle condicional");
		System.out.println("");
		System.out.println("Exemplo1- uso if");
		if (sexo == 'M') {
			System.out.println("Alistamento obrigatorio");
		}
		System.out.println("Exemplo2- uso if else");
		if (idade < 18) {
			System.out.println("menor de idade");
		} else {
			System.out.println("maior de idade");
		}
		System.out.println("Exemplo3- uso else if");
		if (idade < 16) {
			System.out.println("proibido");
		} else if (idade >= 18 && idade <= 80) {
			System.out.println("vota ai");
		} else {
			System.out.println("vota se quiser");
		}
		System.out.println("Exemplo3- uso do switch case");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. cadastro de usuarios");
		System.out.println("3. relatorios ");
		int opcao = 1;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUARIOS");
			break;
		case 3:
			System.out.println("INVALIDO");
			break;
		}
		System.out.println("_______________________________________________");
		System.out.println("");
		System.out.println("Estruturas de repetição");
		System.out.println("");
		System.out.println("Exemplo5 - uso do 'for'");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo6 - Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("");
		System.out.println("Exemplo7 - uso do 'while'");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo8 - uso do 'do while'");
		char novoJogo;
		do {
			System.out.println("Jogar dnv (S/N)?");
			novoJogo = 'n';
		}while (novoJogo == 's');
		System.out.println("GAME OVER");
	}
}
