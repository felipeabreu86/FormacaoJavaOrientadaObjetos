package br.com.alura.gerenciadorconta;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		// Ex. Percorrendo a lista
		for (String aula : aulas) {
			System.out.println(aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		// Ex. Percorrendo a lista
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		// Ex. Percorrendo a lista (Java8)
		aulas.forEach(aula -> System.out.println(aula));

		// Ordenar coleções
		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula));
	}

}
