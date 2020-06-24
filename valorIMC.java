package Exercicios;

/**
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author matheus alves
 *
 */
public class valorIMC {

	public static void main(String[] args) {
		//variáveis
		double peso, altura, valor;
		//Objeto leitor 
		Scanner leitor = new Scanner(System.in);
		//obejto formatador 
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Cáculo do IMC");
		//entrada
		System.out.print("Digite seu altura: ");
		peso = leitor.nextDouble();
		System.out.print("Digite sua peso: ");
		altura = leitor.nextDouble();
		//processamento
		valor = peso /(altura * altura);
		//saída
		System.out.println("IMC: " + formatador.format(valor));
		if (valor < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (valor >= 18.5 && valor <= 24.9) {
			System.out.println("Peso normal");
		} else {
			System.out.println("Sobrepeso");
		}
        leitor.close();
	}

}
