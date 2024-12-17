package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.BaseDriverClass;
import io.appium.java_client.AppiumDriver;  
public class LoginPageClass extends BaseDriverClass{

   
    @FindBy(xpath = "//android.widget.EditText")   private WebElement EmailTxtField;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]") private WebElement ClickOnContinue;
    @FindBy(xpath = "//android.widget.EditText")  private WebElement PasswordTxtField;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Sign In']")  private WebElement ClickOnSignIn;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")private WebElement AllowNotification;

    public LoginPageClass(AppiumDriver driver) {
        PageFactory.initElements(driver, this);  
    }

    public void Login() throws InterruptedException {

    	WaitUntilVisibilityOfElement(EmailTxtField);
 
    	EmailTxtField.click();
    	EmailTxtField.sendKeys(prop.getProperty("Email"));
        System.out.println("Email id entered Successfully");
        
      
        WaitUntilVisibilityOfElement(ClickOnContinue);
        ClickOnContinue.click();
        
        WaitUntilVisibilityOfElement(PasswordTxtField);
        PasswordTxtField.click();
        PasswordTxtField.sendKeys(prop.getProperty("Password"));
        System.out.println("Password entered Successfully");

         WaitUntilVisibilityOfElement(ClickOnSignIn);
         ClickOnSignIn.click();
         WaitUntilVisibilityOfElement(AllowNotification);
         AllowNotification.click();
         System.out.println("Login Successfully");
         Thread.sleep(6000);
        


    }
}
