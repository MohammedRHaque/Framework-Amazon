package progressive.qa.test.auto;

import org.testng.annotations.Test;

import base.BaseClass;


public class AutoTest extends BaseClass {

	@Test
	public void Auto() {
		landingpage.clickauto(commonActions);
				zipcode.inputzipcode(commonActions, "10029");
		getpage.get(commonActions);
	}
}
