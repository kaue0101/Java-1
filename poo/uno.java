package poo;

public class uno {

	public static void main(String[] args) {
		Carro uno = new Carro(1991, "Branco");

		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + uno.ano);
		System.out.println("cor: " + uno.cor);
		uno.ligar();
	}

}
