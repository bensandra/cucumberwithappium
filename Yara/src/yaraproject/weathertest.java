package yaraproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.Test;

public class weathertest {
	
	@Test
	public void  launch() throws MalformedURLException, InterruptedException
	
	{
		        //Set the Desired Capabilities
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("deviceName", "samsunga7");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("platformVersion", "7");
				capabilities.setCapability("udid", "3300a77ed13953d1");
				capabilities.setCapability("noReset", "false");
				capabilities.setCapability("browserName", "chrome");
				
			
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				driver.navigate().to("https://app.yarafaraweather.com");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				Thread.sleep(10000);
				driver.quit();
	}
	
}
