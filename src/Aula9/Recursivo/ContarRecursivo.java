package Aula9.Recursivo;

public class ContarRecursivo {

	public static void main(String[] args) {
		recursivo(10);
	}
	
	public static void recursivo(int valor) {
		if (valor <= 0)
			return;
		System.out.print(valor + " ");
		recursivo(valor - 1);
	}
	
}