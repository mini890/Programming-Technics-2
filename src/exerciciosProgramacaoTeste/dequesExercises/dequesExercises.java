package exerciciosProgramacaoTeste.dequesExercises;

public class dequesExercises {

	public static void main(String[] args) {
		Deques deques = new Deques();

		try {
			deques.push("Hello");
			deques.push("World");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(deques.size());
		System.out.println(deques.pop());
		System.out.println(deques.pop());

		try {
			deques.unshift("Hello World");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(deques.size());
		System.out.println(deques.shift());
	}

}