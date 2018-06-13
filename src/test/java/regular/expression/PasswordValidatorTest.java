package regular.expression;

import com.codewr.javacore.regular.expression.PasswordValidator;
import org.testng.Assert;
import org.testng.annotations.*;
 
/**
 * Password validator Testing
 * @author codewr
 *
 */
public class PasswordValidatorTest {
 
	private PasswordValidator passwordValidator;
    
	@BeforeClass
        public void initData(){
		passwordValidator = new PasswordValidator();
        }
    
	@DataProvider
	public Object[][] ValidPasswordProvider() {
		return new Object[][]{
		   {new String[] {
			   "Codewr1A@", "codeWR12$"
		   }}
	        };
	}
	
	@DataProvider
	public Object[][] InvalidPasswordProvider() {
		return new Object[][]{
		   {new String[] {
			   "co1A@","codewr12@","codeWr12*",
                            "Codewr@","CODEWR12$","codewr@123456789CODEWR"	  
		   }}
	       };
	}
	
	@Test(dataProvider = "ValidPasswordProvider")
	public void ValidPasswordTest(String[] password) {
		
	   for(String temp : password){
		boolean valid = passwordValidator.validate(temp);
		System.out.println("Password is valid : " + temp + " , " + valid);
		Assert.assertEquals(true, valid);
	   }
	   
	}
	
	@Test(dataProvider = "InvalidPasswordProvider", 
                 dependsOnMethods="ValidPasswordTest")
	public void InValidPasswordTest(String[] password) {
		
	   for(String temp : password){
		boolean valid = passwordValidator.validate(temp);
		System.out.println("Password is valid : " + temp + " , " + valid);
		Assert.assertEquals(false, valid);
	   }
	}
}