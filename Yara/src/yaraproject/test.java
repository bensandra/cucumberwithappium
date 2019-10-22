package yaraproject;

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

	public class test {

	    public static void main(String[] args) throws InterruptedException, MalformedURLException {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        System.out.println("Launching Android Automation Test");
	        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "samsunga7");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        capabilities.setCapability("udid", "3300a77ed13953d1");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
	        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//	        capabilities.setCapability("appPackage", "io.appium.android.apis");
//	        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	        capabilities.setCapability("appPackage", "com.intel.ark");
	        capabilities.setCapability("appActivity", "md58521540578d907bef00b773de90ade75.LaunchActivity");

//	        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
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

	        Thread.sleep(60);

	        MobileElement settings_Icon = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"SettingsButtonId\"]/android.view.ViewGroup/android.widget.ImageView");
	        settings_Icon.click();
	        Thread.sleep(3000);

	        MobileElement profile = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ProfileId\"]/android.view.ViewGroup[2]/android.widget.TextView");

	        profile.click();

	        Thread.sleep(3000);

	        MobileElement signUp = driver.findElementByXPath("//android.widget.Button[@content-desc=\"SignUpId\"]");
	        signUp.click();
	        Thread.sleep(3000);
//	        WebDriverWait wait = new WebDriverWait(driver,30);
	        MobileElement firstName = driver.findElementByAccessibilityId("FirstNameEntryId");
//	        wait.until(ExpectedConditions.visibilityOf(firstName));

	        firstName.sendKeys("Rakesh");

	        driver.findElementByAccessibilityId("CountryPickerId").click();

	        MobileElement first_Country= driver.findElementByXPath("//android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button");
	        first_Country.click();
	        Thread.sleep(3000);

	        MobileElement selected_country = driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.EditText");
	        System.out.println("The country selected in dropdown "+selected_country.getText());

	        String xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button[2]";
	        MobileElement element1 = driver.findElementByXPath(xpath);
	        System.out.println("New Country to be select "+element1.getText());

	        while(!selected_country.getText().equalsIgnoreCase("Angola")){
	            element1.click();
	            Thread.sleep(2000);
	            System.out.println(element1.getText());
	        }

	        List<MobileElement> elements = driver.findElementsByClassName("android.widget.Button");
	        for (MobileElement num : elements)
	        {
	            System.out.println(num.getText());
	        }
	        driver.closeApp();
	        driver.quit();


	    }
	}
