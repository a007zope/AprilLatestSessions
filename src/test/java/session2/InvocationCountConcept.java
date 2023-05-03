package session2;

import org.testng.annotations.Test;

public class InvocationCountConcept {


	@Test(invocationCount=10)
	public void createUser()
	{
		System.out.println("create user test....");
	}

}
