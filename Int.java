

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
		IntComparable other = (IntComparable) o;
		
		return other.getVal() - val;
	}
}
