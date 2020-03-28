package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Regression.regressionTest;


public class testCaseDemo {

	WebDriver driver;
	@Test
	public void tc_01(){
	    
		regressionTest.openBrowser("Chrome");
		regressionTest.openURL("https://www.facebook.com/");
	//Keyword.getWebElement("XPATH", "span[@class='nav-line-2 ']");	
     
	}
	@Test
	public void tc_02(){
		
	    regressionTest.fName("//input[@id='u_0_m']","Priyanka");
	    regressionTest.lName("//input[@id='u_0_o']","Mahajan");
	    regressionTest.email("//input[@id='u_0_r']","priyagujar10@gmail.com");
	    regressionTest.email("//input[@id='u_0_u']","priyagujar10@gmail.com");
	    regressionTest.passWord("//input[@id='u_0_w']","priya9404523380");
	   }
	@Test
	public void tc_03(){
		regressionTest.birthDay("day","9");
		regressionTest.birthMonth("month","Sept");
		regressionTest.birthYear("year","1995");
		}
	@Test
	public void tc_04(){
		regressionTest.selectGender("//input[@id='u_0_6']");
	}
	@Test
	public void tc_05() throws InterruptedException{
		regressionTest.signUp("//button[@id='u_0_13']");
	}
	
	
}
