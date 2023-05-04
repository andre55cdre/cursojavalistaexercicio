package listaExercicio_3;

public class Mamifero extends Animal {
	
	String alimento;

	public Mamifero(
			String nome, 
			int comprimento,
			int patas,
			String cor, 
			String ambiente, 
			float velocidade, 			
			String alimento) {
		super(nome, comprimento, patas, cor, ambiente,  velocidade);
		this.alimento = alimento;
	}
		
	@Override
	public void dados() {
		super.dados();
		System.out.println("\n Alimento: " + this.alimento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
}
