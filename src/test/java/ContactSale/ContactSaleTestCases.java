package ContactSale;

import static com.ijmeet.util.KeywordIjmeet.click;
import static com.ijmeet.util.KeywordIjmeet.enterText;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ijmeet.constants.Locators;
import com.signup.SignUpTestCases;

public class ContactSaleTestCases {
	@Test
public void verrifyName() {
		
		private static final Logger log=Logger.getLogger(ContactSaleTestCases.class);
		/**
		 * @param name
		 * @param companyName
		 */
		@Test(enabled=false)
		public void name(String name) {
			click(Locators.signUpButton);
			enterText(Locators.fullName, name);
			

		}

		
	}

}
