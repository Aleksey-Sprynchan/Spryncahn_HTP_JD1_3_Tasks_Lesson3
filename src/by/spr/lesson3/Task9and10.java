package by.spr.lesson3;

import java.util.Scanner;

public class Task9and10 {

	public static void main(String[] args) {

		// Task 9
		// Сохранить в массив типа char свою фамилию и имя (размер массива не должен
		// превышать
		// количество символов в фамилии пробел имени (запрещено использовать метод
		// toCharArray класса String,
		// однако можно использовать метод charAt() - т.е. массив char нужно заполнить
		// посимвольно! ).

		Scanner userInput = new Scanner(System.in);
		System.out.println("9) Please, enter your Last and First Name (use space between):");

		String fio = userInput.nextLine();
		int fiolength = fio.length();
		char nameSurname[] = new char[fiolength];

		int i = 0;
		while (i < nameSurname.length) {
			nameSurname[i] = fio.charAt(i);
			i = i + 1;
		}

		System.out.println("Hello, " + String.valueOf(nameSurname) + "!\n");

		// Task 10
		// Реализовать считывание ФИО для задачи 9 с клавиатуры (можно использовать класс Scanner).
		// Добавить в массив из задания 9 пробел и отчество.

		System.out.println("10) Enter your Middle Name:");

		String otchestvo = userInput.nextLine();
		String fio2 = fio + " " + otchestvo;

		int length2 = fio2.length();
		char nameSurname2[] = new char[length2];

		int k = 0;
		while (k < nameSurname2.length) {
			nameSurname2[k] = fio2.charAt(k);
			k = k + 1;
		}

		System.out.println("Hello, " + String.valueOf(nameSurname2) + "!\n");
	}
}
