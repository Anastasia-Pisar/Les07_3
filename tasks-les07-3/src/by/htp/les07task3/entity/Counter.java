package by.htp.les07task3.entity;

public class Counter {
	
	private int count;
	private int minCount = 0;
	private int maxCount = 10;
	
	public Counter(int count) {
		this.count = count;
	}

	public Counter() {
		this.count = minCount;
	}
	
	public Counter(int minCount, int maxCount) {
		this.minCount = minCount;
		this.maxCount = maxCount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMinCount() {
		return minCount;
	}

	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + maxCount;
		result = prime * result + minCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (count != other.count)
			return false;
		if (maxCount != other.maxCount)
			return false;
		if (minCount != other.minCount)
			return false;
		return true;
	}
}
