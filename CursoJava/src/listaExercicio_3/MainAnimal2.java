package listaExercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAnimal2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Animal> animais = new ArrayList<Animal>();
		List<Peixe> peixes = new ArrayList<Peixe>();
		List<Mamifero> mamiferos = new ArrayList<Mamifero>();
				
		int adicionarAnimal = 0;
		int opcaoSelecionado = 0;
		
		do {
			System.out.println("Escolha uma opção:"
					+ "\n 1 - Animal"
					+ "\n 2 - Peixe"
					+ "\n 3 - Mamifero\n");
			
			opcaoSelecionado = sc.nextInt();
			
			if (opcaoSelecionado < 1 || opcaoSelecionado > 3) {
				System.out.println("Opção inválida!");
				continue;
			}
			
			System.out.println("Defina o nome: ");
			String nome = sc.next();
			
			System.out.println("Defina o comprimento: ");
			int comprimento = sc.nextInt();
			
			System.out.println("Defina a quantidade de patas: ");
			int patas = sc.nextInt();
			
			System.out.println("Defina a cor: ");
			String cor = sc.next();
			
			System.out.println("Defina o ambiente: ");
			String ambiente = sc.next();
			
			System.out.println("Defina a velocidade: ");
			float velocidade = sc.nextFloat();
			
			switch (opcaoSelecionado) {
				case 1:
					if (animais.size() >= 10) {
						System.out.println("Limite de animais atingido!");
						continue;
					}
					
					Animal animal = new Animal(nome, comprimento, patas, cor, ambiente, velocidade );
					animais.add(animal);
					break;
				case 2:
					if (peixes.size() >= 10) {
						System.out.println("Limite de peixes atingido!");
						continue;
					}
					
					System.out.println("Defina a caracteristica: ");
					String caracteristica = sc.next();
					
					Peixe peixe = new Peixe(nome, comprimento, patas, cor, ambiente, velocidade, caracteristica);
					peixes.add(peixe);
					break;
				case 3:
					if (mamiferos.size() >= 10) {
						System.out.println("Limite de mamiferos atingido!");
						continue;
					}
									
					System.out.println("Defina o alimento: ");
					String alimento = sc.next();
	
					Mamifero mamifero = new Mamifero(nome, comprimento, patas, cor, ambiente, velocidade, alimento);
					mamiferos.add(mamifero);
					break;
				default:
					System.out.println("Opção inválida!");
					continue;
			}
			
			
			System.out.println("Deseja continuar? 1 (sim) ou 0 (não) \n");
			adicionarAnimal = sc.nextInt();
			
		} while (adicionarAnimal == 1);
		
		System.out.println("\n\nZoo");
		System.out.println("\nAnimais\n");
		for (Animal animal : animais) {
			animal.dados();
			System.out.println("\n\n");
		}
		System.out.println("\nPeixes\n");
		for (Peixe peixe: peixes) {
			peixe.dados();
			System.out.println("\n\n");
		}
		System.out.println("\nMamiferos\n");
		for (Mamifero mamifero: mamiferos) {
			mamifero.dados();
			System.out.println("\n\n");
		}	
	}	
}