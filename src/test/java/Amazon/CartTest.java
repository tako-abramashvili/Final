package Amazon;

import Amazon.StepObject.CartSteps;
import Amazon.StepObject.ChangeCurrencySteps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class CartTest extends ChromeRunner {
    public static void Setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com");
    }

    @Test
    public void Cart() {
        CartSteps steps = new CartSteps();
        steps.openCart().returnHome();
    }
}
