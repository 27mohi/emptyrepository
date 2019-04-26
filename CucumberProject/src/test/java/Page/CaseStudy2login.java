package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CaseStudy2login {
	@FindBy(how=How.ID,using="userName")
	public static WebElement userName ;
	@FindBy(how=How.ID,using="password")
	public static WebElement  password;
	@FindBy(how=How.CSS,using="(input[value='Login'])")
	public static WebElement login ;
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Add to cart")
	public static WebElement  add;
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Cart")
	public static WebElement  cart;
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Checkout")
	public static WebElement  Checkout;
	@FindBy(how=How.XPATH,using="/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")
	public static WebElement proceed  ;
	
}
