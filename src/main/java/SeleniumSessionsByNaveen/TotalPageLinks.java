package SeleniumSessionsByNaveen;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {
	
	static ArrayList<String> ar = new ArrayList<>();

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions a = new ChromeOptions();
		a.addArguments("--remote-allow-origins=*");
		WebDriver driver = new  ChromeDriver(a);
		driver.get("https:\\www.amazon.in");
		List<WebElement> eleList =driver.findElements(By.tagName("a"));

		for(WebElement e : eleList)
		{
			if(e.getText()!="")
			{
				String elementText =e.getText();
//				List<String> elements = new ArrayList<String>();
//				elements.add(elementText);
//				System.out.println(elements.toString());
				ar.add(elementText);

				//				for(String text :elements)
				//				{
				//					System.out.println(text);				
				//				}

			}			
		}
		 System.out.println(ar.toString());
		 System.out.println(ar.size());





















	}
}
