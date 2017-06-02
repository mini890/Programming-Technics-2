package exerciciosProgramacaoTeste.queueExercises;

public class queueTest {

	public static void main(String[] args) {
		Queue queue = new Queue();

		try {
			queue.unshift("Hello");
			queue.unshift("World");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i <= queue.size(); i++) {
			System.out.println(queue.shift());
		}
	}

}