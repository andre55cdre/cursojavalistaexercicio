package listaExercicio_2;

public class Contas {
	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		
		cb.nomeCliente = "Pedro Felipe";
		cb.numConta = 123456789;
		cb.saldo = 1500f;
		
		try {
			cb.sacar(200f);
			//cb.sacar(2000f);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		System.out.println(cb.saldo);
		System.out.println("Nome: "+ cb.nomeCliente+" / Conta:"+ cb.numConta);
		
		try {
			cb.depositar(2000f);	
			//cb.depositar(-200f);	
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		System.out.println(cb.saldo);
		System.out.println("Nome: "+ cb.nomeCliente+" / Conta:"+ cb.numConta);
		
		
		ContaEspecial ce = new ContaEspecial();
		
		ce.nomeCliente = "Ana Maria";
		ce.numConta = 3456789;
		ce.saldo = 250f;
		
		try {
			//ce.sacar(200f);
			ce.sacar(300f);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		System.out.println(ce.saldo);
		System.out.println("Nome: "+ ce.nomeCliente+" / Conta:"+ ce.numConta);
		
		try {
			ce.depositar(200f);	
			//ce.depositar(-200f);	
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		System.out.println(ce.saldo);
		System.out.println("Nome: "+ ce.nomeCliente+" / Conta:"+ ce.numConta);
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.nomeCliente = "Jose";
		cp.numConta = 12345699;
		cp.saldo = 100f;
		cp.saldo = cp.calcularNovoSaldo(50);
		
		System.out.println(cp.saldo);
		System.out.println("Nome: "+ cp.nomeCliente+" / Conta:"+ cp.numConta);
	}
}
