package listaExercicio_3;

public class MainAnimal {
	public static void main(String[] args) {
		
		Animal camelo 		= new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2.0f);
		Peixe tubarao 		= new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
		Mamifero ursoCanada = new Mamifero("Urso do Canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");
		
		System.out.println("Zoo");
		System.out.println("\n\n");
		camelo.dados();
		System.out.println("\n\n");
		tubarao.dados();
		System.out.println("\n\n");
		ursoCanada.dados();
		System.out.println("\n\n");	
		
	}
}