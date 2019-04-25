package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
    @FindBy(how=How.ID,using="gender-male")
	public static WebElement gender;
    @FindBy(how=How.ID,using="FirstName")
    public static WebElement FirstName;
    @FindBy(how=How.ID,using="LastName")
    public static WebElement LastName;
    @FindBy(how=How.ID,using="Email")
    public static WebElement Email;
    @FindBy(how=How.ID,using="Password")
    public static WebElement Password;
    @FindBy(how=How.ID,using="ConfirmPassword")
    public static WebElement ConfirmPassword;
    @FindBy(how=How.ID,using="register-button") //@FindBy(how=How.CSS,using="input[value='Register']")
    public static WebElement register;
	
}
