package Aula4.Heranca;

/**
 * @author Miguel
 *
 */
public class Escrever {
	/**
	 * Imprime o texto passado como argumento
	 * @param i
	 */
	public void escreve(int i) {
		System.out.println("Escreve int:" + i);
	}
	/**
	 * Imprime o texto passado como argumento
	 * @param s
	 */
	public void escreve(String s) {
		System.out.println("Escreve String:" + s);
	}
	/**
	 * Imprime o texto passado como argumento
	 * @param d
	 */
	public void escreve(double d) {
		System.out.println("Escreve double:" + d);
	}
	/**
	 * Imprime o texto passado como argumento
	 * @param b
	 */
	public void escreve(boolean b) {
		System.out.println("Escreve boolean:" + b);
	}
}