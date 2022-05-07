package commons;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CommonActions {
	
public void click(WebElement element) {
	element.click();
     Reporter.log("Element is Clicking" + element);
} 
public void inputtext(WebElement element, String text) {
	element.sendKeys(text);
	Reporter.log( text +"Value Passed to Element" + element );
}
	
}
