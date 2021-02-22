package Amazon;

import Amazon.StepObject.ChangeCurrencySteps;
import Amazon.StepObject.ChangeLanguageSteps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class ChangeCurrencyTest extends ChromeRunner {
    public static void SetUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com");

    }
    @Test
    public void ChanceCurrency () {


        ChangeCurrencySteps steps = new ChangeCurrencySteps();
        steps.hoverFlag()
                .ClickCurrency()
                .ChooseCurrency()
                .ChooseCountry();


    }
}