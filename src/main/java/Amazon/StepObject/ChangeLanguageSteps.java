package Amazon.StepObject;
import Amazon.DataObject.SignInData;

import Amazon.PageObject.ChangeLanguage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;


public class ChangeLanguageSteps extends ChangeLanguage {

    @Step("click on the flag to change language")
    public ChangeLanguageSteps HomeScreen() {
        flagIcon.click();
        return this;
    }

    @Step("Choose language")
    public ChangeLanguageSteps ChangeScreenView()  {
        portuge.waitUntil(Condition.visible,3000).click();
        Assertions.assertEquals("Language Settings",checkLanguageChangeHeader.getText());
        return this;
    }

    @Step("click on save button to save data")
    public ChangeLanguageSteps DataSaving() {
        saveData.click();
        return this;


    }
}

