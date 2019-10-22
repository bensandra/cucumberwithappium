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

public class weatherforecast {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        System.out.println("Launching Android Automation Test");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "samsunga7");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("udid", "3300a77ed13953d1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        capabilities.setCapability("appPackage", "com.yarafarmweather.farmweather");
        capabilities.setCapability("appActivity", "org.chromium.chrome.browser.customtabs.CustomTabActivity");

       // capabilities.setCapability("appActivity", "org.chromium.chrome.browser.customtabs.CustomTabActivity");

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

        Thread.sleep(6000);

      
       // driver.closeApp();
       // driver.quit();


    }
}
