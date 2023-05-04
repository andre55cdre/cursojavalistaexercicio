package listaExercicio_3;

public class Peixe extends Animal {
	
	String caracteristica;

	public Peixe(
			String nome, 
			int comprimento, 
			int patas,
			String cor, 
			String ambiente, 
			float velocidade, 			
			String caracteristica) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}
	
	@Override
	public void dados() {
		super.dados();
		System.out.println("\n Caracteristica: " + this.caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
}