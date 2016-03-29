
interface Ordered
{
	public boolean precedes(Object o);
	public boolean follows(Object o);
}

class IntOrdered implements Ordered
{
	private int val;
	
	public IntOrdered(int a)
	{
		val = a;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public boolean precedes(Object o)
	{
		if(o == null || !(o instanceof IntComparable))
			return false;
		
		IntOrdered other = (IntOrdered) o;
		
		return (this.val < other.getVal());
	}
	
	public boolean follows(Object o)
	{
		
		if(o == null || !(o instanceof IntComparable))
			return false;
		
		IntOrdered other = (IntOrdered) o;
		
		return (this.val > other.getVal());
	}
}
