package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import commons.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.GetQuotePage;
import object.LandingPage;
import object.ZipCodePage;

public class BaseClass {
	public static WebDriver driver;
	public LandingPage landingpage;
	public CommonActions commonActions ;
	public ZipCodePage zipcode;
	public GetQuotePage getpage;
	
	@BeforeMethod
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.progressive.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	initclass();
	}

	@AfterMethod
	public void tearup() {
		driver.quit();
	}
	private void initclass() {
	landingpage = new LandingPage(driver);
	commonActions = new CommonActions() ;
	zipcode = new ZipCodePage(driver);
	getpage = new GetQuotePage (driver);
	}
	
}
