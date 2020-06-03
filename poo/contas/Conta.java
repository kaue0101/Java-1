package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	
	
	//construtor
	public Conta() {
		System.out.println("Agência 135809");
	}
	
	
	//métodos 
	public void exibirSaldo() {
		System.out.println("saldo: R$ " + saldo);
	}
}

