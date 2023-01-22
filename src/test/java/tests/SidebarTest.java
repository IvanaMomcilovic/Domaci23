package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SidebarPage;

import java.time.Duration;
public class SidebarTest extends BaseTest{
       SidebarPage sidebarPage;
    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
        sidebarPage = new SidebarPage(driver, driverWait);
    }

    @BeforeMethod
    public void beforeMethod(){
        }

    @Test
    public void logout(){
        sidebarPage.logout();
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains("https://www.saucedemo.com/"));
    }

}
