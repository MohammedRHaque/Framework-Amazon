package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class GetQuotePage {

	public GetQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='qsButton_overlay']")
	WebElement GetQuoteElement;
	
	public void get(CommonActions commonActions) {
		commonActions.click(GetQuoteElement);
	}
}
