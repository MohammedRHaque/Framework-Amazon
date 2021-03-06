package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageSeleniumMain {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement element = driver.findElement(By.xpath("//a[text()='Music']"));
		element.click();
		element = driver.findElement(By.id("a-autoid-1-announce"));
		element.click();
		element = driver.findElement(By.tagName("h1"));
		System.out.println("The Title of the Page:" + element.getText());
		String url = driver.getCurrentUrl();
		System.out.println("The Current Url :" + url);
		String modifiedUrl = url.substring(0, url.indexOf("?"));
		System.out.println(modifiedUrl);
		Assert.assertEquals(modifiedUrl, "https://www.amazon.com/ap/signin");

	}

}
