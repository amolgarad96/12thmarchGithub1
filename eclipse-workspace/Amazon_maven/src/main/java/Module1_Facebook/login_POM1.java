package Module1_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_POM1 
{
	@FindBy(xpath="//input[@id='email']") private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")  private WebElement pwd;
	@FindBy(xpath="//button[@name='login']")  private WebElement Login;
	
	
	public login_POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String value1)
	{
		UN.sendKeys(value1);
	}
	public void setpassword(String value2)
	{
		pwd.sendKeys(value2);
	}
	public void submit()
	{
		Login.click();
	}

}
	



