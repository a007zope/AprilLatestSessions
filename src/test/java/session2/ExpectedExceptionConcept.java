package session2;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest()
	{
		System.out.println("LoginTest----Starting ");

		int i =9/0;

		System.out.println("LoginTest---Ending");
	}






}
