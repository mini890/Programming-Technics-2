package Aula10.Ficheiro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreverFicheiroVariaveis {

	public static void main(String[] args) {
		try {
			PrintWriter outStream = new PrintWriter(new FileWriter("src/Aula10/Ficheiro/ficheiro.txt", true));
			String teste = "Hello World";
			outStream.println(teste);
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
