package Aula10.Exercicios;

public class SortExercice {

	private static int[] array = new int[16];

	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++)
			array[i] = (int) (Math.random() * (80 - 50) + 50);

		System.out.println("Array desordenado");
		for (int j = 0; j < array.length; j++)
			System.out.println(array[j]);

		System.out.println();

		bubble(array);
		System.out.println("Array ordenado Bubble");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);

		insertion(array);
		System.out.println("Array ordenado insertion");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);

		selection(array);
		System.out.println("Array ordenado selection");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);

	}

	public static void bubble(int[] array) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) { // change to > for ascending sort
					temp = array[j]; // swap elements
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
	}

	public static void selection(int[] array) {
		int i, j, first, temp;
		for (i = array.length - 1; i > 0; i--) {
			first = 0; // initialize to subscript of first element
			for (j = 1; j <= i; j++) {// locate smallest element between
										// positions 1 and i.
				if (array[j] > array[first])
					first = j;
			}
			temp = array[first]; // swap smallest found with element in position
									// i.
			array[first] = array[i];
			array[i] = temp;
		}
	}

	public static void inverseSelection(int[] array) {
		int i, j, first, temp;
		for (i = array.length - 1; i > 0; i--) {
			first = 0; // initialize to subscript of first element
			for (j = 1; j <= i; j++) {// locate smallest element between
										// positions 1 and i.
				if (array[j] < array[first])
					first = j;
			}
			temp = array[first]; // swap smallest found with element in position
									// i.
			array[first] = array[i];
			array[i] = temp;
		}
	}

	public static void insertion(int[] array) {
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < array.length; j++) {// Start with 1 (not 0)
			key = array[j];
			for (i = j - 1; (i >= 0) && (array[i] > key); i--) { // Smaller
																	// values
																	// are
																	// moving up
				array[i + 1] = array[i];
			}
			array[i + 1] = key; // Put the key in its proper location
		}
	}

	public static void inverseInsertion(int[] array) {
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < array.length; j++) {// Start with 1 (not 0)
			key = array[j];
			for (i = j - 1; (i >= 0) && (array[i] < key); i--) { // Smaller
																	// values
																	// are
																	// moving up
				array[i + 1] = array[i];
			}
			array[i + 1] = key; // Put the key in its proper location
		}
	}

	public static void merge(int[] array) {
	}

}