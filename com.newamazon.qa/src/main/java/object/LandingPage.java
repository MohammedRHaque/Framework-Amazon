package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='last-word'])[1]")
	WebElement autoelement;

	public void clickauto(CommonActions CommonActions) {
		CommonActions.click(autoelement);
	}
}
