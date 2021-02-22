package Amazon;

import Amazon.StepObject.ChangeCurrencySteps;
import Amazon.StepObject.Covid19Steps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class CovidTest extends ChromeRunner {



        @Test
        public void Covid19() {
            Configuration.browser = "chrome";
            Configuration.baseUrl = "https://www.amazon.com";
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            Configuration.startMaximized = true;

            Selenide.open("https://www.amazon.com");


            Covid19Steps steps = new Covid19Steps();
            steps.OpenList().ChooseHelp().CovidInfo();

        }
}
