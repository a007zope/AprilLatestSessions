package session2;

import org.testng.annotations.Test;

public class DependsOnMethod {


	@Test(priority =1,invocationCount =5)
	//(priority =1,invocationCount =5,expectedExceptions=ArithmeticException.class)
	public void loginTest()
	{
		System.out.println("login test-----");
		//int i =9/0;
	}

	@Test(priority =2,dependsOnMethods ="loginTest")
	public void homePageTest()
	{
		System.out.println("home page test---");
	//	int i =9/0;
	}

	@Test(priority =3,dependsOnMethods ={"loginTest","homePageTest"})
	public void SearchTest()
	{
		System.out.println("Search test---");
	}





}
