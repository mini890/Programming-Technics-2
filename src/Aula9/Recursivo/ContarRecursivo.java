package Aula9.Recursivo;

public class ContarRecursivo {

	public static void main(String[] args) {
		recursivo2(89, 100);
	}

	public static void recursivo(int valor) {
		if (valor <= 0)
			return;
		System.out.print(valor + " ");
		recursivo(valor - 1);
	}

	public static void recursivo2(int min, int max) {
		if (min > max)
			return;
		recursivo2(min + 1, max);
		System.out.print(min + " ");
	}

}