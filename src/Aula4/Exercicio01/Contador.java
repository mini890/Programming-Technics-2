package Aula4.Exercicio01;

public class Contador {
	
	int conta;
	
	public Contador() {
		conta = 0;
	}

	public Contador(int valor) {
		this.conta = valor;
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

	@Override
	public String toString() {
		return new String("Valor do Contador =" + conta);
	}
	
	

}