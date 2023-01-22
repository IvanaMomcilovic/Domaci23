package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;
public class InventoryPage extends BaseTest {

    InventoryPage inventoryPage;
    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
        inventoryPage = new InventoryPage(driver, driverWait);
    }

    @BeforeMethod
    public void beforeMethod(){
        super.beforeMethod();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void addtoCartTest(){
        inventoryPage.addtoCart();
        String actualResult = driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains("https://www.saucedemo.com/cart.html"));

        @Test
        public void removeFromCart() {
            inventoryPage.remove();
            String actuallResult = driver.getCurrentUrl();
            Assert.assertTrue(actuallResult.contains("https://www.saucedemo.com/cart.html"));
        }
    }

    }

