package exercicios;

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
		System.out.print("Digite seu peso: ");
		peso = leitor.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = leitor.nextDouble();
		//processamento
		valor = peso /(altura * altura);
		//saída
		System.out.println("IMC: " + formatador.format(valor));
		if (valor < 18.5) {
			System.out.println("Magreza Patólogica");
		}else if(valor >= 20 && valor < 25) {
			System.out.println("Peso Normal");
		}else if (valor <= 25){
			System.out.println("Sobrepeso");
			
			}else {
				System.out.println("Obesidade");
		}
		
		leitor.close();
		
	}

}
