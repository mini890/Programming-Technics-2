package Aula4.Exercicio01;

public class TestContador {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Contador ct1 = new Contador(3);
		Contador ct2;
		ct2 = new Contador();
		int c1 = ct1.getConta();
		ct1.setConta(10);
		ct1.incConta();
		ct1.incConta(10);
		
		System.out.println(ct1.toString());
		System.out.println(ct2.toString());
	}

}