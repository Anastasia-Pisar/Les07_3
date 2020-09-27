package by.htp.les07task3.logic;

import by.htp.les07task3.entity.Counter;

public class Logic {
	
	public boolean increase(Counter count) {

		if ((count.getCount() + 1) > count.getMaxCount()) {
			return false;

		} else {

			count.setCount(count.getCount() + 1);
			return true;
		}
	}

	public boolean decrease(Counter count) {

		if ((count.getCount() - 1) < count.getMinCount()) {
			return false;

		} else {

			count.setCount(count.getCount() - 1);
			return true;
		}
	}
}
