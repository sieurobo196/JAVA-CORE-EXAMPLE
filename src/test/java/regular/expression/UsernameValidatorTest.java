package regular.expression;


import com.codewr.javacore.regular.expression.UsernameValidator;
import org.testng.Assert;
import org.testng.annotations.*;
 
/**
 * Username validator Testing
 * @author codewr
 *
 */
public class UsernameValidatorTest {
 
	private UsernameValidator usernameValidator;
    
	@BeforeClass
        public void initData(){
		usernameValidator = new UsernameValidator();
        }
    
	@DataProvider
	public Object[][] ValidUsernameProvider() {
		return new Object[][]{
		   {new String[] {
	             "codewr12", "codewr_12","codewr-12" ,"codewr-12_smile"
		   }}
      	        };
	}
	
	@DataProvider
	public Object[][] InvalidUsernameProvider() {
		return new Object[][]{
		   {new String[] {
		     "co","code@wr","codewr123456789_-"	  
		   }}
	        };
	}
	
	@Test(dataProvider = "ValidUsernameProvider")
	public void ValidUsernameTest(String[] Username) {
		
	   for(String temp : Username){
		boolean valid = usernameValidator.validate(temp);
		System.out.println("Username is valid : " + temp + " , " + valid);
		Assert.assertEquals(true, valid);
	   }
	   
	}
	
	@Test(dataProvider = "InvalidUsernameProvider", 
                 dependsOnMethods="ValidUsernameTest")
	public void InValidUsernameTest(String[] Username) {
		
	   for(String temp : Username){
		boolean valid = usernameValidator.validate(temp);
		System.out.println("username is valid : " + temp + " , " + valid);
		Assert.assertEquals(false, valid);
	   }
	   
	}	
}
