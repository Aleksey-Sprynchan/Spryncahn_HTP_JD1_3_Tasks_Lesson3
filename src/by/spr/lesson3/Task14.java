package by.spr.lesson3;

public class Task14 {

	public static void main(String[] args) {

		// Task 14
		// Найти в массиве и вывести на экран все элементы в заданном диапазоне
		// (например от 20 до 23)

		Task13 task13Methods = new Task13();

		int[] arr = task13Methods.initializeIntArrayByPositiveRandomValues(100);
		int[] x = { 20, 21, 22, 23 };

		System.out.println("\n\t\tTask 14: Find elements in the range from 20 to 23 \n");
		System.out.println(" Source array:\n");

		task13Methods.printArray(arr);

		int i = 0;
		System.out.println("\n\n Array elements in the range from 20 to 23\n");
		while (i < arr.length) {
			for (int j = 0; j < x.length; j++) {
				if (arr[i] == x[j]) {
					System.out.print(arr[i] + "\t");
					j = 3;

				}
			}
			i = i + 1;
		}

	}

}
