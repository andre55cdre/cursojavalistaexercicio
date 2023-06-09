package listaExercicio_3;

public class Animal {

	String nome;
	int comprimento;
	int patas;
	String cor;
	String ambiente;
	float velocidade;
	
	public Animal(
			String nome, 
			int comprimento,
			int patas,
			String cor, 
			String ambiente, 			 
			float velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public void dados() {
		System.out.println(" NomeAnimal: " + this.nome
			+ "\n Comprimento: " + this.comprimento + " cm"
			+ "\n Patas: " + this.patas
			+ "\n Cor: " + this.cor 
			+ "\n Ambiente: " + this.ambiente
			+ "\n Velocidade: " + this.velocidade + " m/s");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
}
