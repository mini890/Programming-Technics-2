package Aula10.Exercicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Sort {

	private int[] array = null;
	private int min = 0;
	private int max = 0;

	public Sort(int positions) {
		this(positions, 50, 80);
	}

	public Sort(int positions, int min, int max) {
		super();
		this.min = min;
		this.max = max;
		initializeArray(positions);
	}

	public Sort(int[] array) {
		super();
		this.array = array;
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			l.add(Integer.valueOf(array[i]));
		}
		min = Collections.min(l);
		max = Collections.max(l);
	}

	public void selectionSort() {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
		for (int i = 0; i < array.length - 1; i++) {
			int menorIdx = i;
			int menor = array[menorIdx];
			for (int j = menorIdx + 1; j <= array.length - 1; j++) {
				if (array[j] < menor) {
					menorIdx = j;
					menor = array[menorIdx];
				}
			}
			array[menorIdx] = array[i];
			array[i] = menor;
			// printArr("SS - " + asString(i));
		}
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Selection Sort.");

	}

	public void reverseSelectionSort() {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
		for (int i = array.length - 1; i > 0; i--) {
			int menorIdx = i;
			int menor = array[menorIdx];
			for (int j = menorIdx - 1; j >= 0; j--) {
				if (array[j] < menor) {
					menorIdx = j;
					menor = array[menorIdx];
				}
			}
			array[menorIdx] = array[i];
			array[i] = menor;
			// printArr("RSS - " + asString(i));
		}
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Reverse Selection Sort.");

	}

	public void reverseBubbleSort() {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
		int tempValue;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					tempValue = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tempValue;
				}
			}
			// printArr("RBS - " + asString(i));
		}
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Reverse Bubble Sort.");
	}

	public void insertionSort() {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
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
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Insertion Sort.");
	}

	public void reverseInsertionSort() {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
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
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Reverse Insertion Sort.");
	}

	public void bubbleSort() {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
		int tempValue;
		for (int i = array.length - 2; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (array[j] > array[j + 1]) {
					tempValue = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempValue;
				}
			}
			// printArr("BS - " + asString(i));
		}
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Bubble Sort.");
	}

	private void initializeArray(int positions) {
		array = initializeArray(positions, min, max);
	}

	public void printArr(String before) {
		printArr(before, array);
	}

	@SuppressWarnings("unused")
	private String asString(int number) {
		String numberStr = "";
		number++;
		if (number < 10)
			numberStr = "0" + String.valueOf(number);
		else
			numberStr = String.valueOf(number);
		return numberStr;
	}

	public int[] getArray() {
		return array;
	}

	public static void printArr(String before, int[] arr) {
		int i;
		if (before != null) {
			System.out.print(before + " ");
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static int[] initializeArray(int size, int min, int max) {
		int[] a = new int[size];
		int i;
		for (i = 0; i < a.length; i++) {
			int r = 0;
			boolean uniq = false;
			while (!uniq) {
				uniq = true;
				r = aleatorio(min, max);
				for (int j = 0; j <= i; j++) {
					if (a[j] == r) {
						uniq = false;
						break;
					}
				}
			}
			a[i] = r;
		}
		return a;
	}

	public static int aleatorio(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static void main(String[] args) {
		Sort array1 = new Sort(16, 50, 80);
		// Create a new Sort with a clone of the first array.
		Sort array2 = new Sort(array1.getArray().clone());
		// Create a new Sort with a clone of the first array.
		Sort array3 = new Sort(array1.getArray().clone());
		// Create a new Sort with a clone of the first array.
		Sort array4 = new Sort(array1.getArray().clone());
		Sort array5 = new Sort(array1.getArray().clone());
		Sort array6 = new Sort(array1.getArray().clone());
		Sort array7 = new Sort(array1.getArray().clone());
		Sort array8 = new Sort(array1.getArray().clone());

		array1.printArr("a: ");
		array1.reverseBubbleSort();
		array1.printArr("Sorted a:");

		array2.printArr("b: ");
		array2.bubbleSort();
		array2.printArr("Sorted b:");

		array3.printArr("c: ");
		array3.reverseSelectionSort();
		array3.printArr("Sorted c:");

		array4.printArr("d: ");
		array4.selectionSort();
		array4.printArr("Sorted d:");

		array5.printArr("e: ");
		array5.insertionSort();
		array5.printArr("Sorted e:");

		array6.printArr("f: ");
		array6.reverseInsertionSort();
		array6.printArr("Sorted f:");

		array7.printArr("g: ");
		array7.printArr("Sorted g: ");
	}
}
