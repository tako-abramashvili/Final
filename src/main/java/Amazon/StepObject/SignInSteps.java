package Amazon.StepObject;

import Amazon.DataObject.SignInData;
import Amazon.PageObject.SignIn;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class SignInSteps extends SignIn {
    {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com");

    }

    String email1 = "Testabramashvili@gmail.com",
            password1 = "TestTest123";


    @Step("click on login icon")
    public SignInSteps PressLogIn() {
        Sign.click();
        return this;
    }



    @Step("Landing on Sign in screen ")
    public SignInSteps OpeningHome() {
        emailField.click();
        return this;
    }

    @Step("Email value")
    public SignInSteps email (String email1) {
        emailField.shouldNotBe(Condition.empty);
        emailField.setValue(email1);
        return this;
    }

    @Step("Continue flow ")
    public SignInSteps continueProcess() {
        next.click();
        return this;
    }

    @Step("Landing on password screen ")
    public SignInSteps OpenPasswordScreen() {
        password.click();
        return this;
    }
    @Step("password enter")
    public SignInSteps password(String password1) {
        password.shouldNotBe(Condition.empty);
        password.setValue(password1);
        return this;
    }

    @Step("Landing on Signup screen ")
    public SignInSteps RequestLogin() {
        login.click();
        return this;
    }


}