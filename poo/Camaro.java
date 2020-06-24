package poo;

public class Camaro {

	public static void main(String[] args) {
		Carro camaro = new Carro();
		
		camaro.ano = 2012;
		camaro.cor = "preto";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("cor: " + camaro.cor);
		camaro.acelerar();
		camaro.ligar();
		camaro.desligar();

	}

}
