package by.spr.lesson3;

public class Task1and2 {

	public static void main(String[] args) {

		// Task 1
		// Заполнить массив x целыми числами и вывести содержимое массива x на экран

		int x[] = new int[10];
		x[0] = 214;
		x[1] = 23;
		x[2] = 9;
		x[3] = 85;
		x[4] = 257;
		x[5] = 33;
		x[6] = 285;
		x[7] = 45;
		x[8] = 48;
		x[9] = 125;

		System.out.println("1) Source array filled with integer values: \n");

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");

		}
		

		// Task 2
		// Вывести содержимое массива x из задания 1 на экран в обратном порядке

		System.out.println("\n\n2) Reverse order print of the source: \n");

		for (int i = x.length-1; i >= 0; i--) {
			System.out.print(x[i] + "\t");
		}

	}

}
