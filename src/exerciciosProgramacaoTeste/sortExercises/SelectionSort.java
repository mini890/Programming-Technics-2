package exerciciosProgramacaoTeste.sortExercises;

import java.util.Calendar;

public class SelectionSort {

	public static void selectionSort(int[] array) {
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

	public static void reverseSelectionSort(int[] array) {
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

}