package exerciciosProgramacaoTeste.stackExercises;

import java.util.Scanner;
import java.util.Stack;

public class stackExercisesJavaClass {

	private static Scanner scanner;

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		scanner = new Scanner(System.in);
		System.out.println("Insira uma frase");

		String texto = scanner.nextLine();
		System.out.println(texto);

		for (int i = 0; i < texto.length(); i++) {
			stack.push(texto.charAt(i));
		}

		String reversedText = "";
		while (!stack.isEmpty()) {
			char c = stack.pop();
			reversedText += c;
		}

		System.out.println(reversedText);
		
	}

}