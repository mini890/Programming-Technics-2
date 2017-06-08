package exerciciosProgramacaoTeste.exerciciosLeituraEscritaFicheiros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IO {

	private PrintWriter outStream;
	private BufferedReader reader;

	public void escrever(Scanner sc) {
		try {
			outStream = new PrintWriter(new FileWriter("ficheiro.txt", true));

			while (sc.hasNext()) {
				String temp = sc.nextLine().toString();
				if (temp.equalsIgnoreCase("END"))
					break;
				outStream.println(temp);
				outStream.flush();
			}

			outStream.close();
			sc.close();
		} catch (IOException e) {
			System.err.println("Erro a carregar ficheiro");
		}
	}

	public void ler(String ficheiro) {
		try {
			reader = new BufferedReader(new FileReader(ficheiro));

			String read;
			while ((read = reader.readLine()) != null) {
				System.out.println(read);
			}
		} catch (IOException e) {
			System.err.println("Erro a ler ficheiro " + ficheiro);
		}
	}

}