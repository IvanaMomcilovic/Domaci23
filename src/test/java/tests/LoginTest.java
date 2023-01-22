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

import java.time.Duration;

public class LoginTest extends BaseTest{

    @Test
    public void loginValidDataTest(){
        loginPage.login("standard_user", "secret_sauce");

        String actualLink = driver.getCurrentUrl();
        Assert.assertTrue(actualLink.contains("inventory.html"));

        driver.navigate().refresh();

        actualLink = driver.getCurrentUrl();
        Assert.assertTrue(actualLink.contains("inventory.html"));
    }

    @Test
    public void loginInvalidDataTest(){
        loginPage.login("locked_out_user", "secret_sauce");

        String actualLink = driver.getCurrentUrl();
        Assert.assertTrue(actualLink.contains("inventory.html"));

        driver.navigate().refresh();

        actualLink = driver.getCurrentUrl();
        Assert.assertTrue(actualLink.contains("inventory.html"));
    }
}
