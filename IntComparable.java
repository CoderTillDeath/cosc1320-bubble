

class IntComparable implements Comparable
{
	private int val;
	
	public IntComparable(int a)
	{
		val = a;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public int compareTo(Object o)
	{
		if(o == null || !(o instanceof IntComparable))
			return -2;
		
		IntComparable other = (IntComparable) o;
		
		if(this.val < other.getVal())
			return -1;
		else
			if(this.val > other.getVal())
				return 1;
			else
				return 0;
	}
}
