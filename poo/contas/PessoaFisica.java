package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.cliente = "Leandro ramos";
		cc1.saldo = 10000;
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("------------------");
		Conta cc2 = new Conta();
		cc2.cliente = "Robson Vaamonde";
		cc2.saldo = 8500;
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		System.out.println("------------------");
	}

}
