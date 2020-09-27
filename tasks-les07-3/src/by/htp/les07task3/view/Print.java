package by.htp.les07task3.view;

import by.htp.les07task3.entity.Counter;

public class Print {

	public void print(Counter count) {
		System.out.println(count.getCount());
	}

	public void print(Counter count, boolean x) {
		System.out.println(count.getCount());
		
		if (x) {
			System.out.println();
		}
	}
}
