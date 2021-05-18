
public class Checking extends Account implements depositable{

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

	@Override
	public void deposit(double money) {
		// TODO Auto-generated method stub
		
	}
}
