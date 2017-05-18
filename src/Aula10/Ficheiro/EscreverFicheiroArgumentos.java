package Aula10.Ficheiro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreverFicheiroArgumentos {

	public static void main(String[] args) {
		try {
			PrintWriter outStream = new PrintWriter(new FileWriter("src/Aula10/Ficheiro/ficheiro.txt", true));
			for (int i = 0; i < args.length; i++) {
				outStream.println(args[i].toString());
				System.out.println(args[i]);
			}
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
