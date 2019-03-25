package aut.practice.pageobj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class loginpage_obj {

	public static WebDriver driver;
	
	public loginpage_obj(WebDriver driver1)
	{
		driver= driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "login")
	WebElement btn_signin;
	
	@FindBys(
			{ 
				@FindBy(id= "email"),
				@FindBy(id = "email")
	})
	List<WebElement> username;
	
	@FindAll(
	{ @FindBy(id="passwd"),
		@FindBy(id="passwd")
	})
	List<WebElement> password;
	
	@FindBy(id = "SubmitLogin")
	WebElement btn_submit;
	
	public void btn_signin_click()
	{
		btn_signin.click();
	}
	
	public void send_UserName(String UserName)
	{
		java.util.Iterator<WebElement> iterator = username.iterator();
		
		while (iterator.hasNext())
		{
			iterator.next().sendKeys(UserName);
		}
		}
	public void send_PassWord(String UserName)
	{
		java.util.Iterator<WebElement> iterator = password.iterator();
		
		while (iterator.hasNext())
		{
			iterator.next().sendKeys(UserName);
		}		}
	public void btn_submit_click()
	{
		btn_submit.click();
	}
	
	public String window_title() {
	 return	driver.getTitle();
	}
}
