package session2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class LoginTest {

	/*
 Before -- BS BT BC BM
 Test --@Test
 After--AM AC AT AS
	 */

	/**
	 * Sequence of Execution 
	 * BS
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * BM
	 * T2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 * 
	 * 
	 * 
	 */
	WebDriver driver;

	By userName = By.id("username");
	By passWord = By.id("password");
	By login = By.id("loginBtn");

	By signUp = By.xpath("//i18n-string[text()='Sign up']");

	By loginVerification = By.cssSelector("h1.dashboard-selector__title");

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite---prepare test data");
	}


	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test---DB Connection ");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class --- get value from DB ");
	}

	@BeforeMethod
	public void setUp()
	{
		System.out.println("before Method--setup");
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://app-eu1.hubspot.com/login/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUpLinkTest()
	{
		System.out.println("test method 1");
		Assert.assertTrue(driver.findElement(signUp).isDisplayed());
	}

	@Test(priority = 2, enabled= false)
	public void verifyTitleTest()
	{
		String title =driver.getTitle();
		System.out.println(" the page title is "+title);
		Assert.assertEquals(title,"HubSpot Login");
	}

	@Test(priority = 3, enabled =false)
	public void loginTest()
	{
		driver.findElement(userName).sendKeys("a007zope@gmail.com");
		driver.findElement(passWord).sendKeys("India1234!@#$");
		driver.findElement(login).click();
		String home = driver.findElement(loginVerification).getText();
		Assert.assertEquals(home,"Sales dashboard");


	}


	@AfterMethod
	public void tearDown()
	{
		System.out.println("after method ---close the driver");
		driver.close();
	}


	@AfterClass
	public void afterClass()
	{
		System.out.println("after class---Delete the user");
	}

	@AfterTest
	public 	void afterTest()
	{
		System.out.println("after test---disconnect the DB");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite---delete the testdata");
	}
}
