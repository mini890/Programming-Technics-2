package Aula4.Heranca;

public class TesteEscrever {
	
	public static void main(String[] args) {
		
		int i = 1;
		String s = "Hello World";
		double d = 50;
		boolean b = true;
		
		Escrever escrever = new Escrever();
		escrever.escreve(i);
		escrever.escreve(s);
		escrever.escreve(d);
		escrever.escreve(b);
		
		Escrever2 escrever2 = new Escrever2();
		escrever2.escreve(false);
		escrever2.escreve(true, 50);
		
	}

}