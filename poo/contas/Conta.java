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


	//método sem retorno com parâmetros(dados = variaveis)
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: " + valor);
		}
	

//método sem retorno com parâmetros(dados = variaveis)
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: " + valor);
		}
	
	//metodo sem retorno com objeto
	//conta -> classe modelo
	//destino e o objeto
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: " + valor);
		
	}

	//metodo com retorno
	double soma(double conta1, double conta2) {
		double total = conta1 +conta2;
		return total;
	}
}
