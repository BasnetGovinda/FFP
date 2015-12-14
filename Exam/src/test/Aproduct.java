package test;

public abstract class Aproduct {
	String name ;    // name of the product: Example “Hammer”
	String number; // product number kept as a string: Example “H1245”
	public abstract double getPrice(); 
	public Aproduct(String name,String number)
	{
		this.name=name;
		this.number =number;
	}
	public boolean equals(Object o )
	{
		if(o==null)
		{
			return false;
		}
		if(!(o instanceof Aproduct))
		{
			return false;
		}
		Aproduct ab = (Aproduct) o;
		boolean bb=this.name.equals(ab.name)&&this.number.equals(ab.number);
		return bb;
		
	}
}
