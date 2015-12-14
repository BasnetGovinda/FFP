package erwerwer;

import javax.net.ssl.HandshakeCompletedEvent;

public class Computer {
	private String manufacturer;	
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (diskSize != other.diskSize)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (Double.doubleToLongBits(processorSpeed) != Double.doubleToLongBits(other.processorSpeed))
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diskSize;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result =new Double(10.23).hashCode()+ prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
		return result;
	}
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", diskSize=" + diskSize + ", processorSpeed=" + processorSpeed + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public double computePower()
	{
		
		
		return ramSize*processorSpeed; 
	}
	
}
