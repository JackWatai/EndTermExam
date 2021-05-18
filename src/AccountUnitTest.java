import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountUnitTest {

	@Test
	void testGetIsEqualsToSetForChecking() {
		Checking CheckingAcount = new Checking(1921027);
		System.out.println(CheckingAcount.toString());
	}
	
	@Test
	void testGetIsEqualsToSetForSavings() {
		Savings CheckingSavings = new Savings(1921028, 1.5);
		System.out.println("\n" + CheckingSavings.toString());
	}
	
	@Test
	void testAccountArray() {
		Account[] AccountArray = new Account[10];
		
		AccountArray[0] = new Checking(1921028);
		AccountArray[1] = new Checking(1921027);
		AccountArray[2] = new Checking(1921029);
		AccountArray[3] = new Checking(1921030);
		AccountArray[4] = new Checking(1921031);
		AccountArray[5] = new Savings(1921032, 1.5);
		AccountArray[6] = new Savings(1921033, 1.6);
		AccountArray[7] = new Savings(1921034, 1.7);
		AccountArray[8] = new Savings(1921035, 1.8);
		AccountArray[9] = new Savings(1921036, 1.9);
		
		for(int i = 0; i < AccountArray.length; ++i)
			System.out.println(AccountArray[i].toString() + "\n");
		
		assertEquals(10, AccountArray.length);
	}

}
