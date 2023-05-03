package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id = "email")
	private WebElement un;
	
	@FindBy(name  = "pass")
	private WebElement pass;
	
	@FindBy(name  = "login")
	private WebElement btn;
	
	public Pom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username1(String un1) 
	{
		un.sendKeys(un1);
		
	}
	public void password1(String pwd1) 
	{
		pass.sendKeys(pwd1);
		
	}
	public void login() 
	{
		btn.click();
		
	}


}
