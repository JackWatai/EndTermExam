
public class Checking extends Account {

	public Checking(int AccNum) {
		super(AccNum);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return("Checking Account Information"
				+ "\nAccount Number: " + getAccnum()
				+ "\nAccount Balance: " + getAccbal());
	}
}
