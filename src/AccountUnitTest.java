import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountUnitTest {

	@Test
	void testGetIsEqualsToSetForChecking() {
		Checking CheckingAcount = new Checking(1921027);
		System.out.println(CheckingAcount.toStringChecking());
	}
	
	@Test
	void testGetIsEqualsToSetForSavings() {
		Savings CheckingSavings = new Savings(1921028, 1.5);
		System.out.println(CheckingSavings.toStringSaving());
	}

}
