package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pageone {
	
	public WebDriver driver;
	
	public pageone(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By Firstname=By.name("firstname");
	public void FirstName1(String text)
	{
		driver.findElement(Firstname).sendKeys(text);
		
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	public void lastname1(String text)
	{
		lastname.sendKeys(text);
	}
	
	@FindBy(how=How.CSS,using="input[name='reg_email__']")
	WebElement mouseoverpath;
	
	public void mouseover1()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(mouseoverpath).click().build().perform();
		
	}
	
	public void mobilenumber(String text)
	{
		mouseoverpath.sendKeys(text);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='reg_passwd__']")
	WebElement newpass;
	
	public void newpass1(String text)
	{
		newpass.sendKeys(text);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_month']")
	WebElement month;
	public void month1(String text)
	{
		Select sc=new Select(month);
		sc.selectByVisibleText(text);
	}
	@FindBy(how=How.XPATH,using="//select[@name='birthday_day']")
	WebElement day;
	
	public void day1(String text)
	{
		Select sc=new Select(day);
		sc.selectByVisibleText(text);
	}
	@FindBy(how=How.XPATH,using="//select[@name='birthday_year']")
	WebElement year;
	
	public void year1(String text)
	{
		Select sc= new Select(year);
		sc.selectByVisibleText(text);
	}
	
	@FindBy(how=How.XPATH, using="//span[@class='_5k_3']//span[1]//input[1]")
	WebElement check;
	
	public boolean check1()
	{
		check.click();
		return true;
	}
	
}
