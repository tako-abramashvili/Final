package Amazon.StepObject;

import Amazon.PageObject.Covid19;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class Covid19Steps extends Covid19 {

    public static void SetUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com");

    }

    @Step("")
    public Covid19Steps OpenList() {
        AllList.click();
        return this;
    }


    @Step("")
    public Covid19Steps ChooseHelp() {
        HelpButton.click();
        return this;
    }


    @Step("")
    public Covid19Steps CovidInfo() {
        Covid.click();
        return this;
    }

}
