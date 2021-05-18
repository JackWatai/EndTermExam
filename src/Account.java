
public abstract class Account {
	int accnum;
	double accbal;

	public Account(int AccNum) {
		this.accnum = AccNum;
		this.accbal = 0.0;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}

	public double getAccbal() {
		return accbal;
	}

	public int getAccnum() {
		return accnum;
	}

}
