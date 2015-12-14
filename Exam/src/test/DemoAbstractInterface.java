package test;

abstract class Emp
{
	double rate;
	public abstract void setRate(double rate);
	public double getRate(){
		return rate;
	}
}

interface Rate{
	int count=0;
	default double getRate(){
		return 700.56;
	}
	default int squareSize()
	{
		return 10;
	}
}

public class DemoAbstractInterface extends Emp implements Rate{
	public void setRate(double r){
		rate = r;
	}
	// Possible to override the default methods
/*	 public int squareSize()
	{
		return 12;
	}
	*/
	public void getRates()
	{
		System.out.println("getRate() from Interface");
		System.out.println("Employee working rate per day :" + Rate.super.getRate());
		System.out.println("getRate() from Super class");
		System.out.println("Employee working rate per day :" +super.getRate());
	}
	
	public static void main(String args[])
	{
		DemoAbstractInterface obj = new DemoAbstractInterface();
		obj.setRate(125.78);
		
		// Rule 1 : Super class always wins
		System.out.println("getRate() from Super class");
		System.out.println("Employee working rate per day :" + obj.getRate());
		System.out.println("Area of a Square :" + obj.squareSize() * obj.squareSize());
		//Rate.super.get		
	}
	
}
