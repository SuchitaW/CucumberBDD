import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.candere.com/ ");

		List<WebElement> CONTACTUSOptionsActElement = driver.findElements(By.xpath("//div[@class='row_group flex_group']//div[5]//a"));
		
		for (int i = 0; i < expectedCONTACTUSptions.size(); i++) {
			if (expectedCONTACTUSptions.get(i).equals(CONTACTUSOptionsActElement.get(i).getText())) {
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}


		
		
		
	}


