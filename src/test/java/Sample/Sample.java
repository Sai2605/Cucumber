package Sample;

import org.openqa.selenium.By;

public class Sample extends BaseClass{
	
	public static void main(String[] args) {
		
		launchChrome();
		loadUrl("https://www.uread.com/");
		winmax();
		printTitle();
		categories();
		driver.findElement(By.xpath("//a[text()='Children & Teens']")).click();
		
	}

}
