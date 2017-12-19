package by.spr.lesson3;

import java.util.Arrays;

public class Task13 {

	public static void main(String[] args) {

		
//		  Отсортировать массив по возрастанию и по  убыванию следующими способами:
//			методом пузырька;
//			методом вставок; 
//			методом выбора;
//			быстрой сортировкой.
		
		
		System.out.println("\n\t\t\tTask 13: Sort Algorithms \n");

		System.out.println("\t\t\t\tBubble sort \n Source array: ");
		int[] arrayForBubble = initializeIntArrayByPositiveRandomValues(20);
		printArray(arrayForBubble);

		System.out.println("\n Ascending bubble sort: ");
		ascendingBubbleSort(arrayForBubble);
		printArray(arrayForBubble);

		System.out.println("\n Descending bubble sort: ");
		descendingBubbleSort(arrayForBubble);
		printArray(arrayForBubble);
		System.out.print("\n===========================================================================");

		System.out.println("\n\n\t\t\t\tInsertion sort \n Source array: ");
		int[] arrayForInsertion = initializeIntArrayByPositiveRandomValues(20);
		printArray(arrayForInsertion);

		System.out.println("\n Ascending insertion sort: ");
		ascendingInsertionSort(arrayForInsertion);
		printArray(arrayForInsertion);

		System.out.println("\n Descending insertion sort: ");
		descendingInsertionSort(arrayForInsertion);
		printArray(arrayForInsertion);
		System.out.print("\n===========================================================================");

		System.out.println("\n\n\t\t\t\tSelection sort \n Source array: ");
		int[] arrayForSelection = initializeIntArrayByPositiveRandomValues(20);
		printArray(arrayForSelection);

		System.out.println("\n Ascending seclection sort: ");
		SelectionSort(arrayForSelection, '<');
		printArray(arrayForSelection);

		System.out.println("\n Descending seclection sort: ");
		SelectionSort(arrayForSelection, '>');
		printArray(arrayForSelection);
		System.out.print("\n===========================================================================");

		System.out.println("\n\n\t\t\t\tQuick sort \n Source array: ");
		int[] arrayForQuick = initializeIntArrayByPositiveRandomValues(20);
		printArray(arrayForQuick);

		System.out.println("\n Ascending quick sort: ");
		quickSort(arrayForQuick, 0, arrayForQuick.length - 1, '<');
		printArray(arrayForQuick);

		System.out.println("\n Descending quick sort: ");
		quickSort(arrayForQuick, 0, arrayForQuick.length - 1, '>');
		printArray(arrayForQuick);
		System.out.print("\n===========================================================================");

	}

	public static int[] initializeIntArrayByPositiveRandomValues(int size) {

		int array[] = new int[size];
		for (int i = 0; i < array.length; ++i) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}

	}

	public static void ascendingBubbleSort(int[] array) {
		int a, k = 1;
		while (k < array.length) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					a = array[i + 1];
					array[i + 1] = array[i];
					array[i] = a;
				}
			}
			k++;
		}
	}

	public static void descendingBubbleSort(int[] array) {
		int a, k = 1;
		while (k < array.length) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					a = array[i + 1];
					array[i + 1] = array[i];
					array[i] = a;
				}
			}
			k++;
		}
	}

	public static void ascendingInsertionSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i + 1];
				array[i + 1] = array[i];
				int k = i;
				while (k > 0 && array[k - 1] > temp) {
					array[k] = array[k - 1];
					k--;
				}
				array[k] = temp;
			}
		}

	}

	public static void descendingInsertionSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				temp = array[i + 1];
				array[i + 1] = array[i];
				int k = i;
				while (k > 0 && temp > array[k - 1]) {
					array[k] = array[k - 1];
					k--;
				}
				array[k] = temp;
			}
		}

	}

	public static void SelectionSort(int[] array, char action) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			int maxId = i;
			for (int j = maxId + 1; j < array.length; j++) {
				switch (action) {
				case '>':
					if (array[j] >= array[maxId]) {
						maxId = j;
					}
					break;
				case '<':
					if (array[j] <= array[maxId]) {
						maxId = j;
					}
					break;
				}

			}
			temp = array[i];
			array[i] = array[maxId];
			array[maxId] = temp;
		}

	}

	public static void quickSort(int[] array, int start, int end, char sort) {
		int i = start, j = end;
		char action = sort;
		int mid = array[i + (j - i) / 2];
		while (i <= j) {
			switch (action) {
			case '<':
				while (array[i] < mid) {
					i++;
				}
				while (array[j] > mid) {
					j--;
				}
				break;
			case '>':
				while (array[i] > mid) {
					i++;
				}
				while (array[j] < mid) {
					j--;
				}
				break;
			}

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (start < j) {
			quickSort(array, start, j, action);
		}
		if (end > i) {
			quickSort(array, i, end, action);
		}

	}

}
