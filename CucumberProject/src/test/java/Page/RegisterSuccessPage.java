package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterSuccessPage {
	@FindBy(how=How.CLASS_NAME,using="result")
	public static WebElement mssg;
}
