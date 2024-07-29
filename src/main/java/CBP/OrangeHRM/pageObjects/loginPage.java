package CBP.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	WebElement employeeName;
	@FindBy(css="[type='password']")
	WebElement employeePassword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	public void employeeLogIN(String userName,String password)
	{
		employeeName.sendKeys(userName);
		employeePassword.sendKeys(password);
		//loginButton.click();
	}
	
	public void goTo()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
