package Aula7.ContadorSingleton;

public class Contador {

	private int conta;
	private static int numContadores = 0;

	private static Contador singleton = null;

	private Contador() {
		super();
		conta = 0;
		Contador.incNumContadores();
	}

	private Contador(int valor) {
		conta = valor;
		Contador.incNumContadores();
	}

	public static Contador factory(int valor) {
		if (singleton == null)
			singleton = new Contador(valor);
		else
			singleton.setConta(valor);
		return singleton;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void incConta() {
		conta++;
	}

	public void incConta(int valor) {
		conta += valor;
	}

	public void decConta() {
		conta--;
	}

	public void decConta(int valor) {
		conta -= valor;
	}

	private static void incNumContadores() {
		// Forma recomendada em vez de numContadores++
		Contador.numContadores++;
	}

	private static void decNumContadores() {
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
			// Contador objecto = (Contador) obj;
			// return this.getConta() == objecto.getConta;
			return (this.getConta() == ((Contador) obj).getConta());

		return false;
	}

	@Override
	protected Object clone() {
		return new Contador(this.getConta());
	}

	protected void finalize() throws Throwable {
		System.out.println("FINALIZE");
		decNumContadores();
		super.finalize();
	}

}