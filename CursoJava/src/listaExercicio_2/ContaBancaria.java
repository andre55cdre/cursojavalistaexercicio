package listaExercicio_2;

public class ContaBancaria {
	String nomeCliente;
	int numConta;
	float saldo;
	
	public void sacar(float valor) throws Exception{
		if(valor > this.saldo) {
			// System.out.println("Error");
			throw new Exception("Não foi possível sacar. Saldo insuficiente.");
		}
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(float valor) throws Exception{
		if(valor < 0) {
			throw new Exception("Não foi possível depositar. Valor inválido.");
		}
		this.saldo = valor + this.saldo;
	}
}
