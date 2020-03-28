package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class regressionTest {

	private static WebDriver driver;
	 
	  public static void openBrowser(String browserName){
		switch(browserName){
		case("Chrome"):
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
			break;
		case("Firefox"):
			WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 break;
		 default:
			 System.out.println("invalid browserName:"+browserName);
		}
	  }
	  /*
	   * This method is used to open URL.
	   * Enter URL
	   */
		public static void openURL(String url){
			 driver.get(url);
			 driver.manage().window().maximize();
			 
		}
		
		
		/**
		 * Below methods are used to send info which required.
		 * @param Fname
		 */
		public static void fName(String locator,String Fname){
			driver.findElement(By.xpath(locator)).sendKeys(Fname);
			
		}
		public static void lName(String locator,String Lname){
			driver.findElement(By.xpath(locator)).sendKeys(Lname);
		}

		public static void email(String locator,String email){
			driver.findElement(By.xpath(locator)).sendKeys(email);
		}
		public static void passWord(String locator,String pw){
			driver.findElement(By.xpath(locator)).sendKeys(pw);
		}
		
		public static void birthDay(String locator,String value){
			Select day=new Select(driver.findElement(By.id(locator)));
			day.selectByValue(value);
		}
			public static void birthMonth(String locator,String value){
			Select month=new Select(driver.findElement(By.id(locator)));
			month.selectByVisibleText(value);
			
			}
			public static void birthYear(String locator,String value){
			Select year=new Select(driver.findElement(By.id(locator)));
			year.selectByValue(value);
			
		}
			public static void selectGender(String locator){
				driver.findElement(By.xpath(locator)).click();
			}
			public static void signUp(String locator) throws InterruptedException{
				driver.findElement(By.xpath(locator)).click();
				Thread.sleep(8000);
				
				driver.quit();
			}
}
