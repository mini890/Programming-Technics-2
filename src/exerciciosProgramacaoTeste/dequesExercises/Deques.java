package exerciciosProgramacaoTeste.dequesExercises;

public class Deques {
	
	// Criação de array
	private Object[] objects;
	// Max size do array
	private int maxSize = 10;
	private int index = 0;

	public Deques() {
		objects = new Object[maxSize];
	}
	
	public void unshift(Object object) throws Exception {
		if (index < maxSize) {
			objects[index] = object;
			index++;
		} else {
			throw new Exception("Max Stack Size Reached");
		}
	}

	public Object shift() {
		if (size() > 0) {
			Object a = objects[0];
			rotate();
			index--;
			return a;
		}

		return null;
	}

	private void rotate() {
		for (int i = 0; i < index; i++) {
			objects[i] = objects[i + 1];
		}

		objects[objects.length - 1] = null;
	}
	
	public void push(Object object) throws Exception {
		if (index < maxSize) {
			objects[index] = object;
			index++;
		} else {
			throw new Exception("Max Stack size Reached");
		}
	}

	public Object pop() {
		if (size() > 0) {
			index--;
			return objects[index];
		}

		return null;
	}

	public int size() {
		return index;
	}

}