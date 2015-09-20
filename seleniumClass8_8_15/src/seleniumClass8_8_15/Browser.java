package seleniumClass8_8_15;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser 
{

	public static void main(String[] args) throws InterruptedException
	{

	
		FirefoxDriver dr = new FirefoxDriver();
		Thread.sleep(4000);
		dr.get("http://www.facebook.com");
		Thread.sleep(4000);
		dr.quit();
				
		
		
		
		
		

	}

}
