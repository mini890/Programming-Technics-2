package exerciciosProgramacaoTeste.exerciciosLeituraEscritaFicheiros;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		IO ficheiros = new IO();
		Scanner scanner = new Scanner(System.in);

		ficheiros.escrever(scanner);

		ficheiros.ler("ficheiro.txt");
	}

}