package listaExercicio_2;

public class ContaPoupanca extends ContaBancaria{
	int diaDeRendimento;
	
	public float calcularNovoSaldo(int taxa) {
		return ((taxa/100f) * super.saldo) + super.saldo;
	}
}
