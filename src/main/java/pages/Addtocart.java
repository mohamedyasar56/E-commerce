package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	WebDriver driver=null;

	@BeforeTest
	public void setup() {

		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void verifycart() {

		WebElement Brocolli=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[2]/a[2]"));
		Brocolli.click();
		WebElement Brocolli1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[3]/button"));
		Brocolli1.click();

		WebElement cauliflower=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[2]/a[2]"));
		cauliflower.click();
		WebElement cauliflower1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[3]/button"));
		cauliflower1.click();

		WebElement Cucumber=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[2]/a[2]"));
		Cucumber.click();
		WebElement Cucumber1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[3]/button"));
		Cucumber1.click();

		WebElement Beetroot =driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[2]/a[2]"));
		Beetroot.click();
		WebElement Beetroot1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[3]/button"));
		Beetroot1.click();

		WebElement Carrot=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[5]/div[2]/a[2]"));
		Carrot.click();
		WebElement Carrot1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[5]/div[3]/button"));
		Carrot1.click();

		WebElement Tomato=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[6]/div[2]/a[2]"));
		Tomato.click();
		WebElement Tomato1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[6]/div[3]/button"));
		Tomato1.click();

		//Cart listofitems
		WebElement cart=driver.findElement(By.xpath("//img[@alt='Cart']"));
		cart.click();

		//Delete Item in cart
		WebElement deleteitem=driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[1]/a"));
		Actions action=new Actions(driver);

		action.moveToElement(deleteitem).click().build().perform();
		System.out.println("Item Deleted");

		//Proceed to checkout botton
		WebElement proceedbutton=driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"));
		proceedbutton.click();

		//Placeorder Button
		WebElement placeorder=driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
		placeorder.click();

		//Dropdown
		WebElement dropdown=driver.findElement(By.xpath("//select[@style='width: 200px;']"));

		Select select=new Select(dropdown);
		select.selectByVisibleText("India");

		//Add terms&conditions
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();

		//ProceedButton
		WebElement proceed=	driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
		proceed.click();
	}


	@AfterTest
	public void teardown() {

		driver.close();

	}


}
