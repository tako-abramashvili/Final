package Amazon;

import Amazon.StepObject.CartSteps;
import Amazon.StepObject.ChangeCurrencySteps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class CartTest extends ChromeRunner {
    @Test
    public void Cart() {
        CartSteps steps = new CartSteps();
        steps.openCart().returnHome();
    }
}
