package amazon.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public MainPage m;
	public MusicPage musicpage;
	public SignInPage signinpage;
	
	@BeforeMethod
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	initClass();
	}

	@AfterMethod
	public void tearup() {
	driver.quit();
	}
	public void initClass() {
		m = new MainPage(driver);
		musicpage = new MusicPage(driver);
		signinpage = new SignInPage (driver);
	}
}
