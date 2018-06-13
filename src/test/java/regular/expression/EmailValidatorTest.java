package regular.expression;

import com.codewr.javacore.regular.expression.EmailValidator;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Email validator Testing
 * 
 * @author codewr
 * 
 */
public class EmailValidatorTest {

	private EmailValidator emailValidator;

	@BeforeClass
	public void initData() {
		emailValidator = new EmailValidator();
	}

	@DataProvider
	public Object[][] ValidEmailProvider() {
		return new Object[][] { { new String[] { "codewr@yahoo.com",
			"codewr-100@yahoo.com", "codewr.100@yahoo.com",
			"codewr111@codewr.com", "codewr-100@codewr.net",
			"codewr.100@codewr.com.au", "codewr@1.com",
			"codewr@gmail.com.com", "codewr+100@gmail.com",
			"codewr-100@yahoo-test.com" } } };
	}

	@DataProvider
	public Object[][] InvalidEmailProvider() {
		return new Object[][] { { new String[] { "codewr", "codewr@.com.my",
			"codewr123@gmail.a", "codewr123@.com", "codewr123@.com.com",
			".codewr@codewr.com", "codewr()*@gmail.com", "codewr@%*.com",
			"codewr..2002@gmail.com", "codewr.@gmail.com",
			"codewr@codewr@gmail.com", "codewr@gmail.com.1a" } } };
	}

	@Test(dataProvider = "ValidEmailProvider")
	public void ValidEmailTest(String[] Email) {

		for (String temp : Email) {
			boolean valid = emailValidator.validate(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);
			Assert.assertEquals(valid, true);
		}

	}

	@Test(dataProvider = "InvalidEmailProvider", dependsOnMethods = "ValidEmailTest")
	public void InValidEmailTest(String[] Email) {

		for (String temp : Email) {
			boolean valid = emailValidator.validate(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);
			Assert.assertEquals(valid, false);
		}
	}
}