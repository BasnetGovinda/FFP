package test;

public class ElectronicProduct extends Aproduct{
	double price;
	public ElectronicProduct(String name, String number,double price) {
	
		super(name, number);
		// TODO Auto-generated constructor stub
		this.price= price;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public boolean equals(Object ob)
	{
		if(this == ob)
		{
			return true;
		}
		
		if(ob==null)
		{
			return false;
		}
		if(!(ob instanceof ElectronicProduct))
		{
			return false;
		}
		ElectronicProduct ed=(ElectronicProduct) ob;
		if(!super.equals(ob))
		{
			return false;
		}
		boolean bt=this.price==ed.price; 
			return bt;
	}

}
