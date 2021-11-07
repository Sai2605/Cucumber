package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
  public static WebDriver driver;
	
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		

	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void winmax() 
	{
		driver.manage().window().maximize();

	}
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	public static void printUrl() {
		System.out.println(driver.getCurrentUrl());

	}
	public static void searchButton() {
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		

	} 
	public static void categories() {
		Actions a=new Actions(driver);
		WebElement category = driver.findElement(By.xpath("(//a[text()='Categories'])[1]"));
		a.moveToElement(category).perform();
		

	}
	public static void ctrlV() throws AWTException {
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	
	}
	public static void textBox(String value) {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(value);
			}
	public static void ctrlC() throws AWTException {
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	
	}
	public static void ctrlA() throws AWTException {
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	
	}
	public static void ctrlX() throws AWTException {
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	
	}
	public static void enter() throws AWTException {
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void downArrow(int a) throws AWTException {
		Robot r=new Robot();
		for (int i = 0; i <a; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}}
		public static void upArrow(int a) throws AWTException {
			Robot r=new Robot();
			for (int i = 0; i <a; i++) {
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
				
			}

		}
		public static void tab() throws AWTException {
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);

		}
		public static void scrollUp(WebElement scroll) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguements[0].scrooIntoview(true)",scroll);

		}
		public static void simpleAlert(String url) {
			driver.findElement(By.xpath(url)).click();
			Alert al = driver.switchTo().alert();
			
			al.accept();

		}
		
		public static  void locators() {
			WebElement Architecture = driver.findElement(By.xpath("//a[text()='Architecture']"));
			WebElement Photography = driver.findElement(By.xpath("//a[text()='Arts & Photography']"));
			WebElement Biographies = driver.findElement(By.xpath("//a[text()='Biographies & Memoirs']"));
			WebElement Spirit = driver.findElement(By.xpath("//a[text()='Body, Mind & Spirit']"));
			WebElement Business = driver.findElement(By.xpath("//a[text()='Business & Economics']"));
			WebElement Children = driver.findElement(By.xpath("//a[text()='Children & Teens']"));
			WebElement Computer = driver.findElement(By.xpath("//a[text()='Computer & Internet']"));
			WebElement Food = driver.findElement(By.xpath("//a[text()='Cookery, Food & Wine']"));
			WebElement Dictionaries = driver.findElement(By.xpath("//a[text()='Dictionaries & Language']"));
			WebElement English = driver.findElement(By.xpath("//a[text()='English Language Teaching']"));
			WebElement Geography = driver.findElement(By.xpath("//a[text()='Environment & Geography']"));
			WebElement Fiction = driver.findElement(By.xpath("//a[text()='Fiction']"));
			WebElement History = driver.findElement(By.xpath("//a[text()='History & Humanities']"));
			WebElement Law = driver.findElement(By.xpath("//a[text()='Law']"));
			WebElement LifeStyle = driver.findElement(By.xpath("//a[text()='Lifestyle']"));
			WebElement Literature = driver.findElement(By.xpath("//a[text()='Literature & literary studies']"));
			WebElement Medicine = driver.findElement(By.xpath("//a[text()='Medicine']"));
			WebElement Music = driver.findElement(By.xpath("//a[text()='Music']"));
			WebElement Family = driver.findElement(By.xpath("//a[text()='Parenting, Family & Health']"));
			WebElement Politics = driver.findElement(By.xpath("//a[text()='Politics & Current events']"));
			WebElement References = driver.findElement(By.xpath("//a[text()='References & Encyclopaedias']"));
			WebElement Religion = driver.findElement(By.xpath("//a[text()='Religion & Spirituality']"));
			WebElement Science = driver.findElement(By.xpath("//a[text()='Science & Mathematics']"));
			WebElement SelfHelp = driver.findElement(By.xpath("//a[text()='Self Help & Personal Development']"));
			WebElement Society = driver.findElement(By.xpath("//a[text()='Society & social sciences']"));
			WebElement Sports = driver.findElement(By.xpath("//a[text()='Sports']"));
			WebElement Tech = driver.findElement(By.xpath("//a[text()='Technology & Engineering']"));
			WebElement Travel = driver.findElement(By.xpath("//a[text()='Travel & holiday']"));
			


		}
		

}
