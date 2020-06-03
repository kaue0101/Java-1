package seguros;

import contas.Conta;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc3 = new Conta();
		cc3.cliente = "Edilson Dos Santos";
		cc3.saldo = 10000;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();
		System.out.println("------------------");

	}

}
