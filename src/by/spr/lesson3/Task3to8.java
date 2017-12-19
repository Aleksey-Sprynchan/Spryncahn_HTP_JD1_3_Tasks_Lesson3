package by.spr.lesson3;

public class Task3to8 {

	public static void main(String[] args) {

		// Task 3
		// Заполнить массив x целыми числами и вывести содержимое массива x на экран

		int x[] = new int[100];

		System.out.println("3) Source array filled with integer random values: ");
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);
			System.out.print(x[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}
		System.out.print("\n");

		// Task 4
		// Вывести из массива (задание 3) все чётные элементы на экран

		int h = 1;
		System.out.println("4) Even array elements " + "");
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				System.out.print(x[i] + "\t");
				h++;
				if ((h - 1) % 10 == 0) {
					System.out.print("\n");
				}
			}
		}

		// Task 5
		// Посчитать разность всех нечётных элементов массива из задания 3

		int raznost = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				raznost = raznost - x[i];
			}
		}
		System.out.println("\n\n5) Difference of odd elements: " + raznost + "\n");

		// Task 6
		// Подсчитать количество чётных и нечётных элементов в массиве из задания 3.
		// Количество чётных и количество нечётных вывести на экран

		int sumeven = 0, sumodd = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				sumeven = sumeven + 1;
			} else {
				sumodd = sumodd + 1;
			}
		}

		System.out.println("6) Even elements number = " + sumeven);
		System.out.println("   Odd elements number = " + sumodd + "\n");

		// Task 7
		// Найти и вывести на экран максимальный / минимальный элемент из задания 3

		int maxelement = x[0], minelement = x[0];

		for (int i = 1; i < x.length; i++) {

			if (maxelement < x[i]) {
				maxelement = x[i];
			}
		}
		System.out.println("7) Max element = " + maxelement);

		for (int i = 1; i < x.length; i++) {
			if (minelement > x[i]) {
				minelement = x[i];
			}
		}
		System.out.println("   Min element = " + minelement + "\n");

		// Task 8
		// Найти максимальный и минимальный элемент среди чётных/нечётных элементов
		// массива задания 3

		int maxeven = 0, maxodd = 0, mineven = x[0], minodd = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				if (maxeven < x[i]) {
					maxeven = x[i];
				}
				if (mineven > x[i]) {
					mineven = x[i];
				}
			} else {
				if (maxodd < x[i]) {
					maxodd = x[i];
				}
				if (minodd > x[i]) {
					minodd = x[i];
				}
			}
		}

		System.out.println("8) Max even elemenet = " + maxeven);
		System.out.println("   Max odd elemenet = " + maxodd);
		System.out.println("   Min even elemenet = " + mineven);
		System.out.println("   Min odd elemenet = " + minodd + "\n");

	}

}
