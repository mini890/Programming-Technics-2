package Aula8.Factorial;

import java.math.BigInteger;

public class Util {

	static int valor = 1;

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num == 0) {
			valor = 1;
		} else {

			for (int i = 1; i < num + 1; i++) {
				valor *= i;
			}
		}

		System.out.println("O Valor é " + valor);
	}

	/*static BigInteger calculaNaoRecursivo(int n) {
		if (n == 0)
			return BigInteger.ONE;
		BigInteger value = BigInteger.valueOf(n);
		
	}*/
	
	static BigInteger calculaRecusrivo(int n) {
		if (n == 0)
			return BigInteger.ONE;
		return BigInteger.valueOf(n).multiply(calculaRecusrivo(n - 1));
	}

}