package erwerwer;

public class NoteBook extends Computer implements Cloneable {
	private double height;
	private double width;
	private double weight;
	Computer comp;

	public NoteBook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed,
			double height, double width, double weight, Computer comp) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.comp = comp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((comp == null) ? 0 : comp.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook other = (NoteBook) obj;
		if (comp == null) {
			if (other.comp != null)
				return false;
		} else if (!comp.equals(other.comp))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NoteBook [height=" + height + ", width=" + width + ", weight=" + weight + ", comp=" + comp
				+ ", hashCode()=" + hashCode() + ", screensize()=" + screensize() + ", toString()=" + super.toString()
				+ ", getRamSize()=" + getRamSize() + ", getDiskSize()=" + getDiskSize() + ", getProcessorSpeed()="
				+ getProcessorSpeed() + ", computePower()=" + computePower() + ", getClass()=" + getClass() + "]";
	}
	public NoteBook clone() throws CloneNotSupportedException {
		return (NoteBook) super.clone();
	}

	public double screensize() // return height multiplied by width
	{
		return height * height;
	}

}
