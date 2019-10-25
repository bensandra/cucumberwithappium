package yaraproject;

	import io.appium.java_client.MobileBy;
    import io.appium.java_client.MobileElement;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.functions.ExpectedCondition;
	import io.appium.java_client.remote.MobileCapabilityType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.List;
    import java.util.Set;

	public class login {

	    public static void main(String[] args) throws InterruptedException, MalformedURLException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        System.out.println("Launching Android Automation Test");
	        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "samsunga7");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        capabilities.setCapability("udid", "3300a77ed13953d1");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
	        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
	        
	        capabilities.setCapability("appPackage", "com.yara.checkit");
	        capabilities.setCapability("appActivity", "com.yara.checkit.SplashActivity");

	        capabilities.setCapability(MobileCapabilityType.ACCEPT_INSECURE_CERTS, true);
	        capabilities.setCapability(MobileCapabilityType.ACCEPT_SSL_CERTS, true);
	        capabilities.setCapability(MobileCapabilityType.SUPPORTS_ALERTS, true);

	        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);

	        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        capabilities.setCapability(MobileCapabilityType.FORCE_MJSONWP, true);

	        capabilities.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
	        capabilities.setCapability(MobileCapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);
	        capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, true);
	        capabilities.setCapability("autoGrantPermissions", true);
	        capabilities.setCapability("autoDismissAlerts", true);
	        capabilities.setCapability("printPageSourceOnFindFailure", true);

	        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	        Thread.sleep(3000);

	        
	        MobileElement continueButton = driver.findElementById("select_country_continueButton");
	        continueButton.click();
	        
	        MobileElement Disclaimer = driver.findElementById("disclaimer_disclaimerText");
	        Disclaimer.click();
	        
	       
	       
	      /* MobileElement elementToClick = (MobileElement) driver
	    		    .findElementByAndroidUIAutomator("new UiScrollable("
	    		        + "new UiSelector().scrollable(true)).scrollIntoView("                      
	    		        + "new UiSelector().textContains(\"Information provided via this Yara App is of a general nature only and is not intended to be nor a substitute for seeking proper advice for cultivating crops.\"));");
	    		elementToClick.click();*/
	       
	     /*  MobileElement elementToClick = (MobileElement) driver
	    		    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
	    		        + ".resourceId(\"com.yara.checkit:id/disclaimer_disclaimerText\")).scrollIntoView("
	    		        + "new UiSelector().text(\"Information provided via this Yara App is of a general nature only and is not intended to be nor a substitute for seeking proper advice for cultivating crops.\"));");
	    		elementToClick.click();
	    		 Thread.sleep(3000);*/
	    		
	       
	       // MobileElement firstName25 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Information provided via this Yara App is of a general nature only and is not intended to be nor a substitute for seeking proper advice for cultivating crops.\"));");
	       // firstName25.click();
	        
	        MobileElement TermsConditions = driver.findElementById("disclaimer_accept_switch");
	        TermsConditions.click();
	        
	        MobileElement Hide = driver.findElementById("disclaimer_hide_switch");
	        Hide.click();
	        
	        MobileElement ContinueButton2 = driver.findElementById("disclaimer_continueButton");
	        ContinueButton2.click();
	        
	        Set<String> contextHandles = driver.getContextHandles();
	        for (String name : contextHandles) {
	            System.out.println("Context View available "+name);
	        }
	        driver.context((String) contextHandles.toArray()[0]);
	        System.out.println("Context After Switching : "+driver.getContext());
	        
	        driver.context("NATIVE_APP");
	        
	        
        
	        MobileElement firstName45 = driver.findElementById("disclaimer_webview");
	        firstName45.click();
	        
	       
	        MobileElement firstName5 = driver.findElementById("disclaimer_accept_switch");
	        firstName5.click();
	        
	        MobileElement firstName6 = driver.findElementById("disclaimer_hide_switch");
	        firstName6.click();
	        
	        MobileElement firstName7 = driver.findElementById("disclaimer_continueButton");
	        firstName7.click();
	        
	        MobileElement firstName8 = driver.findElementById("help_RightArrow");
	        firstName8.click();
	        
	        MobileElement firstName9 = driver.findElementById("help_RightArrow");
	        firstName9.click();
	        
	        MobileElement firstName10 = driver.findElementById("help_continueButton");
	        firstName10.click();
	      
	        
	     /*   List<MobileElement> elements = driver.findElementsByClassName("android.widget.Button");
	        for (MobileElement num : elements)
	        {
	            System.out.println(num.getText());
	        }*/
	        driver.closeApp();
	        driver.quit();


	    }
	}
