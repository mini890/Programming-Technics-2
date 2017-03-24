package Aula6.Contador;

public class TestContador {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Contador ct1 = new Contador(3);
		Contador ct2;
		ct2 = new Contador();
		int c1 = ct1.getConta();
		ct1.setConta(5);
		c1 = ct1.getConta();
		ct1.setConta(10);
		
		ct2.incConta();
		ct2.decConta();
		ct2.incConta(10);
		ct2.decConta(5);
		
		ct1.setConta(ct2.getConta());
		
		System.out.println(ct1.toString());
		System.out.println(ct2.toString());
		
		Contador ct3 = (Contador) ct2.clone();
		System.out.println("Clonei o contador 2");
		
		boolean iguais_ct2_ct3 = ct2.equals(ct3);
		boolean iguais_ct2_String = ct2.equals(new String());
		boolean iguais_ct2_ct1 = ct2.equals(ct1);
		
		System.out.println("CT2 = CT3: " + iguais_ct2_ct3);
		System.out.println("CT2 = String: " + iguais_ct2_String);
		System.out.println("CT2 = CT1: " + iguais_ct2_ct1);
		
		int total = Contador.getNumContadores();
		System.out.println("Total de contadores abertos: " + total);
		
		ct1 = null;
		ct2 = null;
		
		total = Contador.getNumContadores();
		System.out.println("Total de contadores abertos: " + total);
		
		int numero;
		String linha = "10a";
		
		try {
			numero = Integer.valueOf(linha).intValue();
			System.out.println("O valor é: " + numero);
		} catch (NumberFormatException e) {
			System.out.println("Impossivel converter " + linha);
			System.err.println(e.getMessage());
		}
	}

}