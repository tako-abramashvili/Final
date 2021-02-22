package Amazon;

import Amazon.StepObject.ChangeCurrencySteps;
import Amazon.StepObject.ChangeLanguageSteps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class ChangeCurrencyTest extends ChromeRunner {
    @Test
    public void ChanceCurrency() {

        ChangeCurrencySteps steps = new ChangeCurrencySteps();
        steps.hoverFlag()
                .ClickCurrency()
                .ChooseCurrency()
                .ChooseCountry();
    }
}