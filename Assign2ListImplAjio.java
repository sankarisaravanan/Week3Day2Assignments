package week3.Day2Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;


public class Assign2ListImplAjio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String itemsCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("No. of Items returned : "+itemsCount);
		
		//To Display the Brand Names
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<String> brandNames = new LinkedHashSet<String>();
		for(WebElement brand : brands )
			brandNames.add(brand.getText());
		System.out.println("Brands displayed are : " + brandNames);
		
		//To Display the Bag Names
		Thread.sleep(1000);
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='name']"));
		
		Set<String> bagNames = new LinkedHashSet<String>();
		for(WebElement bag : bags )
			bagNames.add(bag.getText());
		Thread.sleep(2000);
		System.out.println("Bag Names displayed are : " + bagNames);
		
		Thread.sleep(2000);
		//driver.close();
	}

}
