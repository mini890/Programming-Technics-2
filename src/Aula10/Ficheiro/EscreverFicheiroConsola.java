package Aula10.Ficheiro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscreverFicheiroConsola {

	public static void main(String[] args) {

		try {
			PrintWriter outStream = new PrintWriter(new FileWriter("src/Aula10/Ficheiro/ficheiro.txt", true));
			Scanner sc = new Scanner(System.in);

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
			e.printStackTrace();
		}
	}

}