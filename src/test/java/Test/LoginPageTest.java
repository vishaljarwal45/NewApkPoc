package Test;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseDriver.BaseDriverClass;
import Pages.LoginPageClass;

public class LoginPageTest extends BaseDriverClass {

    private LoginPageClass login;

       @BeforeClass
       public void LaunchApp() throws InterruptedException, IOException, URISyntaxException {
    	BaseDriverClass.LaunchZielApp();  
       }

    @Test
    public void LoginZeil() throws InterruptedException {
    	login = new LoginPageClass(driver);  
    	login.Login(); 
    }

    @AfterClass
    public void CloseApp() {
        driver.quit(); 
    }
}
