package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	
	
	//construtor
	public Conta() {
		System.out.println("Ag�ncia 135809");
	}
	
	
	//m�todos 
	public void exibirSaldo() {
		System.out.println("saldo: R$ " + saldo);
	}
}

