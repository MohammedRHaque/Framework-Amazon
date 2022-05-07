package common;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.test.BaseClass;

public class TestAmazonMusic extends BaseClass  {
	
		@Test(enabled=true, priority=1)
		public void aTest() {
			m.mainElement.click();
			musicpage.tryoutElement.click();
		   String titleElement = signinpage.loginElement.getText();
		   System.out.println(titleElement);
		   String url = driver.getCurrentUrl();
		   System.out.println("The Current URl:" + url);
		   String modifiedUrl = url.substring(0, url.indexOf("?"));
		   System.out.println("This is New Modified URL" + modifiedUrl);
		   Assert.assertEquals(modifiedUrl, "https://www.amazon.com/ap/signin");
			
		}
}
	

