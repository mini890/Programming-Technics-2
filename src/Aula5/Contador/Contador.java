package Aula5.Contador;

public class Contador {

	private int conta;
	private static int numContadores = 0;

	public Contador() {
		conta = 0;
		Contador.incNumContadores();
	}

	public Contador(int valor) {
		conta = valor;
		Contador.incNumContadores();
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	void incConta() {
		conta++;
	}

	void incConta(int valor) {
		conta += valor;
	}

	void decConta() {
		conta--;
	}

	void decConta(int valor) {
		conta -= valor;
	}
	
	private static void incNumContadores() {
		//Forma recomendada em vez de numContadores++
		Contador.numContadores++;
	}
	
	private static void decContadores() {
		Contador.numContadores--;
	}
	
	public static int getNumContadores() {
		return numContadores;
	}

	@Override
	public String toString() {
		return new String("Valor do Contador =" + conta);
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj != null) && (obj instanceof Contador))
			//Contador objecto = (Contador) obj;
			//return this.getConta() == objecto.getConta;
			return (this.getConta() == ((Contador) obj).getConta());

		return false;
	}

	@Override
	protected Object clone() {
		return new Contador(this.getConta());
	}

}