/**
 * 
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author matheus alves
 *
 */
public class Media {

	public static void main(String[] args) {
		//ctrl+shift+f alinha o código
		//variáveis:
		double nota1, nota2, media;
		//Objeto leitor (usado apra capturar os dados)
		Scanner leitor = new Scanner(System.in);
		//obejto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat ("0.0");
		System.out.println("Cáculo da Média");
		//entrada
		System.out.print("Digite a nota um: ");
		nota1 = leitor.nextDouble();
		System.out.print("Digite a nota dois: ");
		nota2 = leitor.nextDouble();
		//processamento
		media = (nota1 + nota2) / 2;
		System.out.println("Média: " + formatador.format(media));
		if (media< 2) {
			System.out.println("REPROVADO");
		}else if(media >= 2 && media < 5) {
			System.out.println("RECUPERAÇÃO");
		}else {
			System.out.println("APROVADO");
		}
		
		leitor.close();
		
	}

}
