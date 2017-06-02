package exerciciosProgramacaoTeste.stackExercises;

public class Stack {

	// Cria��o de array
	private Object[] objects;
	// Max size do array
	int maxSize = 10;
	// Indice do array
	int index = 0;

	public Stack() {
		objects = new Object[maxSize];
	}

	public void push(Object object) throws Exception {
		// Verifica se n�o ultrapassou do limite. Se n�o ultrapassar poe na
		// ultima posi��o do array
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