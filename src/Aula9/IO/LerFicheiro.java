package Aula9.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LerFicheiro {

	static String texto;

	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/Aula9/IO/apps.txt"));

			String c;
			while ((c = reader.readLine()) != null) {
				System.out.println(c);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}