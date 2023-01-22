package pages;
/* Za prvog usera, na Inventory testirati dodavanje u cart i da li se pojavljuje u cart-u u gornjem desnom uglu broj.
Takodje testirati kada se klikne remove da u cart-u pise 0 se ne pojavljuje span sa brojem.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class InventoryPage extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addtoCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement remove;

    @FindBy(xpath = ("//*[@id=\"shopping_cart_container\"]/a"))
    private WebElement cart;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    private WebElement numberInCart;

    public InventoryPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void addtoCart() {
        addtoCart.click();
    }

    public WebElement getaddtoCart() {
        return addtoCart;
    }

    public WebElement getRemove() {
        return remove;
    }

    public void remove() {
      remove.click();
    }


}
