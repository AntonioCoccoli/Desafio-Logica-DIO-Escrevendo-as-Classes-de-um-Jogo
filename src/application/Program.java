package application;

import java.util.Scanner;

import entities.Hero;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos lá Jovem Aventureiro, está na hora de você escolher seu Herói!");
		System.out.println();
		System.out.println("Nos conte agora, o NOME, a IDADE e o TIPO de herói que você vai escolher!");
		System.out.println();
		System.out.println("Escolha um dos tipos: MAGO; GUERREIRO; MONGE; NINJA!");
		
		System.out.println();
		System.out.println("Então vamos lá:");
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		System.out.print("IDADE: ");
		Integer idade = sc.nextInt();
		System.out.print("TIPO: ");
		sc.nextLine();
		String tipo = sc.nextLine();
		
		Hero hero = new Hero(nome, idade, tipo);
		hero.atacar();
		System.out.println();
		
		System.out.println(hero.toString());
		
		
		sc.close();

	}

}
