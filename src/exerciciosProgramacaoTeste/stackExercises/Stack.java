package exerciciosProgramacaoTeste.stackExercises;

public class Stack {

	// Criação de array
	private Object[] objects;
	// Max size do array
	int maxSize = 10;
	// Indice do array
	int index = 0;

	public Stack() {
		objects = new Object[maxSize];
	}

	public void push(Object object) throws Exception {
		// Verifica se não ultrapassou do limite. Se não ultrapassar poe na
		// ultima posição do array
		if (index < maxSize) {
			objects[index] = object;
			index++;
		} else {
			throw new Exception("Max Stack size Reached");
		}
	}

	public Object pop() {
		if (size() > 0) {
			// Remove da ultima posicao do array
			index--;
			return objects[index];
		}

		return null;
	}

	public int size() {
		return index;
	}

}