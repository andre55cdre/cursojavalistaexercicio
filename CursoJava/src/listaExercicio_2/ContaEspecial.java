package listaExercicio_2;

public class ContaEspecial extends ContaBancaria{
	float limite;
	
	@Override
	public void sacar(float valor) throws Exception{
		if(valor > super.saldo) {
			if( (valor - super.saldo) > limite) {
				//System.out.println("Error");
				throw new Exception("Não foi possível sacar. Limite máximo de valor foi atingido.");
			}
			throw new Exception("Não foi possível sacar. Saldo insuficiente.");
		}
		super.saldo = super.saldo - valor;
	}
}
