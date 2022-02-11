package ContactSale;

import static com.ijmeet.util.KeywordIjmeet.click;
import static com.ijmeet.util.KeywordIjmeet.enterText;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.ijmeet.constants.Locators;
import com.signup.SignUpTestCases;

public class ContactSaleTestCases {
	
		
		private static final Logger log=Logger.getLogger(ContactSaleTestCases.class);
		/**
		 * @param name
		 * @param companyName
		 */
		@Test(enabled=false)
		public void fullName(String name) {
			click(Locators.signUpButton);
			enterText(Locators.fullName, name);
			System.out.println("name");

		}
			
			

		

		
	}


