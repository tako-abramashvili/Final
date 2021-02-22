package Amazon.StepObject;

import Amazon.PageObject.Cart;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class CartSteps extends Cart {
    { Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com"); }


    @Step("open cart screen")
    public CartSteps openCart() {
        cartIcon.click();
        Assertions.assertEquals("Today's Deals",checkText.getText());
        return this;
    }

    @Step("returning on home screen")
    public CartSteps returnHome () {
        logo.click();
        return this;
    }


    }