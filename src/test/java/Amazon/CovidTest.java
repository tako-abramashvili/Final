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

            Covid19Steps steps = new Covid19Steps();
            steps.OpenList().ChooseHelp().CovidInfo();

        }
}
