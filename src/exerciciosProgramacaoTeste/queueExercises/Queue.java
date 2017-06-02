package exerciciosProgramacaoTeste.queueExercises;

public class Queue {

	// Criação de array
	private Object[] objects;
	// Max size do array
	private int maxSize = 10;
	private int index = 0;

	public Queue() {
		objects = new Object[maxSize];
	}

	// Verifica o tamanho
	public int size() {
		return index;
	}

	// Adiciona algo á Queue na ultima posição
	public void unshift(Object object) throws Exception {
		// Verifica se não ultrapassou do tamanho limite
		if (index < maxSize) {
			// Define o que recebe no argumento para o indice atual e
			// incrementa-o
			objects[index] = object;
			index++;
		} else {
			// Dá erro se chegar ao limite, faz com que o unshift precise de
			// usar try/catch
			throw new Exception("Max Stack Size Reached");
		}
	}

	// Remove da queue, sempre da 1ª posição
	public Object shift() {
		// Verificar se a queue tem valores
		if (size() > 0) {
			// Define na variavel o objeto atual
			Object a = objects[0];
			// Apaga o primeiro indice e faz com que todos os outros voltem 1
			// para traz
			rotate();
			// Decrementa o index
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

}