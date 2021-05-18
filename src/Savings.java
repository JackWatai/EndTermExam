
public class Savings extends Account{
	double Interest;
	
	public Savings(int AccNum, double Interest) {
		super(AccNum);
		this.Interest = Interest;
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return("Savings Account Information"
				+ "\nAccount Number: " + getAccnum()
				+ "\nAccount Balance: " + getAccbal()
				+ "\nInterest Rate: " + Interest);
	}

}
