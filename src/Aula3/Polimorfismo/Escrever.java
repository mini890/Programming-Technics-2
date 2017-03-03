package Aula3.Polimorfismo;

/**
 * @author Miguel
 *
 */
public class Escrever {
	/**
	 * Imprime o texto passado como argumento
	 * @param i
	 */
	public static void escreve(int i) {
		System.out.println("Escreve int:" + i);
	}
	/**
	 * Imprime o texto passado como argumento
	 * @param s
	 */
	public static void escreve(String s) {
		System.out.println("Escreve String:" + s);
	}
	/**
	 * Imprime o texto passado como argumento
	 * @param d
	 */
	public static void escreve(double d) {
		System.out.println("Escreve double:" + d);
	}
	/**
	 * Imprime o texto passado como argumento
	 * @param b
	 */
	public static void escreve(boolean b) {
		System.out.println("Escreve boolean:" + b);
	}
}