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

	public class bewakoof {

	    public static void main(String[] args) throws InterruptedException, MalformedURLException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        System.out.println("Launching Android Automation Test");
	        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "samsunga7");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        capabilities.setCapability("udid", "3300a77ed13953d1");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
	        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
	        
	        capabilities.setCapability("appPackage", "com.bewakoof.bewakoof");
	        capabilities.setCapability("appActivity", "com.bewakoof.bewakoof.MainActivity");
	       //com.bewakoof.bewakoof.MenWomenActivity
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

	        MobileElement continueButton = driver.findElementById("com.bewakoof.bewakoof:id/txtWoMen");
	        continueButton.click();
	        
	        Thread.sleep(3000);
	        MobileElement designoftheday = driver.findElementById("com.bewakoof.bewakoof:id/relImgItem");
	        designoftheday.click();
	        
	        Thread.sleep(3000);
	        MobileElement redwomenshirt =driver.findElementById("com.bewakoof.bewakoof:id/product_grid_imageitem");
	        redwomenshirt.click();
	        
	        Thread.sleep(3000);
	        
	        MobileElement redwomenshirtstar =driver.findElementById("com.bewakoof.bewakoof:id/wishlistIcon");
	        redwomenshirtstar.click();
	        
	        Thread.sleep(3000);
	        MobileElement signup =driver.findElementById("com.bewakoof.bewakoof:id/txtsignup");
	        signup.click();
	        
	        Thread.sleep(3000);
	        MobileElement signupwithmobilenumber =driver.findElementById("com.bewakoof.bewakoof:id/txt_signup_manually");
	        signupwithmobilenumber.click();
	        
	        Thread.sleep(3000);
	        
	        MobileElement firstName =driver.findElementById("com.bewakoof.bewakoof:id/id_firstname");
	        firstName.clear();	        
	        firstName.sendKeys("ben");
	        
	        MobileElement lastName =driver.findElementById("com.bewakoof.bewakoof:id/id_lastname");
	        lastName.clear();
	        lastName.sendKeys("sandra");
	        
	        MobileElement mobilenumber =driver.findElementById("com.bewakoof.bewakoof:id/id_contact");
	        mobilenumber.clear();
	        mobilenumber.sendKeys("9080570153");
	        
	        MobileElement emailid =driver.findElementById("com.bewakoof.bewakoof:id/id_new_email");
	        emailid.clear();
	        emailid.sendKeys("bensandra278@gmail.com");
	        
	        MobileElement password =driver.findElementById("com.bewakoof.bewakoof:id/id_newpassword");
	        password.clear();
	        password.sendKeys("Doodleblue@123");
	        
	        MobileElement female =driver.findElementById("com.bewakoof.bewakoof:id/femaleradio");
	        female.click();
	        
	        MobileElement signup1 =driver.findElementById("com.bewakoof.bewakoof:id/btnRegister");
	        signup1.click();
	        
	        MobileElement otp =driver.findElementById("com.bewakoof.bewakoof:id/btn_mobile");
	        otp.click();
	        Thread.sleep(5000);
	        
	        MobileElement enterotp =driver.findElementById("com.bewakoof.bewakoof:id/edt_otp");
	        enterotp.clear();
	        enterotp.sendKeys("123456");
	        
	        MobileElement verifyotp =driver.findElementById("com.bewakoof.bewakoof:id/btn_otp");
	        verifyotp.click();      
	        
	       // driver.closeApp();
	       // driver.quit();


	    }
	}

