package Aula4.Heranca;

public class Escrever2 extends Escrever {
	
	public Escrever2() {
		super();
	}
	
	/**
	 * Imprime o texto passado como argumento
	 * @param b
	 */
	public void escreve(boolean b) {
		System.out.println("Isto �:" + b);
	}
	
	/**
	 * Imprime se � false e o seu n�mero
	 * @param b
	 * @param i
	 */
	public void escreve(boolean b, int i) {
		System.out.println("Escreve " + b + " e " + i);
	}

}
