package Amazon;

import Amazon.StepObject.ChangeLanguageSteps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class ChangeLanguageTest extends ChromeRunner {
    {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com");

    }

    @Test
    public void ChangeLanguage() throws InterruptedException {

        ChangeLanguageSteps steps = new ChangeLanguageSteps();
        steps.HomeScreen().ChangeScreenView().DataSaving();


    }

}
