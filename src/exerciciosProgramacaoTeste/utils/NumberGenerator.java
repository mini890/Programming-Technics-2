package exerciciosProgramacaoTeste.utils;

public class NumberGenerator {

	/**
	 * 
	 * @param array
	 * @return Gera um numero aleatório, procurando todos os outros numeros no
	 *         array
	 */
	public static int numGen(int[] array) {
		int random = (int) (Math.random() * (80 - 50) + 50);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == random)
				return numGen(array);
		}

		return random;
	}

}