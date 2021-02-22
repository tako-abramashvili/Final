package Amazon;

import Amazon.StepObject.ChangeLanguageSteps;
import Amazon.StepObject.SignInSteps;
import Amazon.Utils.ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class SignInTest extends ChromeRunner {

    @Test
    public void SignIn() throws InterruptedException {

        SignInSteps steps = new SignInSteps();
        steps.OpeningHome()
                .PressLogIn()
                .email("testabramashvili@gmail.com")
                .continueProcess()
                .OpenPasswordScreen()
                .password("TestTest123")
                .RequestLogin();


    }
}