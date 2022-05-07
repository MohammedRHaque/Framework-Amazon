package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class ZipCodePage {

	public ZipCodePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//input[@name='ZipCode'])[1]")
	WebElement zipCodInputElement;
	
	public void inputzipcode(CommonActions commonActions, String value) {
		commonActions.inputtext(zipCodInputElement, value);
}
}