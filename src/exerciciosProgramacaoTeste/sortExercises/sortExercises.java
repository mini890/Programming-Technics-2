package exerciciosProgramacaoTeste.sortExercises;

import exerciciosProgramacaoTeste.utils.NumberGenerator;

public class sortExercises {

	static int[] array = new int[16];

	public static void main(String[] args) {
		for (int i = 0; i < 16; i++) {
			array[i] = NumberGenerator.numGen(array);
		}

		System.out.println("Array criado");
		printArr(array);

		int[] bubble = array.clone();
		int[] inverseBubble = array.clone();
		int[] insertion = array.clone();
		int[] inverseInsertion = array.clone();
		int[] selection = array.clone();
		int[] inverseSelection = array.clone();
		int[] merge = array.clone();
		int[] inverseMerge = array.clone();

		System.out.println();
		System.out.println("Bubble Sort");
		BubbleSort.bubbleSort(bubble);
		printArr(bubble);

		System.out.println();
		System.out.println("Inverse Bubble Sort");
		BubbleSort.reverseBubbleSort(inverseBubble);
		printArr(inverseBubble);

		System.out.println();
		System.out.println("Insertion Sort");
		InsertionSort.insertionSort(insertion);
		printArr(insertion);

		System.out.println();
		System.out.println("Inverse Insertion Sort");
		InsertionSort.reverseInsertionSort(inverseInsertion);
		printArr(inverseInsertion);

		System.out.println();
		System.out.println("Selection Sort");
		SelectionSort.selectionSort(selection);
		printArr(selection);

		System.out.println();
		System.out.println("Inverse Selection Sort");
		SelectionSort.reverseSelectionSort(inverseSelection);
		printArr(inverseSelection);

		System.out.println();
		System.out.println("Merge Sort");
		MergeSort.mergeSort(merge);
		printArr(merge);

		System.out.println();
		System.out.println("Inverse Merge Sort");
		MergeSort.inverseMergeSort(inverseMerge);
		printArr(inverseMerge);

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}