package exerciciosProgramacaoTeste.sortExercises;

import java.util.Calendar;

public class InsertionSort {

	public static void insertionSort(int[] array) {
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
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Insertion Sort.");
	}

	public static void reverseInsertionSort(int[] array) {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < array.length; j++) {// Start with 1 (not 0)
			key = array[j];
			for (i = j - 1; (i >= 0) && (array[i] < key); i--) { // Higher
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

}