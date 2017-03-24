package Aula6.Argumentos;

public class Argumentos {

	public static void main(String[] args) {
		// TODO: Apresentar todos os argumentos passados para a aplicação
		if (args.length > 0)
			System.out.println(args.length);
		else
			for (int i = 0; i <= args.length - 1; i++)
				System.out.println(args[i]);

		for (int i = 0; i <= args.length - 1; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();

		String text = "";
		for (int i = 0; i <= args.length - 1; i++) {
			text += args[i] + " ";
			if (i == args.length - 1)
				System.out.println(text);
		}
	}

}