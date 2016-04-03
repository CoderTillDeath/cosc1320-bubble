
interface Ordered
{
	public boolean precedes(Object o);
	public boolean follows(Object o);
}


class Int implements Comparable, Ordered
{
	private int val;
	
	public Int(int a)
	{
		val = a;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public int compareTo(Object o)
	{
		if(o == null || !(o instanceof Int))
			return -2;
		
		Int other = (Int) o;
		
		if(this.val < other.getVal())
			return -1;
		else
			if(this.val > other.getVal())
				return 1;
			else
				return 0;
	}
	
	public boolean precedes(Object o)
	{
		if(o == null || !(o instanceof Int))
			return false;
		
		Int other = (Int) o;
		
		return (this.val < other.getVal());
	}
	
	public boolean follows(Object o)
	{
		if(o == null || !(o instanceof Int))
			return false;
		
		Int other = (Int) o;
		
		return (this.val > other.getVal());
	}
	
	public String toString()
	{
		return "" + val;
	}
}
