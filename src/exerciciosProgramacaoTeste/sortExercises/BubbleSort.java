package exerciciosProgramacaoTeste.sortExercises;

import java.util.Calendar;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
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

	public static void reverseBubbleSort(int[] array) {
		long timeBefore = Calendar.getInstance().getTimeInMillis();
		int tempValue;
		for (int i = array.length - 2; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (array[j] < array[j + 1]) {
					tempValue = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempValue;
				}
			}
			// printArr("BS - " + asString(i));
		}
		long timeAfter = Calendar.getInstance().getTimeInMillis();
		System.out.println("Took " + (timeAfter - timeBefore) + " milliseconds to run Reverse Bubble Sort.");
	}

}