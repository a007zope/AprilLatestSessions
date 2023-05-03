package session3;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;
	SoftAssert softassert;

	//execution sequence : BM T1 AM , BM T2 AM
	@BeforeMethod
	public void setUp()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		softassert = new SoftAssert();

	}

	@Test(priority =1)
	public void loginPageTitleTest()
	{
		String title =driver.getTitle();
		System.out.println("page title is "+title);		
		Assert.assertEquals(title,"HubSpot Login");

	}

	@Test(priority =2)
	public void signUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}

	@Test(priority =3)
	public void loginTest()
	{

		driver.findElement(By.id("username")).sendKeys("a007zope@gmail.com");
		driver.findElement(By.id("password")).sendKeys("India1234!@#$");
		driver.findElement(By.id("loginBtn")).click();
		
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Sales dashboard']"))));
		
		softassert.assertTrue(driver.findElement(By.xpath("//h1[text()='Sales dashboard']")).isDisplayed());

	String headerName =driver.findElement(By.xpath("//h1[text()='Sales dashboard']")).getText();

		
		
		
		softassert.assertEquals(headerName,"Sales dashboard1","header text is not matched");


		String title = driver.getTitle();
		System.out.println("home page title is "+ title);
		
		softassert.assertAll();
	}


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
