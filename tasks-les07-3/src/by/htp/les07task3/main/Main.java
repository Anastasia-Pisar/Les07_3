package by.htp.les07task3.main;

import by.htp.les07task3.entity.Counter;
import by.htp.les07task3.logic.Logic;
import by.htp.les07task3.view.Print;

public class Main {

	public static void main(String[] args) {

		Counter counter = new Counter(10);
		Counter counter2 = new Counter();
		Counter counter3 = new Counter(1, 8);
		Logic logic = new Logic();
		Print print = new Print();

		print.print(counter, true);

		if (logic.increase(counter)) {
			System.out.println("\nCчётчик 1 увеличен");
		} else {
			System.out.println("Cчётчик 1 не увеличен");
		}
		print.print(counter, false);

		if (logic.decrease(counter)) {
			System.out.println("\nCчётчик 1 уменьшен");
		} else {
			System.out.println("Cчётчик 1 не уменьшен");
		}
		print.print(counter, true);

		
		if (logic.increase(counter2)) {
			System.out.println("\nCчётчик 2 увеличен");
		} else {
			System.out.println("Cчётчик 2 не увеличен");
		}
		print.print(counter2, true);
		
		if (logic.decrease(counter2)) {
			System.out.println("\nCчётчик 2 уменьшен");
		} else {
			System.out.println("Cчётчик 2 не уменьшен");
		}
		print.print(counter2, true);
		

		for (int i = 0; i < 8; i++) {

			if (logic.increase(counter3)) {
				System.out.println("\nCчётчик 3 увеличен");
			} else {
				System.out.println("Cчётчик 3 не увеличен");
			}
			print.print(counter3, true);
		}
	}
}
