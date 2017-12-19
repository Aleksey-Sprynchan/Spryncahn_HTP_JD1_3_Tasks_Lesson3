package by.spr.lesson3;

public class Task11and12 {

	public static void main(String[] args) {

		// Task 11
		// Удалить из массива все элементы, кратные 3

		int x[] = new int[100];

		System.out.println("11) Source array filled with integer random values: \n");
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);
			System.out.print(x[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}

		int e = x.length;
		int index = 0, nmbrelmultipleofthree = 0;
		for (int i = 0; i < e; i++) {
			if (x[i] % 3 == 0) {
				index = i;
				nmbrelmultipleofthree++;

				for (int m = index; m < x.length - 1; m++) {
					x[m] = x[m + 1];
				}
				e = e - 1;
				i = i - 1;

			}
		}
		System.out.println("\nMultiple of 3 elements number = " + nmbrelmultipleofthree);

		// Task 12
		// Привести размер массива из задания 9 в соответствие с реальным количеством
		// хранимых элементов

		System.out.println("\n12) New array without multiple of 3 elements: \n");
		int y[] = new int[x.length - nmbrelmultipleofthree];
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i];
			System.out.print(y[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}

	}

}
