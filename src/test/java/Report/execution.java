package Report;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class execution extends browserdetails{
	
	public ExtentReports Report;
	@BeforeTest
	public void reporting()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
		Reporter.config().setDocumentTitle("FacebookTest");
		Reporter.config().setReportName("AutomationTest");
		Report=new ExtentReports();
		Report.attachReporter(Reporter);
		Report.setSystemInfo("Tester", "SAIFUL");
		Report.setSystemInfo("Tester1", "MUKUL");
		
	}
	
	@Test(dataProvider="getdata")
	public void mukul(String text, String text1, String text2,String text3,String text4,String text5,String text6) throws IOException
	{
		ExtentTest test=Report.createTest("FACEBOOK");
		driver=browser();
		driver.get(prob.getProperty("url"));
		test.pass("URL INVOKE SUCCESSFULLY");
		driver.manage().window().maximize();
		test.pass("WIN MAXIMIZE SUCCESSFULLY");
		
		pageone po=new pageone(driver);
		po.FirstName1(text);
		test.pass("PUTTING FIRST NAME SUCCESSFULLY");
		po.lastname1(text1);
		test.pass("PUTTING LAST NAME SUCCESSFULLY");
		po.mouseover1();
		test.pass("MOUSE OVER SUCCESSFULLY");
		po.mobilenumber(text2);
		test.pass("PUTTING PHONE NUMBER SUCCESSFULLY");
		po.newpass1(text3);
		test.pass("PUTTING NEW PASSWORD SUCCESSFULLY");
		po.month1(text4);
		test.pass("PUTTING MONTH SUCCESSFULLY");
		po.day1(text5);
		test.pass("PUTTING DAY SUCCESSFULLY");
		po.year1(text6);
		test.pass("PUTTING YEAR SUCCESSFULLY");
		if(po.check1())
		{
			test.pass("CLICK ON CHECKBOX SUCCESSFULLY");	
		}
		else
		{
			test.fail("DID NOT CLICK ON CHECKBOX");
		}
		
		
		driver.close();
		test.pass("DRIVER CLOSE SUCCESSFULLY");
		Report.flush();
	}
	@Test
	public void yahoo() throws IOException
	{
		ExtentTest test=Report.createTest("YAHOO");
		driver=browser();
		
		driver.get(prob.getProperty("url1"));
		test.pass("URL LOUNCED SUCCESSFULLY");		
		driver.manage().window().maximize();
		test.pass("WIN MAXIMIZE SUCCESSFULLY");
		driver.close();
		test.pass("DRIVER CLOSE SUCCESSFULLY");
		Report.flush();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][7];
		data[0][0]="DINAR";
		data[0][1]="PASA";
		data[0][2]="987655432";
		data[0][3]="thimhu87";
		data[0][4]="Jun";
		data[0][5]="20";
		data[0][6]="1988";
		
		data[1][0]="MINAR";
		data[1][1]="KASA";
		data[1][2]="123456789";
		data[1][3]="thimhu98";
		data[1][4]="Apr";
		data[1][5]="21";
		data[1][6]="1975";
		
		return data;
	}
	
	
	
	

}
