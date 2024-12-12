package BaseDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseDriverClass {

    public static AppiumDriver driver;  
	public static Properties prop;

    
    
    public static void LaunchZielApp() throws InterruptedException, IOException, URISyntaxException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "35111FDH2008RX");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "ai.zeil.android");
        cap.setCapability("appActivity", "ai.zeil.zeil.MainActivity");
       

        URI uri = new URI("http://127.0.0.1:4723");
        URL serverURL = uri.toURL();  

         driver = new AndroidDriver(serverURL, cap);
   
        System.out.println("App has been Successfully launched");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\config.properties");
		prop.load(ip);
    }
    
    public void WaitUntilVisibilityOfElement(WebElement ele) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
    
    

    





//rushi added new comment through git hub

	
}
