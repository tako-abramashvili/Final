package Amazon.StepObject;

import Amazon.PageObject.ChangeCurrency;
import Amazon.PageObject.ChangeLanguage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.testng.asserts.Assertion;

public class ChangeCurrencySteps extends ChangeCurrency {
    {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com");

    }
    @Step("hover on flag to change currency")
    public ChangeCurrencySteps hoverFlag() {
        flagIcon.hover();
        return this;
    }
    @Step("hover on flag to change currency")
    public ChangeCurrencySteps ClickCurrency() {
        currency.click();
        Assertions.assertEquals("Language Settings",checkLanguageChangeHeader.getText());
        return this;
    }

    @Step("hover on flag to change currency")
    public ChangeCurrencySteps ChooseCurrency() {
        emirates.click();
        return this;

    }
    @Step("hover on flag to change currency")
    public ChangeCurrencySteps ChooseCountry() {
        saveData.click();
        return this;


    }


}


