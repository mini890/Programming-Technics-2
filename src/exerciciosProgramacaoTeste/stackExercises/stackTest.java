package exerciciosProgramacaoTeste.stackExercises;

import java.util.Scanner;

public class stackTest {

	public static void main(String[] args) throws Exception {
		String reverseText = "";
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();
		System.out.println("Insira uma frase");
		String text = scanner.nextLine();
		System.out.println(text);

		for (int i = 0; i < text.length(); i++) {
			stack.push(text.charAt(i));
		}

		for (int j = stack.size(); j >= 1; j--) {
			char c;
			c = (char) stack.pop();
			reverseText += c;
		}

		System.out.println(reverseText);

	}

}